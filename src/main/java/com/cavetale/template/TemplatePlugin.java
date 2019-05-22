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
    public boolean onCommand(final CommandSender sender,
                             final Command command,
                             final String alias,
                             final String[] args) {
        return true;
    }
}
