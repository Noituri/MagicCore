package dreavedir.magiccore.common.events;

import dreavedir.magiccore.common.storage.provider.ChaptersProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static dreavedir.magiccore.MagicCore.MODID;

public class CapabilityEventHandler {
    public static CapabilityEventHandler instance = new CapabilityEventHandler();

    public static final ResourceLocation RESOURCE_LOCATION = new ResourceLocation(MODID, "chapters");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (!(event.getObject() instanceof EntityPlayer)) return;

        event.addCapability(RESOURCE_LOCATION, new ChaptersProvider());
    }

}
