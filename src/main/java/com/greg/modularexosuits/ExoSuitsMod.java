/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits;

import com.greg.modularexosuits.block.MESBlocks;
import com.greg.modularexosuits.recipe.Recipies;
import com.greg.modularexosuits.item.MESItems;
import com.greg.modularexosuits.worldgen.ExoSuitsGenerator;
import com.greg.modularexosuits.reference.Reference;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class ExoSuitsMod
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MESBlocks.init();
        MESItems.init();
        ExoSuitsGenerator.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("init");
        Recipies.init();
    }
}
