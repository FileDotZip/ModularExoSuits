package com.greg.modularexosuits.item.armor;

public class ItemExoLeggings extends ItemMESArmor {
    public ItemExoLeggings(){
        super(ExoArmorMaterial.EXO, ArmorType.LEGGINGS);
    }

    @Override
    public String getName() {
        return "exoLeggings";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
