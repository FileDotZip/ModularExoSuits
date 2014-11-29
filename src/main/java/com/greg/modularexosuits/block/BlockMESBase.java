/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import com.greg.modularexosuits.creativetab.CreativeTabMES;
import com.greg.modularexosuits.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public abstract class BlockMESBase extends Block implements  BlockMES{
    protected BlockMESBase(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabMES.MES_TAB);
        this.setBlockName(this.getName());
        this.setBlockTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }
}
