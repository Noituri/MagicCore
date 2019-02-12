package dreavedir.magiccore.common.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID, category = "main", name = "Main Options")
public class ModConfig {

//    MANA
    @Config.Comment("Mana: lost mana after death")
    public static boolean MANA_LOST_AFTER_DEATH = false;

//    COLORS
    @Config.Comment("COLORS: theme color")
    public static String THEME_COLOR = "0b9902";
    public static String SUB_COLOR = ""; // TODO Chatformmating.<color> CHAT

    //TODO HUD pos & size
}
