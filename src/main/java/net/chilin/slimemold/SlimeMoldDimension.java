package net.chilin.slimemold;

import net.chilin.slimemold.block.ModBlocks;
import net.chilin.slimemold.item.ModItemGroups;
import net.chilin.slimemold.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
public class SlimeMoldDimension implements ModInitializer {
	public static final String MOD_ID = "slimemolddimension";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItmes();
		ModBlocks.registerModBlocks();

	}
}