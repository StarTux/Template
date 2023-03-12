package com.cavetale.template;

import org.bukkit.plugin.java.JavaPlugin;

public final class TemplatePlugin extends JavaPlugin {
    protected final TemplateCommand templateCommand = new TemplateCommand(this);
    protected final EventListener eventListener = new EventListener(this);

    @Override
    public void onEnable() {
        templateCommand.enable();
        eventListener.enable();
    }

    @Override
    public void onDisable() {
    }
}
