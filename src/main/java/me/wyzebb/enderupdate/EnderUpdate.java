package me.wyzebb.enderupdate;

import me.wyzebb.enderupdate.item.ModItemGroup;
import me.wyzebb.enderupdate.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderUpdate implements ModInitializer {

    public static final String MOD_ID = "ender-update";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
    }
}
