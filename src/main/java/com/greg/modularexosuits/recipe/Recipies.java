/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.recipe;

import com.greg.modularexosuits.block.MESBlocks;
import com.greg.modularexosuits.item.MESItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipies {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(MESItems.titaniumPlate),
                "sss",
                "sss",
                "   ",
                's', new ItemStack(MESItems.titaniumIngot, 3));

        GameRegistry.addRecipe(new ItemStack(MESItems.vacuumChamber),
                "ipi",
                "p v",
                "ipi",
                'i', new ItemStack(MESItems.titaniumIngot),
                'p', new ItemStack(MESItems.titaniumPlate),
                'v', new ItemStack(MESItems.valve));

        GameRegistry.addRecipe(new ItemStack(MESItems.valve, 2),
                "LpL",
                "ipi",
                "iii",
                'i', new ItemStack(MESItems.titaniumIngot),
                'p', new ItemStack(MESItems.titaniumPlate),
                'L', new ItemStack(Items.leather));

        GameRegistry.addRecipe(new ItemStack(Blocks.stone,4),
                "GCG",
                "CGC",
                "GCG",
                'G', new ItemStack(Blocks.gravel),
                'C', new ItemStack(Items.clay_ball));

        GameRegistry.addRecipe(new ItemStack(MESBlocks.titaniumBlock),
                "III",
                "III",
                "III",
                'I', new ItemStack(MESItems.titaniumIngot));

        GameRegistry.addRecipe(new ItemStack(MESBlocks.vacuumInductionSmelter),
                "CVC",
                "bXb",
                "BBB",
                'B', new ItemStack(MESBlocks.titaniumBlock),
                'b', new ItemStack(MESItems.titaniumPlate),
                'X', new ItemStack(MESItems.vacuumInductionSmelterCore),
                'V', new ItemStack(MESItems.vacuumPump),
                'C', new ItemStack(MESItems.controlCircuit));

        GameRegistry.addRecipe(new ItemStack(MESItems.controlCircuit, 2),
                "prp",
                "RQR",
                "ppp",
                'Q', new ItemStack(Items.quartz),
                'p', new ItemStack(MESItems.titaniumPlate),
                'r', new ItemStack(Items.repeater),
                'R', new ItemStack(Items.redstone));

        GameRegistry.addRecipe(new ItemStack(MESItems.vacuumInductionSmelterCore),
                "VPI",
                "PvP",
                "IPI",
                'P', new ItemStack(MESItems.titaniumPlate),
                'I', new ItemStack(MESItems.titaniumIngot),
                'V', new ItemStack(MESItems.valve),
                'v', new ItemStack(MESItems.vacuumChamber));

        GameRegistry.addRecipe(new ItemStack(MESItems.pressureRegulator),
                "GpG",
                "IPI",
                "III",
                'I', new ItemStack(MESItems.titaniumIngot),
                'P', new ItemStack(MESItems.titaniumPlate),
                'G', new ItemStack(Blocks.glass),
                'p', new ItemStack(Items.paper));

        GameRegistry.addRecipe(new ItemStack(MESItems.vacuumPump),
                "PPP",
                "V V",
                "iPi",
                'i', new ItemStack(MESItems.titaniumIngot),
                'P', new ItemStack(MESItems.titaniumPlate),
                'V', new ItemStack(MESItems.valve));
        GameRegistry.addShapelessRecipe(new ItemStack(MESItems.titaniumNugget, 9), new ItemStack(MESItems.titaniumIngot));
        GameRegistry.addRecipe(new ItemStack(MESItems.titaniumIngot),"NNN", "NNN", "NNN", 'N', new ItemStack(MESItems.titaniumNugget, 9));

        GameRegistry.addSmelting(MESBlocks.titaniumOre, new ItemStack(MESItems.titaniumIngot), 0.4f);
        GameRegistry.addSmelting(MESBlocks.nickelOre, new ItemStack(MESItems.nickelDust, 2), 0.4f);
        //GameRegistry.addShapelessRecipe(new ItemStack(MESItems.titaniumPlate), new ItemStack(MESItems.titaniumIngot), new ItemStack(MESItems.titaniumIngot));
        //GameRegistry.addRecipe(new ShapedOreRecipe());
        //GameRegistry.addRecipe(new ShapelessOreRecipe());
    }
}
