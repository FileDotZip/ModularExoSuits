/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;

public abstract class SidedBlockMES extends BlockMESBase {

    private final IIcon[] icons = new IIcon[6];

    protected SidedBlockMES(Material material) {
        super(material);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < icons.length; i ++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + getDirectionForId(i));
        }
    }

    private String getDirectionForId(int i) {
        switch(i){
            case 0: return "bottom";
            case 1: return "top";
            case 2: return "front";
            case 3: return "right";
            case 4: return "back";
            case 5: return "left";
            default: throw new IllegalArgumentException("Invalid direction: "+i);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int beta)
    {
        return this.icons[side];
    }
}
