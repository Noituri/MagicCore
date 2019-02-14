package dreavedir.magiccore.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID, category = "main")
public class ModConfig {

    @Config.Name("Main Settings")
    public static MainConfig mainConfig = new MainConfig();

    @Config.Name("Items Settings")
    public static ItemsConfig itemsConfig = new ItemsConfig();

    @Config.Name("Ore Settings")
    public static OreGenConfig oreGenConfig = new OreGenConfig();

}
