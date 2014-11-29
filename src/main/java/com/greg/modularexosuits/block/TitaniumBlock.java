/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import net.minecraft.block.material.Material;

public class TitaniumBlock extends BlockMES{
    public TitaniumBlock(){
        super(Material.sponge);
        this.setHardness(5);
        this.setResistance(2);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockName(this.getName());

    }
    @Override
    public String getName() {
        return "titaniumBlock";
    }

}
