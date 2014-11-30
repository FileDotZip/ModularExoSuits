package com.greg.modularexosuits.item;

import com.greg.modularexosuits.reference.Reference;

/**
 * Created by Greg on 11/29/2014.
 */
public class ItemPoke extends PrivateMESItem{
    public ItemPoke(){
        this.setUnlocalizedName(this.getName());
        this.setTextureName(String.format("%s:%s", Reference.MOD_ID, this.getName()));
    }
    public String getName() {
        return "poke";
    }
}
