package dreavedir.magiccore.common.gui.overlay;

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
        drawCenteredString(mc.fontRenderer, message, (width / 2) / scaleX, ((height / 2) - 25 * scaleY) / scaleY, Integer.parseInt("0b9902", 16));
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glScalef(scaleX / 2, scaleY / 2, scaleZ);
        drawCenteredString(mc.fontRenderer, submessage, (width / 2) / (scaleX / 2), (((height / 2) - (25 * ( scaleY / 2) ))) / (int)((float) scaleY / 2), Integer.parseInt("0b9902", 16));
        GL11.glPopMatrix();
    }

}
