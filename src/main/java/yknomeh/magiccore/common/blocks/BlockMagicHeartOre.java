package yknomeh.magiccore.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yknomeh.magiccore.MagicCore;

import static yknomeh.magiccore.MagicCore.MODID;
import static yknomeh.magiccore.MagicCore.tabMagicCore;

public class BlockMagicHeartOre extends Block {

    public static final ResourceLocation RL_MAGIC_HEART_ORE = new ResourceLocation(MODID, "magic_heart_ore");

    public BlockMagicHeartOre() {
        super(Material.ROCK);
        setRegistryName(RL_MAGIC_HEART_ORE);
        setUnlocalizedName(MODID + ".magic_heart_ore");
        setHardness(2);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(tabMagicCore);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
