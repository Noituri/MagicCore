package dreavedir.magiccore.common.config;

import dreavedir.magiccore.MagicCore;
import net.minecraftforge.common.config.Config;

@Config(modid = MagicCore.MODID, category = "items", name = "Items")
public class ItemsConfig {
//    EODENOR'S BOOK
    @Config.Comment("Eodenor's book: drop rate")
    public static int DROP_RATE_EODEONRS_BOOK = 16;
}
