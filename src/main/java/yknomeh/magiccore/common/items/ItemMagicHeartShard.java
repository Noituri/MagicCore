package yknomeh.magiccore.common.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static yknomeh.magiccore.MagicCore.MODID;
import static yknomeh.magiccore.MagicCore.tabMagicCore;

public class ItemMagicHeartShard extends Item {

    public ItemMagicHeartShard() {
        setRegistryName(new ResourceLocation(MODID, "magic_heart_shard"));
        setUnlocalizedName(MODID + ".magic_heart_shard");
        setCreativeTab(tabMagicCore);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
