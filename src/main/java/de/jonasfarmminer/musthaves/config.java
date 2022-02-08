package de.jonasfarmminer.musthaves;

import org.bukkit.plugin.Plugin;

import java.io.File;

public class config {

    public void loadDataFolder (Plugin p) {
        if (!p.getDataFolder().exists())
            p.getDataFolder().mkdir();
        File f = new File(p.getDataFolder(), "quitsave.yml");
        if (!f.exists()) {
            f.mkdir();
        }
    }
}
