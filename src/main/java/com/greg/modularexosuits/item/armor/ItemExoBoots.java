package com.greg.modularexosuits.item.armor;

public class ItemExoBoots extends ItemMESArmor {
    public ItemExoBoots(){
        super(ExoArmorMaterial.EXO, ArmorType.BOOTS);
    }

    @Override
    public String getName() {
        return "exoBoots";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
