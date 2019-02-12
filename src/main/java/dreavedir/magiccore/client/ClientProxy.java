package dreavedir.magiccore.client;

import dreavedir.magiccore.common.MagicCoreBlocks;
import dreavedir.magiccore.common.MagicCoreEntities;
import dreavedir.magiccore.common.MagicCoreItems;
import dreavedir.magiccore.common.events.OverlayRenderHandler;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import dreavedir.magiccore.common.CommonProxy;

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

}
