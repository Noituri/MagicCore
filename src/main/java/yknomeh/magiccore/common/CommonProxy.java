package yknomeh.magiccore.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import yknomeh.magiccore.common.blocks.BlockMagicHeartOre;
import yknomeh.magiccore.common.events.EventPickupHandler;
import yknomeh.magiccore.common.items.ItemMagicHeartShard;

import static yknomeh.magiccore.common.MagicCoreBlocks.blockMagicHeartOre;

@EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(EventPickupHandler.instance);
    }

    public void init(FMLInitializationEvent event) {

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
                new ItemBlock(blockMagicHeartOre).setRegistryName(blockMagicHeartOre.getRegistryName()),
                new ItemMagicHeartShard()
        );
    }

}
