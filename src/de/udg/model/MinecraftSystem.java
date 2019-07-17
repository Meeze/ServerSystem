package de.udg.model;

import de.udg.controller.KitController;
import de.udg.controller.SystemPlayerController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

@AllArgsConstructor
@Getter
@Setter
public class MinecraftSystem {

	private HashMap<Player, SystemPlayerController> systemPlayerControllerHashMap = new HashMap<Player, SystemPlayerController>();
	private ArrayList<KitController> kits;

}
