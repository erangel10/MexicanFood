package com.rako100.foodmod;

import com.rako100.com.rako100.blocks.FMBlocks;
import com.rako100.creativetabs.MCreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid=RefStrings.MODID, name=RefStrings.NAME, version=RefStrings.VERSION)

public class foodmod {

    //set up proxies
    @SidedProxy(clientSide= RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)

    public static ServerProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //register creative tabs
        MCreativeTabs.initializeTabs();
        //register proxies
        proxy.RegisterRenderInfo();
        //register creative tabs
        MCreativeTabs.initializeTabs();
        //registerblocks
        FMBlocks.mainRegistry();

    }

    @Mod.EventHandler
    public void inIt(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }




}
