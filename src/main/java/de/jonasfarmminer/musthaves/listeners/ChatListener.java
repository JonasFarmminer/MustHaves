package de.jonasfarmminer.musthaves.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChatMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();

        if (player.getDisplayName().equals("JonasFarmminer")) {
            event.setFormat(ChatColor.RED + ChatColor.BOLD.toString() + "RedStone" + "" + " §l§8| " + ChatColor.GRAY + player.getDisplayName() + " §8>> " + ChatColor.WHITE + message);
        }
        if (player.getDisplayName().equals("JakobFarmminer")) {
            event.setFormat(ChatColor.GREEN + ChatColor.BOLD.toString() + "Farms" + "" + " §l§8| " + ChatColor.GRAY + player.getDisplayName() + " §8>> " + ChatColor.WHITE + message);
        }
        if (player.getDisplayName().equals("LukeFarmminer")) {
            event.setFormat(ChatColor.GRAY + ChatColor.BOLD.toString() + "Armorer" + "" + " §l§8| " + ChatColor.GRAY + player.getDisplayName() + " §8>> " + ChatColor.WHITE + message);
        }
    }
}
