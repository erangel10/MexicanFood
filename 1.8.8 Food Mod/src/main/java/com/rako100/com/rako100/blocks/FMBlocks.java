package com.rako100.com.rako100.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FMBlocks {

    //register blocks
    public static void mainRegistry()
    {
        initializeBlock();
        registerBlock();

    }

    //declare blocks
    public static Block random;


    public static void initializeBlock()
    {
        random = new random().setBlockName("random");
    }

    public static void registerBlock()
    {

        GameRegistry.registerBlock(random, random.getUnlocalizedName());
    }
}
