package com.greg.modularexosuits.item.armor;

public class ItemExoChestplate extends ItemMESArmor {
    public ItemExoChestplate(){
        super(ExoArmorMaterial.EXO, ArmorType.CHESTPLATE);
    }

    @Override
    public String getName() {
        return "exoChestplate";
    }
    public String getTextureName(){
        return "exoarmor";
    }
}
