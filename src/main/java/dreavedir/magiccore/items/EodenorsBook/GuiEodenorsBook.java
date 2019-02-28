package dreavedir.magiccore.items.EodenorsBook;

import dreavedir.magiccore.MagicCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiEodenorsBook extends GuiScreen {
    private int id = 0;

    private final static int PAGES = 2;
    private static ResourceLocation[] textures_book = new ResourceLocation[PAGES];
    private int currentPage = 0;

    private NextPageButton prevBtn;
    private NextPageButton nextBtn;

    public GuiEodenorsBook() {
        textures_book[0] = new ResourceLocation(MagicCore.MODID + ":textures/gui/eodenors_book_cover.png");
        textures_book[1] = new ResourceLocation(MagicCore.MODID + ":textures/gui/eodenors_book_page.png");
        //TODO split it into categories (chapters)

    }

    @Override
    public void initGui() {
        buttonList.clear();
        Keyboard.enableRepeatEvents(true);

        int offset = (width - 192) / 2;

        prevBtn = new NextPageButton(1, offset + 120, 156, false);
        nextBtn = new NextPageButton(1, offset + 120, 156, true);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        //TODO make screen darker when gui opened
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        if(currentPage == 0) {
            mc.getTextureManager().bindTexture(textures_book[0]);
        } else {
            mc.getTextureManager().bindTexture(textures_book[1]);
        }

        int offset = (width - 192) / 2;

        drawTexturedModalRect(offset, height / 2 - 192 / 2, 0, 0, 192, 192);

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton {
        private final boolean isNextButton;

        public NextPageButton(int parButtonId, int parPosX, int parPosY, boolean parIsNextButton) {
            super(parButtonId, parPosX, parPosY, 23, 13, "");
            isNextButton = parIsNextButton;
        }

        @Override
        public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            if (visible) {
                boolean isButtonPressed = (mouseX >= x && mouseY >= y && mouseX < x + width && mouseY < y + height);

                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(textures_book[1]);

                int textureX = 0;
                int textureY = 192;

                if (isButtonPressed) {
                    textureX += 23;
                }

                if (!isNextButton) {
                    textureY += 13;
                }

                drawTexturedModalRect(x, y, textureX, textureY, 23, 13);
            }
        }
    }
}
