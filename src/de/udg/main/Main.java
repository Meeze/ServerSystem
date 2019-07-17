package de.udg.main;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

	private static Main plugin;


	@Override
	public void onEnable() {
		plugin = this;

		registerCommands();
		registerListeners();
	}

	@Override
	public void onDisable() {

	}

	private void registerCommands() {

	}

	private void registerListeners() {

	}

	public static Main getPlugin() {
		return plugin;
	}


}

