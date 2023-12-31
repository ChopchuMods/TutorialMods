package pl.kotlewski.tutorialmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.kotlewski.tutorialmod.block.ModBlocks;
import pl.kotlewski.tutorialmod.item.ModItems;
import pl.kotlewski.tutorialmod.item.ModItemsGroups;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}