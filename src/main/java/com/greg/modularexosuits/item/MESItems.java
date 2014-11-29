/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item;

import cpw.mods.fml.common.registry.GameRegistry;

public class MESItems {
    public static final ItemMES titaniumIngot = new ItemTitaniumIngot();
    public static final ItemMES titaniumChestplate = new ItemTitaniumChestplate();
    public static final ItemMES nickelDust = new ItemNickelDust();
    public static void init(){
        GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
        GameRegistry.registerItem(titaniumChestplate, "titaniumChestplate");
        GameRegistry.registerItem(nickelDust, "nickelDust");

    }
}
