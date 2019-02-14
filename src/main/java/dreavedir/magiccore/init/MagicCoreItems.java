package dreavedir.magiccore.init;

import dreavedir.magiccore.items.ItemEodenorsBook;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import dreavedir.magiccore.items.ItemMagicHeartShard;

import static dreavedir.magiccore.utils.ItemsNames.*;

public class MagicCoreItems {

    @ObjectHolder(MAGIC_HEART_SHARD)
    public static ItemMagicHeartShard itemMagicHeartShard;

    @ObjectHolder(EODENORS_BOOK)
    public static ItemEodenorsBook itemEodenorsBook;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemMagicHeartShard.initModel();
        itemEodenorsBook.initModel();
    }

}
