/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item.armor;

import com.greg.modularexosuits.creativetab.CreativeTabMES;
import com.greg.modularexosuits.item.ItemMES;
import com.greg.modularexosuits.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemMESArmor extends ItemArmor implements ItemMES {
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

    public void register(){
        GameRegistry.registerItem(this, this.getName());
    }
    public abstract String getTextureName();
}
