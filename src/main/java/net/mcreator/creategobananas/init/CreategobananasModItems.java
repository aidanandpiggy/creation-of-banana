/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creategobananas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.creategobananas.item.CheeseItem;
import net.mcreator.creategobananas.CreategobananasMod;

import java.util.function.Function;

public class CreategobananasModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreategobananasMod.MODID);
	public static final DeferredItem<Item> CHEESE;
	static {
		CHEESE = register("cheese", CheeseItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}