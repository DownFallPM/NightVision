package me.ImAstroPvP.firstplugin;

// ____  ______ ___
//|  _ \|  ___/ ___|___  _ __ ___ 
//| | | | |_ | |   / _ \| '__/ _ \
//| |_| |  _|| |__| (_) | | |  __/
//|____/|_|   \____\___/|_|  \___|

import org.bukkit.plugin.java.JavaPlugin;

import me.ImAstroPvP.firstplugin.commands.NightvisionCommand;


public class main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		new NightvisionCommand(this);	
	}
}
