/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item.armor;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ExoArmorMaterial {
    private static final int DURABILITY = 33;//diamond armor durability
    private static final int[] DAMAGE_REDUCTION = new int[]{3, 8, 6, 3};//{helmet, chestplate, leggings, booots}. For now use diamond armor values
    private static final int ENCHANTIBILITY = 0;//no enchanting. Not sure how value 0 works

    public static ItemArmor.ArmorMaterial EXO = EnumHelper.addArmorMaterial("EXO", DURABILITY, DAMAGE_REDUCTION, ENCHANTIBILITY);
}
