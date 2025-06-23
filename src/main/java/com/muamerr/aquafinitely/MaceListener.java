package com.muamerr.aquafinitely;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class MaceListener implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if (e.getHand() != EquipmentSlot.HAND) return;
        Player p = e.getPlayer();
        if (p.getInventory().getItemInMainHand().getType() == Material.MACE) {
            if (e.getAction().name().contains("RIGHT")) {
                p.setVelocity(p.getLocation().getDirection().multiply(2).setY(1));
            } else if (e.getAction().name().contains("LEFT")) {
                new BukkitRunnable() {
                    public void run() {
                        p.setVelocity(new Vector(0, 1.2, 0)); // ~18-block jump
                    }
                }.runTaskLater(AquaFinitely.instance, 1L);
            }
        }
    }
}
