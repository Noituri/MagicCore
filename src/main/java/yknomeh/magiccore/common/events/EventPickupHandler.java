package yknomeh.magiccore.common.events;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import yknomeh.magiccore.MagicCore;

public class EventPickupHandler {

    public static EventPickupHandler instance = new EventPickupHandler();
    //Just for debugging
    boolean did_player_get_mhs = false;

    @SubscribeEvent
    public void onPickupItem(EntityItemPickupEvent event) {

        switch (event.getItem().getItem().getUnlocalizedName()) {
            case "item.magiccore.magic_heart_shard":
                if (!did_player_get_mhs) {
                    MagicCore.logger.info("Player picked up \"Magic Heart Shard\" for the first time!");
                    did_player_get_mhs = true;
                }
                break;
        }
    }

}
