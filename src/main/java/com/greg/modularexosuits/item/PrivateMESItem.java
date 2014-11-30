/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item;

import com.greg.modularexosuits.reference.Reference;
import net.minecraft.item.Item;

public abstract class PrivateMESItem extends Item
{
    public PrivateMESItem()
    {
        super();
        this.setUnlocalizedName(this.getName());
        this.setTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }

    public abstract String getName();
}