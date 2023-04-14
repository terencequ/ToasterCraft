package com.terencequ.toastercraft.constants;

import com.terencequ.toastercraft.ToasterCraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ToasterCraftItemGroups {
    public static final ItemGroup TOASTER_CRAFT = FabricItemGroup
            .builder(new Identifier(ToasterCraftMod.MOD_ID, "toaster_craft"))
            .icon(() -> new ItemStack(ToasterCraftItems.TOASTER))
            .build();
}
