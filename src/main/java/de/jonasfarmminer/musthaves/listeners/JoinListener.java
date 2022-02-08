package de.jonasfarmminer.musthaves.listeners;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.DARK_GRAY + "§l[" + ChatColor.GREEN + "§l+" + ChatColor.DARK_GRAY + "§l]" + " " + ChatColor.GRAY + player.getName());
    }

}
