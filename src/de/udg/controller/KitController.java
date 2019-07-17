package de.udg.controller;

import de.udg.model.Kit;
import de.udg.view.KitView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
@Getter
@Setter
public class KitController {

	private Kit kit;
	private KitView kitView;

	public ItemStack[] getItems(){

		return kit.getContent();

	}

}
