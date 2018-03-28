package com.crafttweaker.zenevents;

import com.crafttweaker.zenevents.compat.bloodmagic.BMEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ZenEvents.MODID, version = "0.0.0", name = ZenEvents.NAME, acceptedMinecraftVersions = "[1.12, 1.13)")
public class ZenEvents {
    
    public static final String MODID = "zenevents";
    public static final String NAME = "ZenEvents";
    
    @Mod.Instance(MODID)
    public static ZenEvents INSTANCE;
    
    @Mod.EventHandler
    public void onPreInitialization(FMLPreInitializationEvent ev) {
        if(Loader.isModLoaded("bloodmagic")) {
            MinecraftForge.EVENT_BUS.register(BMEventHandler.class);
        }
    }
}