/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

public class MESBlocks {

    public static final BlockMESBase titaniumBlock = new TitaniumBlock();
    public static final BlockMESBase titaniumOre = new TitaniumOreBlock();

    public static final BlockMESBase nickelOre = new NickelOreBlock();
    public static final BlockMESBase lithiumOre = new LithiumOre();

    public static final VacuumInductionSmelter vacuumInductionSmelter = new VacuumInductionSmelter();

    public static void init(){
        titaniumBlock.register();
        titaniumOre.register();

        nickelOre.register();
        lithiumOre.register();

        vacuumInductionSmelter.register();
    }
}
