package com.greg.modularexosuits.item.armor;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ExoArmorMaterial {
    private static final int DURABILITY = 33;//diamond armor durability
    private static final int[] DAMAGE_REDUCTION = new int[]{3, 8, 6, 3};//{helmet, chestplate, leggings, booots}. For now use diamond armor values
    private static final int ENCHANTIBILITY = 0;//no enchanting. Not sure how value 0 works

    public static ItemArmor.ArmorMaterial EXO = EnumHelper.addArmorMaterial("EXO", DURABILITY, DAMAGE_REDUCTION, ENCHANTIBILITY);
}
