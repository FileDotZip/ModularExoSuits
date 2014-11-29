package com.greg.modularexosuits.item.armor;

import com.greg.modularexosuits.creativetab.CreativeTabMES;
import com.greg.modularexosuits.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemMESArmor extends ItemArmor {
    public ItemMESArmor(ArmorMaterial material, ArmorType type) {
        super(material, 0, type.ordinal());
        this.setCreativeTab(CreativeTabMES.MES_TAB);
        this.setUnlocalizedName(this.getName());
        this.setTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        int textureId = this.armorType == ArmorType.LEGGINGS.ordinal() ? 2 : 1;
        return String.format("%s:models/armor/%s_%d.png", Reference.MOD_ID, this.getTextureName(), textureId);
    }

    public abstract String getName();

    public abstract String getTextureName();
}
