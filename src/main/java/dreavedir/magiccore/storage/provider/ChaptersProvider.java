package dreavedir.magiccore.storage.provider;

import dreavedir.magiccore.chapters.IChapters;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ChaptersProvider implements ICapabilitySerializable<NBTBase> {

    @CapabilityInject(IChapters.class)
    public static final Capability<IChapters> CHAPTERS_CAPABILITY = null;

    private IChapters instance = CHAPTERS_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CHAPTERS_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == CHAPTERS_CAPABILITY ? CHAPTERS_CAPABILITY.cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return CHAPTERS_CAPABILITY.getStorage().writeNBT(CHAPTERS_CAPABILITY, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        CHAPTERS_CAPABILITY.getStorage().readNBT(CHAPTERS_CAPABILITY, this.instance, null, nbt);
    }
}
