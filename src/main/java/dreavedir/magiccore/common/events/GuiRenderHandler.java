package dreavedir.magiccore.common.events;

import dreavedir.magiccore.common.gui.GuiMessages;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiRenderHandler {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE)
            return;

        new GuiMessages(Minecraft.getMinecraft());
    }
}
