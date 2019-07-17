package de.udg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
@Getter
@Setter
public class Kit {


	private String name;
	private ItemStack[] content;
	private int cooldown;
	private long price;
	private ItemStack icon;


}
