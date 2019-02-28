package dreavedir.magiccore.proxies;

import dreavedir.magiccore.init.MagicCoreBlocks;
import dreavedir.magiccore.init.MagicCoreEntities;
import dreavedir.magiccore.init.MagicCoreItems;
import dreavedir.magiccore.events.OverlayRenderHandler;
import dreavedir.magiccore.items.EodenorsBook.GuiEodenorsBook;
import dreavedir.magiccore.utils.GuiEnums;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        MinecraftForge.EVENT_BUS.register(OverlayRenderHandler.instance);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        MagicCoreBlocks.initModels();
        MagicCoreItems.initModels();
        MagicCoreEntities.initModels();
    }

    @Override
    public void openGui(GuiEnums.GUITYPE which) {
        switch (which) {
            case EODENORS_BOOK:
                Minecraft.getMinecraft().displayGuiScreen(new GuiEodenorsBook());
        }
    }
}
