package dreavedir.magiccore.common.events;

import com.mojang.realmsclient.gui.ChatFormatting;
import dreavedir.magiccore.common.MagicCoreItems;
import dreavedir.magiccore.common.network.PacketSendMessage;
import dreavedir.magiccore.common.network.Messages;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.Random;

public class EventHandler {

    public static EventHandler instance = new EventHandler();

    //Just for debugging
    ArrayList<String> players = new ArrayList();

    @SubscribeEvent
    public void onPickupItem(EntityItemPickupEvent event) {

        EntityPlayer player =  event.getEntityPlayer();

        switch (event.getItem().getItem().getUnlocalizedName()) {
            case "item.magiccore.magic_heart_shard":
                if (!players.contains(player.getDisplayNameString())) {
                    if (!player.getEntityWorld().isRemote)
                        Messages.INSTANCE.sendTo(new PacketSendMessage("Chapter I", "Beginning of new adventure", 500, 2, 2, 1), (EntityPlayerMP) player);
                    player.sendMessage(new TextComponentTranslation(ChatFormatting.DARK_GREEN + "When you picked up Magic Heart Shard you started to feel power surge. You don't know what happened but you feel in your gut that this is beginning of new adventure."));
                    players.add(player.getDisplayNameString());
                }
                break;
        }
    }

    @SubscribeEvent
    public void onHarvestBlock(HarvestDropsEvent event) {
        Block block = event.getState().getBlock();

        switch (block.getUnlocalizedName()) {
            case "tile.bookshelf":
                Random random = new Random();

                if (random.nextInt(16) == 1) {
                    // Todo create special book
                    event.getDrops().add(new ItemStack(MagicCoreItems.itemEodenorsBook));
                }

                break;
        }
    }

}
