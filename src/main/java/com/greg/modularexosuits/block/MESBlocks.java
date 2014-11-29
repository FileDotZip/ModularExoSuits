/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import cpw.mods.fml.common.registry.GameRegistry;

public class MESBlocks {
    public static final BlockMES titaniumBlock = new TitaniumBlock();
    public static final BlockMES titaniumOre = new TitaniumOreBlock();
    public static final BlockMES nickelOre = new NickelOreBlock();
    public static void init(){
        GameRegistry.registerBlock(titaniumBlock, "titaniumBlock");
        GameRegistry.registerBlock(titaniumOre, "titaniumOre");
        GameRegistry.registerBlock(nickelOre, "nicekOre");
    }
}
