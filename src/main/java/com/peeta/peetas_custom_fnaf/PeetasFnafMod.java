package com.peeta.peetas_custom_fnaf;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PeetasFnafMod implements ModInitializer {

    public static final String MOD_ID = "peetas_custom_fnaf";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Peeta's Custom FNaF mod loading...");

        ModBlocks.register();
        ModItems.register();

        LOGGER.info("Peeta's Custom FNaF mod loaded!");
    }
}
