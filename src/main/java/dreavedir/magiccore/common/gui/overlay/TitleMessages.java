package dreavedir.magiccore.common.gui.overlay;

import dreavedir.magiccore.MagicCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL11;

public class TitleMessages extends Gui {

    public TitleMessages(Minecraft mc, String message, String submessage, int time, int scaleX, int scaleY, int scaleZ) {
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();

        GL11.glPushMatrix();
        GL11.glScalef(scaleX, scaleY ,scaleZ);
        drawCenteredString(mc.fontRenderer, message, (width / 2) / scaleX, ((height / 2) - 50) / scaleY, Integer.parseInt("0b9902", 16));
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glScalef((float) scaleX / 2, (float) scaleY / 2, scaleZ);
        drawCenteredString(mc.fontRenderer, submessage, (width / 2) / (int)((float) scaleX / 2), ((height / 2) - 30) / (int)((float) scaleY / 2), Integer.parseInt("0b9902", 16));
        GL11.glPopMatrix();
    }

}
