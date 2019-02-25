package dreavedir.magiccore.network;

import dreavedir.magiccore.MagicCore;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Random;

public class PacketParticleEntityLindarnir implements IMessage {
    private double x, y ,z;

    public PacketParticleEntityLindarnir() {}

    public PacketParticleEntityLindarnir(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        x = buf.readDouble();
        y = buf.readDouble();
        z = buf.readDouble();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeDouble(x);
        buf.writeDouble(y);
        buf.writeDouble(z);
    }

    public static class Handler implements IMessageHandler<PacketParticleEntityLindarnir, IMessage> {
        @Override
        public IMessage onMessage(PacketParticleEntityLindarnir message, MessageContext ctx) {
            Minecraft minecraft = Minecraft.getMinecraft();
            final WorldClient world = minecraft.world;
            minecraft.addScheduledTask(() -> handle(message, world));
            return null;
        }

        private void handle(PacketParticleEntityLindarnir message, WorldClient world) {
            Random rand = new Random();
            for (int i = 0; i < 50; i++) {
                double motionX = rand.nextGaussian() * 0.02D;
                double motionY = rand.nextGaussian() * 0.02D;
                double motionZ = rand.nextGaussian() * 0.02D;

                world.spawnParticle(
                        EnumParticleTypes.SPELL_MOB,
                        message.x + rand.nextFloat() * 0.6F * 2.0F - 0.6F,
                        message.y + 0.5D + rand.nextFloat() * 1.95F,
                        message.z + rand.nextFloat() * 0.6F * 2.0F - 0.6F,
                        motionX,
                        motionY,
                        motionZ
                );
            }
        }
    }
}
