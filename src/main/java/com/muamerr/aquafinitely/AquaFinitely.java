package com.muamerr.aquafinitely;

import org.bukkit.NamespacedKey;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class AquaFinitely extends JavaPlugin {
    public static AquaFinitely instance;
    public static NamespacedKey key;

    @Override
    public void onEnable() {
        instance = this;
        key = new NamespacedKey(this, "aquamace");
        PluginCommand cmd = getCommand("aquamace");
        if (cmd != null) cmd.setExecutor(new MaceCommand());
        getServer().getPluginManager().registerEvents(new MaceListener(), this);
    }
}
