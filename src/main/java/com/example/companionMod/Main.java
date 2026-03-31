package com.example.companionMod;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "companionmod";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        public static final Logger LOGGER = LogManager.getLogger();
        public static final String MOD_ID = "companionmod";

        public CompanionMod() {
            IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

            EntiryInit.register(eventBus);
            ItemInit.register(eventBus);
            
        }
        ModItems.registerModItems();

        System.out.println("Companion Mod initialized!");
    }
}