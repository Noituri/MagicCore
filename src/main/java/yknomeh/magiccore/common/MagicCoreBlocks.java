package yknomeh.magiccore.common;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yknomeh.magiccore.common.blocks.BlockMagicHeartOre;

import static yknomeh.magiccore.common.utils.BlocksNames.MAGIC_HEART_ORE;

public class MagicCoreBlocks {

    @ObjectHolder(MAGIC_HEART_ORE)
    public static BlockMagicHeartOre blockMagicHeartOre;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockMagicHeartOre.initModel();
    }
}
