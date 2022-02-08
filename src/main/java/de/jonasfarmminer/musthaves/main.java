package de.jonasfarmminer.musthaves;

import de.jonasfarmminer.musthaves.commands.cords;
import de.jonasfarmminer.musthaves.listeners.ChatListener;
import de.jonasfarmminer.musthaves.listeners.JoinListener;
import de.jonasfarmminer.musthaves.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class main extends JavaPlugin implements Listener {

    public config config;
    @Override
    public void onEnable() {;
        this.config = new config();
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "MustHaves" + ChatColor.GRAY + "- by JonasFarmminer");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Enabled Successfully");
        Bukkit.getConsoleSender().sendMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Register events
        PluginManager pm = Bukkit.getServer().getPluginManager();

        pm.registerEvents(new JoinListener(),this);
        pm.registerEvents(new QuitListener(),this);
        pm.registerEvents(new ChatListener(),this);

        //Register commands
        getCommand("cords").setExecutor(new cords());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "MustHaves" + ChatColor.GRAY + "- by JonasFarmminer");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Disabled Successfully");
        Bukkit.getConsoleSender().sendMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
