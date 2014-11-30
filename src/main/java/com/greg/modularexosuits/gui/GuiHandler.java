package com.greg.modularexosuits.gui;

import com.greg.modularexosuits.block.container.VacuumInductionSmelterContainer;
import com.greg.modularexosuits.block.tileentity.VacuumInductionSmelterTileEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{
    //returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof VacuumInductionSmelterTileEntity){
            return new VacuumInductionSmelterContainer(player.inventory, (VacuumInductionSmelterTileEntity) tileEntity);
        }
        return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof VacuumInductionSmelterTileEntity){
            return new VacuumInductionSmelterGUI(player.inventory, (VacuumInductionSmelterTileEntity) tileEntity);
        }
        return null;

    }
}
