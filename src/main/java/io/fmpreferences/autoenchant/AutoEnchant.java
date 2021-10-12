package io.fmpreferences.autoenchant;

import io.fmpreferences.autoenchant.events.CraftingEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoEnchant extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CraftingEventListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
