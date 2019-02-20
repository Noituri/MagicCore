package dreavedir.magiccore.events;

import dreavedir.magiccore.gui.overlay.TitleMessages;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class OverlayRenderHandler {

    public static OverlayRenderHandler instance = new OverlayRenderHandler();

    private String message = "";
    private String submessage = "";
    private int time = 1;
    private int scaleX = 1;
    private int scaleY = 1;
    private int scaleZ = 1;

    private int tick = 0;

    public void showMessage(String message, String submessage, int time, int scaleX, int scaleY, int scaleZ) {
        this.message = message;
        this.time = time;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.scaleZ = scaleZ;
        this.submessage = submessage;

        tick = 0;
    }

    @SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event) {
        if (event.getType() != RenderGameOverlayEvent.ElementType.EXPERIENCE )
            return;

        if (tick < time) {
            new TitleMessages(Minecraft.getMinecraft(), message, submessage, time, tick, event.getPartialTicks(), scaleX, scaleY, scaleZ);
        }
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        tick++;
    }
}
