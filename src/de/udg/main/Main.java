package de.udg.main;

import de.udg.controller.KitController;
import de.udg.controller.MinecraftSystemController;
import de.udg.controller.SystemPlayerController;
import de.udg.listener.PlayerJoinListener;
import de.udg.model.MinecraftSystem;
import de.udg.model.SystemPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;


public class Main extends JavaPlugin {

	private static Main plugin;
	private static MinecraftSystemController minecraftSystemController;

	@Override
	public void onEnable() {
		plugin = this;
		minecraftSystemController = new MinecraftSystemController(loadSystem());

		registerCommands();
		registerListeners();
	}

	@Override
	public void onDisable() {

	}

	private void registerCommands() {

	}

	private void registerListeners() {

		this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

	}

	public static Main getPlugin() {
		return plugin;
	}

	public static MinecraftSystemController getSystemController() {
		return minecraftSystemController;
	}

	//Temporäre void bis wir datenbank klassen haben lul
	private MinecraftSystem loadSystem() {
		return new MinecraftSystem(new HashMap<Player, SystemPlayerController>(), loadKitsFromDatabase());
	}

	private ArrayList<KitController> loadKitsFromDatabase() {
		//LOAD KIT DATA FROM DB OR CONFIG INTO SYSTEM ARRAYLIST<KIT> TODO alles
		return null;
	}

}