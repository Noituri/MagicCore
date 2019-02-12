package dreavedir.magiccore.common.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID, category = "oregen", name = "Ores")
public class OreGenConfig {
    //    MAGIC HEART ORE
    @Config.Comment("Magic Heart Ore: generate rate")
    public static int GEN_RATE_MAGIC_HEART_ORE = 7;

    @Config.Comment("Magic Heart Ore: minimum height of generation")
    public static int GEN_MIN_HEIGHT_MAGIC_HEART_ORE = 12;

    @Config.Comment("Magic Heart Ore: maximum height of generation")
    public static int GEN_MAX_HEIGHT_MAGIC_HEART_ORE = 20;

    @Config.Comment("Magic Heart Ore: amount of ore generation")
    public static int GEN_AMOUNT_MAGIC_HEART_ORE = 3;
}
