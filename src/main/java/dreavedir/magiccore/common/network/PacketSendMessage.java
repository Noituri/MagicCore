package dreavedir.magiccore.common.network;

import dreavedir.magiccore.common.events.OverlayRenderHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketSendMessage implements IMessage {
    private String message = "";
    private String submessage = "";
    private int time = 1;
    private int scaleX = 1;
    private int scaleY = 1;
    private int scaleZ = 1;

    public PacketSendMessage() {}

    public PacketSendMessage(String message, String submessage, int time, int scaleX, int scaleY, int scaleZ) {
        this.message = message;
        this.time = time;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.scaleZ = scaleZ;
        this.submessage = submessage;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        message = ByteBufUtils.readUTF8String(buf);
        submessage = ByteBufUtils.readUTF8String(buf);
        time = buf.readInt();
        scaleX = buf.readInt();
        scaleY = buf.readInt();
        scaleZ = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, message);
        ByteBufUtils.writeUTF8String(buf, submessage);
        buf.writeInt(time);
        buf.writeInt(scaleX);
        buf.writeInt(scaleY);
        buf.writeInt(scaleZ);
    }

    public static class Handler implements IMessageHandler<PacketSendMessage, IMessage> {
        @Override
        public IMessage onMessage(PacketSendMessage message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> handle(message, ctx));
            return null;
        }

        private void handle(PacketSendMessage message, MessageContext ctx) {
            OverlayRenderHandler.instance.showMessage(message.message, message.submessage, message.time, message.scaleX, message.scaleY, message.scaleZ);
        }
    }
}
