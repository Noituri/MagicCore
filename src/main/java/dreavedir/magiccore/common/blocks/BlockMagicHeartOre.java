package dreavedir.magiccore.common.blocks;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.common.MagicCoreItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockMagicHeartOre extends Block {

    public BlockMagicHeartOre() {
        super(Material.ROCK);
        setRegistryName(new ResourceLocation(MagicCore.MODID, "magic_heart_ore"));
        setTranslationKey(MagicCore.MODID + ".magic_heart_ore");
        setHardness(2);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MagicCore.tabMagicCore);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return MagicCoreItems.itemMagicHeartShard;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
