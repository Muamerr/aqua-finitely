package com.muamerr.aquafinitely;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MaceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player p && args.length > 0 && args[0].equalsIgnoreCase("give")) {
            p.getInventory().addItem(MaceUtil.createMace());
            return true;
        }
        return false;
    }
}
