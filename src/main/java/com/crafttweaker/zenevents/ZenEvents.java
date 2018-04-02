package com.crafttweaker.zenevents;

import com.crafttweaker.zenevents.compat.bloodmagic.BMEventHandler;
import com.crafttweaker.zenevents.compat.botania.BotaniaEventHandler;
import com.crafttweaker.zenevents.compat.gamestages.GameStagesEventHandler;
import com.crafttweaker.zenevents.compat.tinkerscontruct.TiConEventHandler;
import crafttweaker.mc1120.world.MCFacing;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ZenEvents.MODID, version = "0.0.0", name = ZenEvents.NAME, acceptedMinecraftVersions = "[1.12, 1.13)", dependencies = "required:crafttweaker")
public class ZenEvents {
    
    public static final String MODID = "zenevents";
    public static final String NAME = "ZenEvents";
    
    @Mod.Instance(MODID)
    public static ZenEvents INSTANCE;
    
    @Mod.EventHandler
    public void onPreInitialization(FMLPreInitializationEvent ev) {
        if(Loader.isModLoaded("bloodmagic"))
            MinecraftForge.EVENT_BUS.register(BMEventHandler.class);
        if(Loader.isModLoaded("botania"))
            MinecraftForge.EVENT_BUS.register(BotaniaEventHandler.class);
        if(Loader.isModLoaded("tconstruct"))
            MinecraftForge.EVENT_BUS.register(TiConEventHandler.class);
        if(Loader.isModLoaded("gamestages"))
            MinecraftForge.EVENT_BUS.register(GameStagesEventHandler.class);
    }
}
