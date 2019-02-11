package dreavedir.magiccore.common.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID)
public class ModConfig {
    @Config.Comment("Eodenor's book")
    public static int DROP_RATE_EODEONRS_BOOK = 16;

    @Config.Comment("Magic Heart Ore")
    public static int GEN_RATE_MAGIC_HEART_ORE = 7;
    public static int GEN_MIN_HEIGHT_MAGIC_HEART_ORE = 12;
    public static int GEN_MAX_HEIGHT_MAGIC_HEART_ORE = 20;
    public static int GEN_AMOUNT_MAGIC_HEART_ORE = 3;

    @Config.Comment("Mana")
    public static boolean MANA_LOST_AFTER_DEATH = false;

    //TODO HUD pos & size
}
