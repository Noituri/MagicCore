package yknomeh.magiccore.common.events;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import yknomeh.magiccore.MagicCore;

import java.util.ArrayList;

public class EventPickupHandler {

    public static EventPickupHandler instance = new EventPickupHandler();
    //Just for debugging
    ArrayList<String> players = new ArrayList();

    @SubscribeEvent
    public void onPickupItem(EntityItemPickupEvent event) {

        EntityPlayer player =  event.getEntityPlayer();

        switch (event.getItem().getItem().getUnlocalizedName()) {
            case "item.magiccore.magic_heart_shard":
                if (!players.contains(player.getDisplayNameString())) {
                    player.sendMessage(new TextComponentTranslation(ChatFormatting.DARK_GREEN + "When you picked up Magic Heart Shard you started to feel power surge. You don't know what happened but you feel in your gut that this is beginning of new adventure."));
                    players.add(player.getDisplayNameString());
                }
                break;
        }
    }

}
