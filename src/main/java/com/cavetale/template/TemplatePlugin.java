package com.cavetale.template;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TemplatePlugin extends JavaPlugin {
    TemplateCommand templateCommand = new TemplateCommand(this);
    EventListener eventListener = new EventListener(this);

    @Override
    public void onEnable() {
        templateCommand.enable();
        eventListener.enable();
        for (Player player : Bukkit.getOnlinePlayers()) {
            enter(player);
        }
    }

    @Override
    public void onDisable() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            exit(player);
        }
    }

    public void enter(Player player) {
        // TODO
    }

    public void exit(Player player) {
        // TODO
    }
}
