package com.cavetale.template;

import org.bukkit.plugin.java.JavaPlugin;

public final class TemplatePlugin extends JavaPlugin {
    protected static TemplatePlugin instance;
    protected final TemplateCommand templateCommand = new TemplateCommand(this);
    protected final EventListener eventListener = new EventListener();

    public TemplatePlugin() {
        instance = this;
    }

    @Override
    public void onEnable() {
        templateCommand.enable();
        eventListener.enable();
    }

    @Override
    public void onDisable() {
    }

    public static TemplatePlugin plugin() {
        return instance;
    }
}
