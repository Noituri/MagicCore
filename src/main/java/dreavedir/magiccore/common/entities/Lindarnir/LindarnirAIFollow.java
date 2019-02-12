package dreavedir.magiccore.common.entities.Lindarnir;

import dreavedir.magiccore.common.storage.provider.LindarnirProvider;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class LindarnirAIFollow extends EntityAIBase {
    private final EntityLindarnir entityLindarnir;
    private Entity owner;
    World world;
    private final double followSpeed;
    private final PathNavigate petPathfinder;
    private int timeToRecalcPath;
    float maxDist;
    float minDist;
    private float oldWaterCost;

    public LindarnirAIFollow(EntityLindarnir entityLindarnir, double followSpeedIn, float minDistIn, float maxDistIn) {
        this.entityLindarnir = entityLindarnir;
        this.world = entityLindarnir.world;
        this.followSpeed = followSpeedIn;
        this.petPathfinder = entityLindarnir.getNavigator();
        this.minDist = minDistIn;
        this.maxDist = maxDistIn;
        this.setMutexBits(3);

        if (!(entityLindarnir.getNavigator() instanceof PathNavigateGround) && !(entityLindarnir.getNavigator() instanceof PathNavigateFlying)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute() {
        ILindarnir iLindarnir = entityLindarnir.getCapability(LindarnirProvider.ILANDIR_CAPABILITY, null);
        Entity entitylivingbase = iLindarnir.getOwnerUUID() != null ? world.getPlayerEntityByUUID(iLindarnir.getOwnerUUID()) : null;

        if (entitylivingbase == null) {
            return false;
        } else if (entitylivingbase instanceof EntityPlayer && ((EntityPlayer) entitylivingbase).isSpectator()) {
            return false;
        } else if (this.entityLindarnir.getDistanceSq(entitylivingbase) < (double) (this.minDist * this.minDist)) {
            return false;
        } else {
            this.owner = entitylivingbase;
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting() {
        return !this.petPathfinder.noPath() && this.entityLindarnir.getDistanceSq(this.owner) > (double) (this.maxDist * this.maxDist);
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        this.timeToRecalcPath = 0;
        this.oldWaterCost = this.entityLindarnir.getPathPriority(PathNodeType.WATER);
        this.entityLindarnir.setPathPriority(PathNodeType.WATER, 0.0F);
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask() {
        this.owner = null;
        this.petPathfinder.clearPath();
        this.entityLindarnir.setPathPriority(PathNodeType.WATER, this.oldWaterCost);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask() {
        this.entityLindarnir.getLookHelper().setLookPositionWithEntity(this.owner, 10.0F, (float) this.entityLindarnir.getVerticalFaceSpeed());


        if (--this.timeToRecalcPath <= 0) {
            this.timeToRecalcPath = 10;

            if (!this.petPathfinder.tryMoveToEntityLiving(this.owner, this.followSpeed)) {
                if (!this.entityLindarnir.getLeashed() && !this.entityLindarnir.isRiding()) {
                    if (this.entityLindarnir.getDistanceSq(this.owner) >= 144.0D) {
                        int i = MathHelper.floor(this.owner.posX) - 2;
                        int j = MathHelper.floor(this.owner.posZ) - 2;
                        int k = MathHelper.floor(this.owner.getEntityBoundingBox().minY);

                        for (int l = 0; l <= 4; ++l) {
                            for (int i1 = 0; i1 <= 4; ++i1) {
                                if ((l < 1 || i1 < 1 || l > 3 || i1 > 3) && this.isTeleportFriendlyBlock(i, j, k, l, i1)) {
                                    this.entityLindarnir.setLocationAndAngles((double) ((float) (i + l) + 0.5F), (double) k, (double) ((float) (j + i1) + 0.5F), this.entityLindarnir.rotationYaw, this.entityLindarnir.rotationPitch);
                                    this.petPathfinder.clearPath();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    protected boolean isTeleportFriendlyBlock(int x, int z, int y, int xOffset, int zOffset) {
        BlockPos blockpos = new BlockPos(x + xOffset, y - 1, z + zOffset);
        IBlockState iblockstate = this.world.getBlockState(blockpos);
        return iblockstate.getBlockFaceShape(this.world, blockpos, EnumFacing.DOWN) == BlockFaceShape.SOLID && iblockstate.canEntitySpawn(this.entityLindarnir) && this.world.isAirBlock(blockpos.up()) && this.world.isAirBlock(blockpos.up(2));
    }
}