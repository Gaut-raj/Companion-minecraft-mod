package com.example.companionMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.com.example.companionMod.Main;

public class ModItems {

    public static final Item COMPANION_ITEM = registerItem("companion_item", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    public static void registerModItems() {
       
        // This method is called to ensure the items are registered
    event.put("itemGroup.companionmod", "Companion Mod");
    }
}