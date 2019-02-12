package dreavedir.magiccore.common.events;

import com.mojang.realmsclient.gui.ChatFormatting;
import dreavedir.magiccore.common.MagicCoreItems;
import dreavedir.magiccore.common.chapters.IChapters;
import dreavedir.magiccore.common.config.ItemsConfig;
import dreavedir.magiccore.common.network.PacketSendMessage;
import dreavedir.magiccore.common.network.Messages;
import dreavedir.magiccore.common.storage.provider.ChaptersProvider;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class EventHandler {

    public static EventHandler instance = new EventHandler();

    @SubscribeEvent
    public void onPickupItem(EntityItemPickupEvent event) {

        EntityPlayer player =  event.getEntityPlayer();
        if (player == null) return;
        if (player.getEntityWorld().isRemote) return;

        IChapters chapters = player.getCapability(ChaptersProvider.CHAPTERS_CAPABILITY, null);

        switch (event.getItem().getItem().getTranslationKey()) {
            case "item.magiccore.magic_heart_shard":
                if (chapters.getCurrentChapter() == 0) {
                    Messages.INSTANCE.sendTo(new PacketSendMessage("Chapter I", "Beginning of new adventure", 100, 2, 2, 1), (EntityPlayerMP) player);
                    player.sendMessage(new TextComponentTranslation(ChatFormatting.DARK_GREEN + "When you picked up Magic Heart Shard you started to feel power surge. You don't know what happened but you feel in your gut that this is beginning of new adventure."));
                    chapters.setCurrentChapter(1);
                }
                break;
        }
    }

    @SubscribeEvent
    public void onHarvestBlock(HarvestDropsEvent event) {
        EntityPlayer player =  event.getHarvester();
        if (player == null) return;
        if (player.getEntityWorld().isRemote) return;

        IChapters chapters = player.getCapability(ChaptersProvider.CHAPTERS_CAPABILITY, null);

        Block block = event.getState().getBlock();

        switch (block.getTranslationKey()) {
            case "tile.bookshelf":
                if (chapters.getCurrentChapter() == 0) break;
                Random random = new Random();

                if (random.nextInt(ItemsConfig.DROP_RATE_EODEONRS_BOOK) == 1) {
                    event.getDrops().add(new ItemStack(MagicCoreItems.itemEodenorsBook));
                }

                break;
        }
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event) {
        EntityPlayer player = event.getEntityPlayer();
        if (player == null) return;
        IChapters chapters = player.getCapability(ChaptersProvider.CHAPTERS_CAPABILITY, null);
        IChapters oldChapters = event.getOriginal().getCapability(ChaptersProvider.CHAPTERS_CAPABILITY, null);

        chapters.setCurrentChapter(oldChapters.getCurrentChapter());
    }

}
