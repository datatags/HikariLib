package dev.ghast.libraries;

import org.bukkit.plugin.java.JavaPlugin;

public final class HikariLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Successfully loaded HikariCP!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Successfully unloaded HikariCP!");
    }
}
