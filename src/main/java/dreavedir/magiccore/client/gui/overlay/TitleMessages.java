package dreavedir.magiccore.client.gui.overlay;

import dreavedir.magiccore.MagicCore;
import dreavedir.magiccore.common.config.ModConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class TitleMessages extends Gui {

    public TitleMessages(Minecraft mc, String message, String submessage, int time, int tick, float partialTicks, int scaleX, int scaleY, int scaleZ) {
        ScaledResolution scaledResolution = new ScaledResolution(mc);

        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();

        time -= tick;

        if (time > 0) {

            float f2 = (float) time - partialTicks;
            int l1 = (int) (f2 * 255.0F / 20.0F);
            int color = Integer.parseInt(ModConfig.mainConfig.THEME_COLOR, 16);

            if (l1 > 255) {
                l1 = 255;
            }

            if (l1 > 8) {

                    //TODO idk I am tired. I'll make this animation later...

//                if (tick < time / 2)
//                    height += easeOut(tick, 0, scaledResolution.getScaledHeight(), time / 2);
//                else height += easeOut(time / 2, 0, scaledResolution.getScaledHeight(), time / 2);

                // Title
                GL11.glPushMatrix();
                GL11.glScalef(scaleX, scaleY ,scaleZ);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                mc.fontRenderer.drawStringWithShadow(message, (width / 2) / scaleX - mc.fontRenderer.getStringWidth(message) / 2, ((height / 2) - 25 * scaleY) / scaleY, color + (l1 << 24 & -color));
                GlStateManager.disableBlend();
                GL11.glPopMatrix();

                // Subtitle
                GL11.glPushMatrix();
                GL11.glScalef(scaleX / 2, scaleY / 2, scaleZ);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                mc.fontRenderer.drawStringWithShadow(submessage, (width / 2) / (scaleX / 2) - mc.fontRenderer.getStringWidth(submessage) / 2, ((height / 2) - (25 * (scaleY / 2) )) / (int)((float) scaleY / 2),  color + (l1 << 24 & -color));
                GlStateManager.disableBlend();
                GL11.glPopMatrix();
            }

        }

    }

    // Credits to jesusgollonet
    public float easeOut(float t,float b , float c, float d) {
        if ((t/=d) < (1/2.75f)) {
            return c*(7.5625f*t*t) + b;
        } else if (t < (2/2.75f)) {
            return c*(7.5625f*(t-=(1.5f/2.75f))*t + .75f) + b;
        } else if (t < (2.5/2.75)) {
            return c*(7.5625f*(t-=(2.25f/2.75f))*t + .9375f) + b;
        } else {
            return c*(7.5625f*(t-=(2.625f/2.75f))*t + .984375f) + b;
        }
    }

}
