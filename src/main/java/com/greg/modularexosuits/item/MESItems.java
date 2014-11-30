/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.item;

import com.greg.modularexosuits.item.armor.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class MESItems {
    public static final ItemMES titaniumIngot = new ItemTitaniumIngot();
    public static final ItemMESArmor exoChestplate = new ItemExoChestplate();
    public static final ItemMES nickelDust = new ItemNickelDust();
    public static final ItemMESArmor exoBoots = new ItemExoBoots();
    public static final ItemMESArmor exoLeggings = new ItemExoLeggings();
    public static final ItemMESArmor exoHelmet = new ItemExoHelmet();
    public static final ItemMES vacuumChamber = new ItemVacuumChamber();
    public static final ItemMES titaniumPlate = new ItemTitaniumPlate();
    public static final ItemMES valve = new ItemValve();
    public static final PrivateMESItem poke = new ItemPoke();
    public static final ItemMES vacuumInductionSmelterCore = new VacuumInductionSmelterCore();
    public static final ItemMES controlCircuit = new ItemControlCircuit();
    public static final ItemMES vacuumPump = new ItemVacuumPump();
    public static final ItemMES pressureRegulator = new ItemPressureRegulator();
    public static final ItemMES titaniumNugget = new ItemTitaniumNugget();
    public static final ItemMES nitinolIngot = new ItemNitinolIngot();
    public static void init(){
        GameRegistry.registerItem(exoBoots, exoBoots.getName());
        GameRegistry.registerItem(titaniumIngot, titaniumIngot.getName());
        GameRegistry.registerItem(exoChestplate, exoChestplate.getName());
        GameRegistry.registerItem(nickelDust, nickelDust.getName());
        GameRegistry.registerItem(exoLeggings, exoLeggings.getName());
        GameRegistry.registerItem(exoHelmet, exoHelmet.getName());
        GameRegistry.registerItem(vacuumChamber, vacuumChamber.getName());
        GameRegistry.registerItem(titaniumPlate, titaniumPlate.getName());
        GameRegistry.registerItem(valve, valve.getName());
        GameRegistry.registerItem(poke, poke.getName());
        GameRegistry.registerItem(vacuumInductionSmelterCore, vacuumInductionSmelterCore.getName());
        GameRegistry.registerItem(controlCircuit, controlCircuit.getName());
        GameRegistry.registerItem(vacuumPump, vacuumPump.getName());
        GameRegistry.registerItem(pressureRegulator, pressureRegulator.getName());
        GameRegistry.registerItem(titaniumNugget, titaniumNugget.getName());
        GameRegistry.registerItem(nitinolIngot, nitinolIngot.getName());
    }
}
