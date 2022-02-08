package de.jonasfarmminer.musthaves.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cords implements CommandExecutor {

    @Override
    public boolean onCommand( CommandSender sender, Command cmd, String label,String[] args ) {
        Player s = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("cords")) {



                    if (args.length == 1) // If the length is zero, there are no arguments...
                    {
                        String argument = args[0];
                        Player player2 = Bukkit.getPlayer(argument);
                        if (player2 != null && player2.isOnline()) {
                            Location l = player2.getLocation();
                            World w = player2.getWorld();
                            double x = l.getX();
                            double y = l.getY();
                            double z = l.getZ();


                            s.sendMessage(ChatColor.BLUE + "" +ChatColor.BOLD + player2.getName() + ": " + ChatColor.GRAY + "§7X: " + "§f" + Math.round(x) + " " + "§7Y: " + "§f" + Math.round(y) + " " + "§7Z: " + "§f" + Math.round(z));
                            return true;
                        }
                        assert player2 != null;
                        if (!player2.isOnline()){
                            s.sendMessage(ChatColor.RED + "Type one player name");
                            s.sendMessage(ChatColor.RED + "/cords [playername]");
                        }else{
                            s.sendMessage(ChatColor.RED + "Type one player name");
                            s.sendMessage(ChatColor.RED + "/cords [playername]");
                        }

                    }
               if (args.length == 0) {
                   s.sendMessage(ChatColor.RED + "Type one player name");
                   s.sendMessage(ChatColor.RED + "/getcords [playername]");
               }
                if (args.length > 0) {
                    s.sendMessage(ChatColor.RED + "Type one player name");
                    s.sendMessage(ChatColor.RED + "/getcords [playername]");
                }
            }
            return true;
        }
    }
