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
    private final WorldGenMinable nickelGen;
    private final WorldGenMinable lithiumGen;

    private final int maxTitaniumVeinsPerChunk = 6;
    private final int maxNickelVeinsPerChunk = 6;
    private final int maxLithiumVeinsPerChunk = 1;

    public ExoSuitsGenerator(){
        this.titaniumGen = new WorldGenMinable(MESBlocks.titaniumOre, 8);
        this.nickelGen = new WorldGenMinable(MESBlocks.nickelOre, 8);
        this.lithiumGen = new WorldGenMinable(MESBlocks.lithiumOre, 2);
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int startX = chunkX * 16 + 8;
        int startZ = chunkZ * 16 + 8;

        this.generateVeins(world, random, titaniumGen, startX, startZ, maxTitaniumVeinsPerChunk, 0, 35);
        this.generateVeins(world, random, nickelGen, startX, startZ, maxNickelVeinsPerChunk, 0, 25);
        this.generateVeins(world, random, lithiumGen, startX, startZ, maxLithiumVeinsPerChunk, 0, 10);
    }

    private void generateVeins(World world, Random random, WorldGenMinable gen, int startX, int startZ, int numVeins, int minY, int maxY){
        for(int i = 0; i < numVeins; i++){
            int x = startX+ random.nextInt(16);
            int z = startZ+ random.nextInt(16);
            int y = random.nextInt(maxY-minY)+minY;
            gen.generate(world, random, x,y,z);
        }
    }

    public static void init() {
        GameRegistry.registerWorldGenerator(new ExoSuitsGenerator(), 0);
    }
}
