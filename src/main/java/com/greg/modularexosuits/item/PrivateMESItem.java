package com.greg.modularexosuits.item;

import com.greg.modularexosuits.reference.Reference;
import net.minecraft.item.Item;

public abstract class PrivateMESItem extends Item
{
    public PrivateMESItem()
    {
        super();
        this.setUnlocalizedName(this.getName());
        this.setTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }

    public abstract String getName();
}