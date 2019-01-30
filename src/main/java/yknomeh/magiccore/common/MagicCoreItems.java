package yknomeh.magiccore.common;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yknomeh.magiccore.common.items.ItemMagicHeartShard;

import static yknomeh.magiccore.common.utils.ItemsNames.MAGIC_HEART_SHARD;

public class MagicCoreItems {

    @ObjectHolder(MAGIC_HEART_SHARD)
    public static ItemMagicHeartShard itemMagicHeartShard;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemMagicHeartShard.initModel();
    }

}
