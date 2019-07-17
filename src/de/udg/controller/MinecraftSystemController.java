package de.udg.controller;

import de.udg.main.Main;
import de.udg.model.MinecraftSystem;
import de.udg.model.SystemPlayer;
import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;

@AllArgsConstructor
public class MinecraftSystemController {

	private MinecraftSystem minecraftSystem;

	public SystemPlayerController getSystemPlayerController(Player player) {
		return minecraftSystem.getSystemPlayerControllerHashMap().get(player);
	}

	public void registerSystemPlayer(Player player) {
		minecraftSystem.getSystemPlayerControllerHashMap().put(player, new SystemPlayerController(loadSystemPlayerFromDatabase(player)));
	}

	public void unregisterSystemPlayer(Player player) {
		minecraftSystem.getSystemPlayerControllerHashMap().remove(player);
	}

	private SystemPlayer loadSystemPlayerFromDatabase(Player player) {

		return new SystemPlayer(player);

	}

}
