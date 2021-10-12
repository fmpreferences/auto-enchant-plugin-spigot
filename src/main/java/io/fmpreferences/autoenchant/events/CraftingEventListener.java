package io.fmpreferences.autoenchant.events;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingEventListener implements Listener {
    @EventHandler
    public static void craftEnchantedItem(CraftItemEvent e) {
        if(e.getCurrentItem() != null) {
            if (EnchantmentTarget.TOOL.includes(e.getCurrentItem())) {
                if (e.getClick().equals(ClickType.RIGHT)||e.getClick().equals(ClickType.SHIFT_RIGHT)) {
                    ItemMeta im = e.getCurrentItem().getItemMeta();
                    if (im != null)
                        im.addEnchant(Enchantment.DIG_SPEED,3, false);
                    e.getCurrentItem().setItemMeta(im);
                }
            }
        }
    }
}
