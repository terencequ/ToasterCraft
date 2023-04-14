package com.terencequ.toastercraft.constants;

import com.terencequ.toastercraft.ToasterCraftMod;
import com.terencequ.toastercraft.items.ToasterSwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ToasterCraftItems {

    public static final Item TOASTER = new Item(new FabricItemSettings());
    public static final Item BREAD_SLICE = new Item(new FabricItemSettings());
    public static final Item TOAST_SLICE = new Item(new FabricItemSettings());
    public static final Item TOASTER_ARROW = new Item(new FabricItemSettings());
    public static final Item TOASTER_LAUNCHER = new Item(new FabricItemSettings());
    public static final Item TOASTER_SHOES = new Item(new FabricItemSettings());
    public static final Item TOASTER_SWORD = new ToasterSwordItem();

    /**
     * Register all items for this mod.
     */
    public static void registerAllItems() {
        registerItem("toaster", TOASTER);
        registerItem("bread_slice", BREAD_SLICE);
        registerItem("toast_slice", TOAST_SLICE);
        registerItem("toaster_arrow", TOASTER_ARROW);
        registerItem("toaster_launcher", TOASTER_LAUNCHER);
        registerItem("toaster_shoes", TOASTER_SHOES);
        registerItem("toaster_sword", TOASTER_SWORD);
    }

    /**
     * Register the item and add it to the mod's main item group.
     * @param itemId The ID of the item.
     * @param item The item to register.
     */
    private static void registerItem(String itemId, Item item) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(ToasterCraftMod.MOD_ID, itemId), item);
        ItemGroupEvents.modifyEntriesEvent(ToasterCraftItemGroups.TOASTER_CRAFT).register((entries) -> entries.add(registeredItem));
    }
}
