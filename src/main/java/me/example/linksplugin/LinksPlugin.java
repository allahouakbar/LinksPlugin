package me.example.linksplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class LinksPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("LinksPlugin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("LinksPlugin disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String cmd = command.getName().toLowerCase();

        switch (cmd) {
            case "discord":
                sender.sendMessage("§bDiscord: §fhttps://discord.gg/XPQH2TBY7K");
                return true;

            case "store":
                sender.sendMessage("§aStore: §fhttps://redyuu737.craftingstore.net/");
                return true;

            case "vote":
                sender.sendMessage("§eVote: §fhttps://mclike.com/minecraft-server-193893");
                return true;
        }
        return false;
    }
}
