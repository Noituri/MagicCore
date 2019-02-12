package dreavedir.magiccore.common.storage.provider;

import dreavedir.magiccore.common.chapters.IChapters;
import dreavedir.magiccore.common.entities.Lindarnir.ILindarnir;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LindarnirProvider implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(ILindarnir.class)
    public static final Capability<ILindarnir> ILANDIR_CAPABILITY = null;

    private ILindarnir instance = ILANDIR_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == ILANDIR_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == ILANDIR_CAPABILITY ? ILANDIR_CAPABILITY.cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return ILANDIR_CAPABILITY.getStorage().writeNBT(ILANDIR_CAPABILITY, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        ILANDIR_CAPABILITY.getStorage().readNBT(ILANDIR_CAPABILITY, this.instance, null, nbt);
    }
}
