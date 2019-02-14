package dreavedir.magiccore.proxies;

import dreavedir.magiccore.init.MagicCoreBlocks;
import dreavedir.magiccore.init.MagicCoreEntities;
import dreavedir.magiccore.blocks.BlockMagicHeartOre;
import dreavedir.magiccore.chapters.Chapters;
import dreavedir.magiccore.chapters.IChapters;
import dreavedir.magiccore.entities.Lindarnir.ILindarnir;
import dreavedir.magiccore.entities.Lindarnir.LindarnirDefaults;
import dreavedir.magiccore.events.CapabilityEventHandler;
import dreavedir.magiccore.items.ItemEodenorsBook;
import dreavedir.magiccore.network.Messages;
import dreavedir.magiccore.storage.ChaptersStorage;
import dreavedir.magiccore.storage.LindarnirStorage;
import dreavedir.magiccore.worldgen.WorldGen;
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
import dreavedir.magiccore.events.EventHandler;
import dreavedir.magiccore.items.ItemMagicHeartShard;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static dreavedir.magiccore.MagicCore.MODID;

@EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Messages.registerMessages(MODID);
        MinecraftForge.EVENT_BUS.register(CapabilityEventHandler.instance);
        MinecraftForge.EVENT_BUS.register(EventHandler.instance);
        GameRegistry.registerWorldGenerator(WorldGen.INSTANCE, 4);
        MagicCoreEntities.init();
    }

    public void init(FMLInitializationEvent event) {
        CapabilityManager.INSTANCE.register(IChapters.class, new ChaptersStorage(), Chapters.class);
        CapabilityManager.INSTANCE.register(ILindarnir.class, new LindarnirStorage(), LindarnirDefaults.class);
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
