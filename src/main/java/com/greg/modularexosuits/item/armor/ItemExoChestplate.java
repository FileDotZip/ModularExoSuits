/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item.armor;

public class ItemExoChestplate extends ItemMESArmor {
    public ItemExoChestplate(){
        super(ExoArmorMaterial.EXO, ArmorType.CHESTPLATE);
    }

    @Override
    public String getName() {
        return "exoChestplate";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
