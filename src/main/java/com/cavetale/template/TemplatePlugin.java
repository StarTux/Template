package com.cavetale.template;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class TemplatePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        return true;
    }
}
