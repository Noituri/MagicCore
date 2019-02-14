package dreavedir.magiccore.storage;

import dreavedir.magiccore.entities.Lindarnir.capability.ILindarnir;
import net.minecraft.nbt.*;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;
import java.util.UUID;

public class LindarnirStorage implements Capability.IStorage<ILindarnir> {
    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ILindarnir> capability, ILindarnir instance, EnumFacing side) {
        return new NBTTagString((instance.getOwnerUUID().toString()));
    }

    @Override
    public void readNBT(Capability<ILindarnir> capability, ILindarnir instance, EnumFacing side, NBTBase nbt) {
        instance.setOwnerUID(UUID.fromString(((NBTTagString) nbt).getString()));
    }
}
