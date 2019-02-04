package dreavedir.magiccore.common.items;

import dreavedir.magiccore.MagicCore;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicHeartShard extends Item {

    public ItemMagicHeartShard() {
        setRegistryName(new ResourceLocation(MagicCore.MODID, "magic_heart_shard"));
        setUnlocalizedName(MagicCore.MODID + ".magic_heart_shard");
        setCreativeTab(MagicCore.tabMagicCore);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
