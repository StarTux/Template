package com.cavetale.template;

import com.cavetale.core.command.AbstractCommand;
import org.bukkit.command.CommandSender;

public final class TemplateCommand extends AbstractCommand<TemplatePlugin> {
    protected TemplateCommand(final TemplatePlugin plugin) {
        super(plugin, "template");
    }

    @Override
    protected void onEnable() {
        rootNode.addChild("info").denyTabCompletion()
            .description("Info Command")
            .senderCaller(this::info);
    }

    protected boolean info(CommandSender sender, String[] args) {
        return false;
    }
}
