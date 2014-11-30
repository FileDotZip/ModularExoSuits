package com.greg.modularexosuits.gui;

import com.greg.modularexosuits.block.container.VacuumInductionSmelterContainer;
import com.greg.modularexosuits.block.tileentity.VacuumInductionSmelterTileEntity;
import com.greg.modularexosuits.reference.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class VacuumInductionSmelterGUI extends GuiContainer{
    public VacuumInductionSmelterGUI(InventoryPlayer inventoryPlayer, VacuumInductionSmelterTileEntity tileEntity) {
        super(new VacuumInductionSmelterContainer(inventoryPlayer, tileEntity));
        this.xSize = 176;
        this.ySize = 180;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory.vacuumInductionSmelter"), 8, 6, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        //draw your Gui here, only thing you need to change is the path
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/vacuumInductionSmelter.png"));
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
