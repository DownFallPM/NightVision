package me.ImAstroPvP.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.ImAstroPvP.firstplugin.main;
import me.ImAstroPvP.firstplugin.utils.utils;

public class NightvisionCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private main plugin;
	
	public NightvisionCommand(main plugin){
		this.plugin = plugin;
		plugin.getCommand("NightVision on").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("This command can be executed IN-Game only!a");
			return true;
		}
		
		Player player = (Player) sender;
	
		if (player.hasPermission("nightvision.cmd")) {
			if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
				player.removePotionEffect(PotionEffectType.NIGHT_VISION);
				player.sendMessage(utils.chat("&8&l[&5!&8]&r&e You have Disabled the &dNightVision &7effect"));
			} else {
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1, false, false));
				player.sendMessage(utils.chat("&8&l[&5!&8]&r&e You have enabled the &dNightVision &7effect"));	
			}
			
		} else {
			player.sendMessage(utils.chat("&8&l[&5!&8]&r&c You do not have permission to execute this command!"));
		}
			
		return true;
		
	}
}