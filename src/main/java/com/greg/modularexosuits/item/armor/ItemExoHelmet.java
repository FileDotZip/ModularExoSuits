package com.greg.modularexosuits.item.armor;

public class ItemExoHelmet extends ItemMESArmor {
    public ItemExoHelmet(){
        super(ExoArmorMaterial.EXO, ArmorType.HELMET);
    }

    @Override
    public String getName() {
        return "exoHelmet";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
