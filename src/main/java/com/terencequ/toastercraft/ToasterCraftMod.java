package com.terencequ.toastercraft;

import com.terencequ.toastercraft.constants.ToasterCraftItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToasterCraftMod implements ModInitializer {

	public static final String MOD_ID = "toastercraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ToasterCraftItems.registerAllItems();
	}
}
