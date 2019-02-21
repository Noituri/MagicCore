package dreavedir.magiccore.entities.Lindarnir;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.utils.Dimensions;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import javax.annotation.Nullable;
import java.util.UUID;

public class EntityLindarnir extends EntityCreature {

    private World worldIn;
    private UUID ownerID = null;

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
}
