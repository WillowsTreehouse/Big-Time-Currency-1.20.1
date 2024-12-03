package net.willow.bigtimecurrency;

import net.fabricmc.api.ModInitializer;

import net.willow.bigtimecurrency.block.ModBlocks;
import net.willow.bigtimecurrency.item.ModItemGroups;
import net.willow.bigtimecurrency.item.ModItems;
import net.willow.bigtimecurrency.sounds.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigtimeCurrency implements ModInitializer {
	public static final String MOD_ID = "bigtimecurrency";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("They call Big Time Currency Dr.Loading.");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();
	}
}