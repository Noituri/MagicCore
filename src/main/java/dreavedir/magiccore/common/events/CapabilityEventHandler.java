package dreavedir.magiccore.common.events;

import dreavedir.magiccore.common.entities.Lindarnir.EntityLindarnir;
import dreavedir.magiccore.common.storage.provider.ChaptersProvider;
import dreavedir.magiccore.common.storage.provider.LindarnirProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static dreavedir.magiccore.MagicCore.MODID;

public class CapabilityEventHandler {
    public static CapabilityEventHandler instance = new CapabilityEventHandler();

    public static final ResourceLocation CHAPTERS_RESOURCE_LOCATION = new ResourceLocation(MODID, "chapters");
    public static final ResourceLocation LINDARNIR_RESOURCE_LOCATION = new ResourceLocation(MODID, "lindarnir");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer)
            event.addCapability(CHAPTERS_RESOURCE_LOCATION, new ChaptersProvider());
        
        if (event.getObject() instanceof EntityLindarnir)
            event.addCapability(LINDARNIR_RESOURCE_LOCATION, new LindarnirProvider());
    }

}
