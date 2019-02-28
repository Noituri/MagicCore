package dreavedir.magiccore.items.EodenorsBook;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.utils.GuiEnums;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static dreavedir.magiccore.MagicCore.MODID;

public class ItemEodenorsBook extends Item {

    public ItemEodenorsBook() {
        setRegistryName(new ResourceLocation(MODID, "eodenors_book"));
        setTranslationKey(MODID + ".eodenors_book");
        setCreativeTab(MagicCore.tabMagicCore);
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(worldIn.isRemote) {
            MagicCore.proxy.openGui(GuiEnums.GUITYPE.EODENORS_BOOK);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
