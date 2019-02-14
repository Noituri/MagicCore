package dreavedir.magiccore.storage;

import dreavedir.magiccore.chapters.IChapters;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class ChaptersStorage implements Capability.IStorage<IChapters> {
    @Nullable
    @Override
    public NBTBase writeNBT(Capability<IChapters> capability, IChapters instance, EnumFacing side) {
        return new NBTTagInt(instance.getCurrentChapter());
    }

    @Override
    public void readNBT(Capability<IChapters> capability, IChapters instance, EnumFacing side, NBTBase nbt) {
        instance.setCurrentChapter(((NBTPrimitive) nbt).getInt());
    }
}
