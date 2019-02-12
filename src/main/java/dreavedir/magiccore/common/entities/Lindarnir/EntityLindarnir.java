package dreavedir.magiccore.common.entities.Lindarnir;

import dreavedir.magiccore.common.utils.Dimensions;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class EntityLindarnir extends EntityCreature implements IEntityOwnable {

    private World worldIn;
    private UUID ownerID = null;
    private Entity owner = null;

    public EntityLindarnir(World worldIn) {
        super(worldIn);
        this.worldIn = worldIn;
        this.setSize(0.6F, 1.95F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new LindarnirAIFollow(this, 0.5D, 10.0F, 2));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.getBlockPathWeight(new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ)) >= 0.0F && this.worldIn.provider.getDimension() == Dimensions.OVERWORLD;
    }

    @Nullable
    @Override
    public UUID getOwnerId() {
        return this.ownerID;
    }

    @Nullable
    @Override
    public Entity getOwner() {
        return this.owner;
    }

    public void setOwnerID(UUID ownerID) {
        this.ownerID = ownerID;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }
}
