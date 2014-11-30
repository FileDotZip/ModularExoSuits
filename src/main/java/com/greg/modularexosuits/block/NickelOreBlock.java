/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import com.greg.modularexosuits.item.MESItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class NickelOreBlock extends BlockMESBase {
    public NickelOreBlock(){
        super(Material.rock);
        this.setHardness(5);
        this.setResistance(5);
        this.setHarvestLevel("pickaxe", 2);
    }
    @Override
    public String getName(){
        return "nickelOre";
    }

    public int quantityDropped(Random rand)
    {
        return 6;
    }

    public Item getItemDropped(int meta, Random rand, int fortune)
    {
        return MESItems.nickelDust;
    }

}
