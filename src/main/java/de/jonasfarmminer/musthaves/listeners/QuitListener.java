package de.jonasfarmminer.musthaves.listeners;

import de.jonasfarmminer.musthaves.main;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.io.File;
import java.io.IOException;

public class QuitListener implements Listener {
    private main plugin;

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        File f = new File(plugin.getDataFolder(), "quitsave.yml");
        Player player = event.getPlayer();
        YamlConfiguration config = YamlConfiguration.loadConfiguration(f);
        config.set(player.getDisplayName().toUpperCase() + ".world", player.getLocation().getWorld().getName());
        config.set(player.getDisplayName() + ".x", player.getLocation().getX());
        config.set(player.getDisplayName() + ".y", player.getLocation().getY());
        config.set(player.getDisplayName() + ".z", player.getLocation().getZ());
        config.set(player.getDisplayName() + ".yaw", player.getLocation().getYaw());
        config.set(player.getDisplayName() + ".pitch", player.getLocation().getPitch());
        try {
            config.save(f);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        event.setQuitMessage(ChatColor.DARK_GRAY + "§l[" + ChatColor.RED + "§l-" + ChatColor.DARK_GRAY + "§l]" + " " + ChatColor.GRAY + player.getName());
    }
}
