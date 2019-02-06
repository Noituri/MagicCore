package dreavedir.magiccore.common;

import com.google.common.util.concurrent.ListenableFuture;
import dreavedir.magiccore.common.blocks.BlockMagicHeartOre;
import dreavedir.magiccore.common.chapters.Chapters;
import dreavedir.magiccore.common.chapters.IChapters;
import dreavedir.magiccore.common.events.CapabilityEventHandler;
import dreavedir.magiccore.common.items.ItemEodenorsBook;
import dreavedir.magiccore.common.network.Messages;
import dreavedir.magiccore.common.storage.ChaptersStorage;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import dreavedir.magiccore.common.events.EventHandler;
import dreavedir.magiccore.common.items.ItemMagicHeartShard;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static dreavedir.magiccore.MagicCore.MODID;

@EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Messages.registerMessages(MODID);
        MinecraftForge.EVENT_BUS.register(CapabilityEventHandler.instance);
        MinecraftForge.EVENT_BUS.register(EventHandler.instance);
        GameRegistry.registerWorldGenerator(WorldGen.INSTANCE, 4);
    }

    public void init(FMLInitializationEvent event) {
        CapabilityManager.INSTANCE.register(IChapters.class, new ChaptersStorage(), Chapters.class);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new BlockMagicHeartOre()
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(MagicCoreBlocks.blockMagicHeartOre).setRegistryName(MagicCoreBlocks.blockMagicHeartOre.getRegistryName()),
                new ItemMagicHeartShard(),
                new ItemEodenorsBook()
        );
    }

}
