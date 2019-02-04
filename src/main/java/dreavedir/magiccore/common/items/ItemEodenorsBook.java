package dreavedir.magiccore.common.items;

import dreavedir.magiccore.MagicCore;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSimpleFoiled;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static dreavedir.magiccore.MagicCore.MODID;

public class ItemEodenorsBook extends ItemSimpleFoiled {

    public ItemEodenorsBook() {
        setRegistryName(new ResourceLocation(MODID, "eodenors_book"));
        setUnlocalizedName(MODID + ".eodenors_book");
        setCreativeTab(MagicCore.tabMagicCore);
        setMaxStackSize(1);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
