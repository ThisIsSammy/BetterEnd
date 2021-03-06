package ru.betterend.recipe;

import ru.betterend.recipe.builders.SmithingTableRecipe;
import ru.betterend.registry.EndItems;

public class SmithingRecipes {
	
	public static void register() {
		SmithingTableRecipe.create("aeternium_sword_handle")
			.setResult(EndItems.AETERNIUM_SWORD_HANDLE)
			.setBase(EndItems.TERMINITE_INGOT)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		
		SmithingTableRecipe.create("aeternium_sword")
			.setResult(EndItems.AETERNIUM_SWORD)
			.setBase(EndItems.AETERNIUM_SWORD_BLADE)
			.setAddition(EndItems.AETERNIUM_SWORD_HANDLE)
			.build();
		SmithingTableRecipe.create("aeternium_pickaxe")
			.setResult(EndItems.AETERNIUM_PICKAXE)
			.setBase(EndItems.AETERNIUM_PICKAXE_HEAD)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		SmithingTableRecipe.create("aeternium_axe")
			.setResult(EndItems.AETERNIUM_AXE)
			.setBase(EndItems.AETERNIUM_AXE_HEAD)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		SmithingTableRecipe.create("aeternium_shovel")
			.setResult(EndItems.AETERNIUM_SHOVEL)
			.setBase(EndItems.AETERNIUM_SHOVEL_HEAD)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		SmithingTableRecipe.create("aeternium_hoe")
			.setResult(EndItems.AETERNIUM_HOE)
			.setBase(EndItems.AETERNIUM_HOE_HEAD)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		SmithingTableRecipe.create("aeternium_hammer")
			.setResult(EndItems.AETERNIUM_HAMMER)
			.setBase(EndItems.AETERNIUM_HAMMER_HEAD)
			.setAddition(EndItems.LEATHER_WRAPPED_STICK)
			.build();
		
		SmithingTableRecipe.create("aeternium_helmet")
			.setResult(EndItems.AETERNIUM_HELMET)
			.setBase(EndItems.TERMINITE_HELMET)
			.setAddition(EndItems.AETERNIUM_INGOT)
			.build();
		SmithingTableRecipe.create("aeternium_chestplate")
			.setResult(EndItems.AETERNIUM_CHESTPLATE)
			.setBase(EndItems.TERMINITE_CHESTPLATE)
			.setAddition(EndItems.AETERNIUM_INGOT)
			.build();
		SmithingTableRecipe.create("aeternium_leggings")
			.setResult(EndItems.AETERNIUM_LEGGINGS)
			.setBase(EndItems.TERMINITE_LEGGINGS)
			.setAddition(EndItems.AETERNIUM_INGOT)
			.build();
		SmithingTableRecipe.create("aeternium_boots")
			.setResult(EndItems.AETERNIUM_BOOTS)
			.setBase(EndItems.TERMINITE_BOOTS)
			.setAddition(EndItems.AETERNIUM_INGOT)
			.build();
	}
}
