/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item;

import com.greg.modularexosuits.creativetab.CreativeTabMES;
import com.greg.modularexosuits.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public abstract class ItemMESBase extends Item implements ItemMES{
    public ItemMESBase()
    {
        super();
        this.setCreativeTab(CreativeTabMES.MES_TAB);
        this.setUnlocalizedName(this.getName());
        this.setTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }

    @Override
    public void register(){
        GameRegistry.registerItem(this, this.getName());
    }
}
