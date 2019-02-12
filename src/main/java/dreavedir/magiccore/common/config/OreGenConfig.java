package dreavedir.magiccore.common.config;

import net.minecraftforge.common.config.Config;

public class OreGenConfig {
    //TODO every ore in subclass
    @Config.Name("Magic Heart Ore: generate rate")
    public int GEN_RATE_MAGIC_HEART_ORE = 7;

    @Config.Name("Magic Heart Ore: minimum height of generation")
    public int GEN_MIN_HEIGHT_MAGIC_HEART_ORE = 12;

    @Config.Name("Magic Heart Ore: maximum height of generation")
    public int GEN_MAX_HEIGHT_MAGIC_HEART_ORE = 20;

    @Config.Name("Magic Heart Ore: amount of ore generation")
    public int GEN_AMOUNT_MAGIC_HEART_ORE = 3;
}
