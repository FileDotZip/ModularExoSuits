/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block;

import com.greg.modularexosuits.ExoSuitsMod;
import com.greg.modularexosuits.block.tileentity.VacuumInductionSmelterTileEntity;
import com.greg.modularexosuits.creativetab.CreativeTabMES;
import com.greg.modularexosuits.reference.Reference;
import com.greg.modularexosuits.util.BlockSide;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class VacuumInductionSmelter extends BlockContainer implements BlockMES {

    private final IIcon[] icons = new IIcon[6];

    public VacuumInductionSmelter() {
        super(Material.iron);
        this.setCreativeTab(CreativeTabMES.MES_TAB);
        this.setBlockName(this.getName());
        this.setBlockTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
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

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        int meta = BlockSide.getDirectionFacing(entity);
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);
    }


    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return this.icons[BlockSide.getRotatedSide(side, meta).ordinal()];
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new VacuumInductionSmelterTileEntity();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int metadata, float what, float these, float are) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity == null || player.isSneaking()) {
            return false;
        }
        //code to open gui explained later
        player.openGui(ExoSuitsMod.instance, 0, world, x, y, z);
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int par6) {
        dropItems(world, x, y, z);
        super.breakBlock(world, x, y, z, block, par6);
    }

    private void dropItems(World world, int x, int y, int z){
        Random rand = new Random();

        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (!(tileEntity instanceof IInventory)) {
            return;
        }
        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack item = inventory.getStackInSlot(i);

            if (item != null && item.stackSize > 0) {
                float rx = rand.nextFloat() * 0.8F + 0.1F;
                float ry = rand.nextFloat() * 0.8F + 0.1F;
                float rz = rand.nextFloat() * 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world,
                        x + rx, y + ry, z + rz,
                        new ItemStack(item.getItem(), item.stackSize, item.getItemDamage()));

                if (item.hasTagCompound()) {
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) item.getTagCompound().copy());
                }

                float factor = 0.05F;
                entityItem.motionX = rand.nextGaussian() * factor;
                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * factor;
                world.spawnEntityInWorld(entityItem);
                item.stackSize = 0;
            }
        }
    }

    @Override
    public void register() {
        GameRegistry.registerBlock(this, this.getName());
    }

    @Override
    public String getName() {
        return "vacuumInductionSmelter";
    }
}
