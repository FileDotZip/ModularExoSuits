/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.worldgen;

import com.greg.modularexosuits.block.MESBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class ExoSuitsGenerator implements IWorldGenerator {
    private final WorldGenMinable titaniumGen;
    private final int maxTitaniumVeinsPerChunk = 6;

    public ExoSuitsGenerator(){
        this.titaniumGen = new WorldGenMinable(MESBlocks.titaniumOre, 8);
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int xStart = chunkX * 16 + 8;
        int zStart = chunkZ * 16 + 8;
        for(int i = 0; i < maxTitaniumVeinsPerChunk; i++){
            int x = xStart+ random.nextInt(16);
            int z = zStart+ random.nextInt(16);
            int y = random.nextInt(35-10)+10;
            titaniumGen.generate(world, random, x,y,z);
        }
    }

    public static void init() {
        GameRegistry.registerWorldGenerator(new ExoSuitsGenerator(), 0);
    }
}
