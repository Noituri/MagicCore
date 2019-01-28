package yknomeh.magiccore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import yknomeh.magiccore.common.CommonProxy;

@Mod(modid = MagicCore.MODID, name = MagicCore.NAME, version = MagicCore.VERSION)
public class MagicCore
{
    @Instance("magiccore")
    public static MagicCore instance;

    @SidedProxy(clientSide = "yknomeh.magiccore.client.ClientProxy", serverSide = "yknomeh.magiccore.common.CommonProxy")
    public static CommonProxy proxy;

    public static final String MODID = "magiccore";
    public static final String NAME = "Magic Core";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("-=Magic-Core=- Initialized");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
