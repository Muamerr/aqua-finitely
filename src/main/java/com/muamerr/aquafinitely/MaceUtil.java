package com.muamerr.aquafinitely;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

public class MaceUtil {
    public static ItemStack createMace() {
        ItemStack mace = new ItemStack(Material.MACE);
        ItemMeta meta = mace.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(ChatColor.AQUA + "Aqua Mace");
            meta.setLore(Arrays.asList(
                ChatColor.GRAY + "Right-click: Dash & Sky Boost",
                ChatColor.GRAY + "Left-click: High Jump (18 blocks)"
            ));
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            mace.setItemMeta(meta);
        }
        return mace;
    }
}
