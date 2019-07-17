package de.udg.listener;

import de.udg.main.Main;
import de.udg.model.SystemPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		UUID uniqueId = player.getUniqueId();
		Main.getSystemController().registerSystemPlayer(player);

		Bukkit.broadcastMessage("+1");
		event.setJoinMessage(null);

	}
}