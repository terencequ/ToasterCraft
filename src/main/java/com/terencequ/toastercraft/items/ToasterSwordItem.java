package com.terencequ.toastercraft.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

public class ToasterSwordItem extends SwordItem {

    public ToasterSwordItem() {
        super(ToolMaterials.DIAMOND, 4, 1.0f, new Settings().fireproof().rarity(Rarity.EPIC));
    }

    @Override()
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();
        if (world.isClient()) return super.postHit(stack, target, attacker);

        target.setOnFireFor(5);

        double x = target.getX();
        double y = target.getY();
        double z = target.getZ();

        var entity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        entity.setPos(x, y, z);
        target.getWorld().spawnEntity(entity);

        return true;
    }
}
