package dreavedir.magiccore.common;

import dreavedir.magiccore.common.items.ItemEodenorsBook;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import dreavedir.magiccore.common.items.ItemMagicHeartShard;

import static dreavedir.magiccore.common.utils.ItemsNames.EADENORS_BOOK;
import static dreavedir.magiccore.common.utils.ItemsNames.MAGIC_HEART_SHARD;

public class MagicCoreItems {

    @ObjectHolder(MAGIC_HEART_SHARD)
    public static ItemMagicHeartShard itemMagicHeartShard;

    @ObjectHolder(EADENORS_BOOK)
    public static ItemEodenorsBook itemEodenorsBook;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemMagicHeartShard.initModel();
        itemEodenorsBook.initModel();
    }

}
