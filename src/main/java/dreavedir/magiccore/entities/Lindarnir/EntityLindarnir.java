package dreavedir.magiccore.entities.Lindarnir;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.network.Messages;
import dreavedir.magiccore.network.PacketParticleEntityLindarnir;
import dreavedir.magiccore.utils.Dimensions;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;
import java.util.UUID;

public class EntityLindarnir extends EntityCreature {

    private World worldIn;
    private UUID ownerID = null;
    private boolean isHurt = false;

    public EntityLindarnir(World worldIn) {
        super(worldIn);
        this.worldIn = worldIn;
        this.setSize(0.6F, 1.95F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new LindarnirAIFollow(this, 0.5D, 8.0F, 2));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldIn.isRemote && ticksExisted%10==0) {
            double motionX = rand.nextGaussian() * 0.02D;
            double motionY = rand.nextGaussian() * 0.02D;
            double motionZ = rand.nextGaussian() * 0.02D;
            worldIn.spawnParticle(
                    EnumParticleTypes.FIREWORKS_SPARK,
                    posX + rand.nextFloat() * width * 2.0F - width,
                    posY + 0.5D + rand.nextFloat() * height,
                    posZ + rand.nextFloat() * width * 2.0F - width,
                    motionX,
                    motionY,
                    motionZ);
        }

        if (isHurt) {
            NetworkRegistry.TargetPoint target = new NetworkRegistry.TargetPoint(world.provider.getDimension(), this.posX + 0.6D, this.posY + 1.95D, this.posZ + 0.6D, 20D);
            Messages.INSTANCE.sendToAllAround(new PacketParticleEntityLindarnir(posX, posY, posZ), target);
            isHurt = false;
        }
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    @Nullable
    public UUID getOwnerId() {
        return this.ownerID;
    }

    public void setOwnerID(UUID ownerID) {
        this.ownerID = ownerID;
    }

    public void setHurt(boolean hurt) {
        isHurt = hurt;
    }
}
