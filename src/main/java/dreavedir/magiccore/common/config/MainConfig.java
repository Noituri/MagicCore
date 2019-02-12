package dreavedir.magiccore.common.config;

import net.minecraftforge.common.config.Config;

public class MainConfig {

    @Config.Name("Mana lost after death")
    public boolean MANA_LOST_AFTER_DEATH = false;

    @Config.Name("Theme color")
    public String THEME_COLOR = "0b9902";

    @Config.Name("Sub color")
    public String SUB_COLOR = ""; // TODO Chatformmating.<color> CHAT

    //TODO HUD pos & size
}
