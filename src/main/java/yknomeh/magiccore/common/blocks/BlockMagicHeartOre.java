package yknomeh.magiccore.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import yknomeh.magiccore.MagicCore;

import static yknomeh.magiccore.MagicCore.MODID;
import static yknomeh.magiccore.MagicCore.tabMagicCore;

public class BlockMagicHeartOre extends Block {

    public static final ResourceLocation RL_MAGIC_HEART_ORE = new ResourceLocation(MODID, "magic_heart_ore");

    public BlockMagicHeartOre() {
        super(Material.ROCK);
        setRegistryName(RL_MAGIC_HEART_ORE);
        setUnlocalizedName(MODID + ".magic_heart_ore");
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(tabMagicCore);
    }

}
