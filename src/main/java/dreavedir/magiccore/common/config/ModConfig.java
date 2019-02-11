package dreavedir.magiccore.common.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID)
public class ModConfig {
//    EODENOR'S BOOK
    @Config.Comment("Eodenor's book: drop rate")
    public static int DROP_RATE_EODEONRS_BOOK = 16;

//    MAGIC HEART ORE
    @Config.Comment("Magic Heart Ore: generate rate")
    public static int GEN_RATE_MAGIC_HEART_ORE = 7;

    @Config.Comment("Magic Heart Ore: minimum height of generation")
    public static int GEN_MIN_HEIGHT_MAGIC_HEART_ORE = 12;

    @Config.Comment("Magic Heart Ore: maximum height of generation")
    public static int GEN_MAX_HEIGHT_MAGIC_HEART_ORE = 20;

    @Config.Comment("Magic Heart Ore: amount of ore generation")
    public static int GEN_AMOUNT_MAGIC_HEART_ORE = 3;

//    MANA
    @Config.Comment("Mana: lost mana after death")
    public static boolean MANA_LOST_AFTER_DEATH = false;

//    COLORS
    @Config.Comment("COLORS: theme color")
    public static String THEME_COLOR = "0b9902";
    public static String SUB_COLOR = ""; // TODO Chatformmating.<color> CHAT

    //TODO HUD pos & size
}
