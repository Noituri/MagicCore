package dreavedir.magiccore.common.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiMessages extends Gui {

    public GuiMessages(Minecraft mc) {
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();

        drawCenteredString(mc.fontRenderer, "Chapter 1", width / 2, (height / 2) - 4, Integer.parseInt("0b9902", 16));
    }
}
