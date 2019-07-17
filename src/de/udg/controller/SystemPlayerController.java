package de.udg.controller;

import de.udg.model.SystemPlayer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

@AllArgsConstructor
@Getter
@Setter
public class SystemPlayerController {

	private SystemPlayer systemPlayer;

	public Player getPlayer() {

		return systemPlayer.getPlayer();

	}

	public void giveKit(KitController kitController) {

		getPlayer().getInventory().addItem(kitController.getItems());

	}

}
