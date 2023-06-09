package net.fabricmc.ddz;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 	ddzMain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("ddz");
	public static final Block CACTUS_PLANK = new Block(FabricBlockSettings.of(Material.CACTUS).strength(1.0f));
	public static final Item CACTUS_FLOWER = new cactusFlower(new Item.Settings().food(FoodComponents.APPLE));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registries.BLOCK, new Identifier("ddz", "cactus_plank"), CACTUS_PLANK);
		Registry.register(Registries.ITEM, new Identifier("ddz", "cactus_plank"), new BlockItem(CACTUS_PLANK, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("ddz", "cactus_flower"), CACTUS_FLOWER);

	}
}
