package net.spacerulerwill.muskets;

import net.fabricmc.api.ModInitializer;

import net.spacerulerwill.muskets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Muskets implements ModInitializer {
	public static final String MOD_ID = "muskets";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}