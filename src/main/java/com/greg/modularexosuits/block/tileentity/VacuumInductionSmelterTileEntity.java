/*
 * Copyright (c) Barteks2x and LikeTotallyGreg, 2014
 * https://github.com/LikeTotallyGreg/ModularExoSuits
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://github.com/LikeTotallyGreg/ModularExoSuits/blob/master/LICENCE.txt
 */

package com.greg.modularexosuits.block.tileentity;

import com.greg.modularexosuits.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class VacuumInductionSmelterTileEntity extends TileEntity implements IInventory{
    private static final int IN_SLOTS = 9;
    private static final int OUT_SLOTS = 9;
    private static final int POWER_SLOTS = 4;
    private static final int CAST_SLOTS = 1;


    private ItemStack[] items = new ItemStack[this.getSizeInventory()];

    @Override
    public int getSizeInventory() {
        return IN_SLOTS+OUT_SLOTS+ CAST_SLOTS +POWER_SLOTS;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return items[i];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amt) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            if (stack.stackSize <= amt) {
                setInventorySlotContents(slot, null);
            } else {
                stack = stack.splitStack(amt);
                if (stack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            setInventorySlotContents(slot, null);
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        items[slot] = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return Reference.MOD_ID+".vacuuminductionsmelterinventory";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this &&
        player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack stack) {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);

        NBTTagList tagList = tagCompound.getTagList("Inventory", 10);
        for (int i = 0; i < tagList.tagCount(); i++) {
            NBTTagCompound tag = tagList.getCompoundTagAt(i);
            byte slot = tag.getByte("Slot");
            if (slot >= 0 && slot < items.length) {
                items[slot] = ItemStack.loadItemStackFromNBT(tag);
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);

        NBTTagList itemList = new NBTTagList();
        for (int i = 0; i < items.length; i++) {
            ItemStack stack = items[i];
            if (stack != null) {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setByte("Slot", (byte) i);
                stack.writeToNBT(tag);
                itemList.appendTag(tag);
            }
        }
        tagCompound.setTag("Inventory", itemList);
    }

    private SlotType getSlotType(int slot){
        if(slot < IN_SLOTS){
            return SlotType.IN;
        }
        if(slot < IN_SLOTS+OUT_SLOTS){
            return SlotType.OUT;
        }
        if(slot < IN_SLOTS+OUT_SLOTS+POWER_SLOTS){
            return SlotType.POWER;
        }
        if(slot < IN_SLOTS+OUT_SLOTS+POWER_SLOTS+CAST_SLOTS){
            return SlotType.CAST;
        }
        return null;
    }

    public int getSlotX(int i) {
        SlotType type = this.getSlotType(i);
        if(type == SlotType.IN){
            assert i < IN_SLOTS;
            return this.getXOffset() + 18 * (i%3);
        }
        i -= IN_SLOTS;
        if(type == SlotType.OUT){
            assert i < OUT_SLOTS;
            return this.getXOffset() + 108 + 18 * (i%3);
        }
        i -= OUT_SLOTS;
        if(type == SlotType.POWER){
            assert i < POWER_SLOTS;
            return this.getXOffset() + 18*i;
        }
        assert type == SlotType.CAST;
        return this.getXOffset()+72;
    }

    public int getSlotY(int i) {
        SlotType type = this.getSlotType(i);
        if(type == SlotType.IN){
            assert i < IN_SLOTS;
            return this.getYOffset() + 18 * (i/3);
        }
        i -= IN_SLOTS;
        if(type == SlotType.OUT){
            assert i < OUT_SLOTS;
            return this.getYOffset() + 18 * (i/3);
        }
        i -= OUT_SLOTS;
        if(type == SlotType.POWER){
            assert i < POWER_SLOTS;
            return this.getYOffset()+58;
        }
        assert type == SlotType.CAST;
        return this.getYOffset()+18;
    }

    public int getXOffset(){
        return 8;
    }

    public int getYOffset(){
        return 18;
    }

    private static enum SlotType{
        IN(64), OUT(64), POWER(64), CAST(1);
        private final int maxStack;

        private SlotType(int maxStack){
            this.maxStack = maxStack;
        }

        public int getMaxStack(){
            return this.maxStack;
        }
    }
}
