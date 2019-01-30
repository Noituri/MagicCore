package yknomeh.magiccore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import yknomeh.magiccore.common.CommonProxy;
import yknomeh.magiccore.common.MagicCoreBlocks;

@Mod(modid = MagicCore.MODID, name = MagicCore.NAME, version = MagicCore.VERSION)
public class MagicCore
{

    public static final String MODID = "magiccore";
    public static final String NAME = "Magic Core";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "yknomeh.magiccore.client.ClientProxy", serverSide = "yknomeh.magiccore.common.CommonProxy")
    public static CommonProxy proxy;

    @Instance(MODID)
    public static MagicCore instance;

    public static Logger logger;

    public static CreativeTabs tabMagicCore = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(MagicCoreBlocks.blockMagicHeartOre);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("PreInit is starting");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Initializing is starting");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("PostInit is starting");
        proxy.postInit(event);
    }
}
