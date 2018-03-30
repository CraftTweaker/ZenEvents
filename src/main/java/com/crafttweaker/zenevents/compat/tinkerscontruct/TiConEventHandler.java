package com.crafttweaker.zenevents.compat.tinkerscontruct;

import com.crafttweaker.zenevents.compat.tinkerscontruct.events.*;
import crafttweaker.util.EventList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.events.*;

public class TiConEventHandler {
    
    static final EventList<ZETiConProjectileLaunchEvent> elProjectileLaunch = new EventList<>();
    static final EventList<ZETiConProjectileHitBlockEvent> elProjectileHitBlock = new EventList<>();
    static final EventList<ZETiConToolCraftingEvent> elToolCrafting = new EventList<>();
    static final EventList<ZETiConToolPartReplaceEvent> elToolPartReplace = new EventList<>();
    static final EventList<ZETiConToolModifyEvent> elToolModify = new EventList<>();
    static final EventList<ZETiConToolPartCraftingEvent> elToolPartCrafting = new EventList<>();
    static final EventList<ZETiConToolExtraBlockBreakEvent> elToolExtraBlockBreak = new EventList<>();
    static final EventList<ZETiConToolRepairEvent> elToolRepair = new EventList<>();
    static final EventList<ZETiConToolMattockHoeEvent> elToolMattockHoe = new EventList<>();
    static final EventList<ZETiConToolShovelMakePathEvent> elToolShovelPath = new EventList<>();
    static final EventList<ZETiConToolScytheHarvestEvent> elToolScytheHarvest = new EventList<>();
    static final EventList<ZETiConToolBowShootEvent> elToolBowShoot = new EventList<>();
    
    @SubscribeEvent
    public void onProjectileLaunch(ProjectileEvent.OnLaunch event) {
        if(elProjectileLaunch.hasHandlers())
            elProjectileLaunch.publish(new ZETiConProjectileLaunchEvent(event));
    }
    
    @SubscribeEvent
    public void onProjectileHitBlock(ProjectileEvent.OnHitBlock event) {
        if(elProjectileHitBlock.hasHandlers())
            elProjectileHitBlock.publish(new ZETiConProjectileHitBlockEvent(event));
    }
    
    @SubscribeEvent
    public void onToolCrafting(TinkerCraftingEvent.ToolCraftingEvent event) {
        if(elToolCrafting.hasHandlers())
            elToolCrafting.publish(new ZETiConToolCraftingEvent(event));
    }
    
    @SubscribeEvent
    public void onToolPartReplace(TinkerCraftingEvent.ToolPartReplaceEvent event) {
        if(elToolPartReplace.hasHandlers())
            elToolPartReplace.publish(new ZETiConToolPartReplaceEvent(event));
    }
    
    @SubscribeEvent
    public void onToolModify(TinkerCraftingEvent.ToolModifyEvent event) {
        if(elToolModify.hasHandlers())
            elToolModify.publish(new ZETiConToolModifyEvent(event));
    }
    
    @SubscribeEvent
    public void onToolPartCrafting(TinkerCraftingEvent.ToolPartCraftingEvent event) {
        if(elToolPartCrafting.hasHandlers()) {
            elToolPartCrafting.publish(new ZETiConToolPartCraftingEvent(event));
        }
    }
    
    @SubscribeEvent
    public void onToolExtraBlockBreak(TinkerToolEvent.ExtraBlockBreak event) {
        if(elToolExtraBlockBreak.hasHandlers())
            elToolExtraBlockBreak.publish(new ZETiConToolExtraBlockBreakEvent(event));
    }
    
    @SubscribeEvent
    public void onToolRepair(TinkerToolEvent.OnRepair event) {
        if(elToolRepair.hasHandlers())
            elToolRepair.publish(new ZETiConToolRepairEvent(event));
    }
    
    @SubscribeEvent
    public void onToolMattockHoe(TinkerToolEvent.OnMattockHoe event) {
        if(elToolMattockHoe.hasHandlers())
            elToolMattockHoe.publish(new ZETiConToolMattockHoeEvent(event));
    }
    
    @SubscribeEvent
    public void onToolShovelPath(TinkerToolEvent.OnShovelMakePath event) {
        if(elToolShovelPath.hasHandlers())
            elToolShovelPath.publish(new ZETiConToolShovelMakePathEvent(event));
    }
    
    @SubscribeEvent
    public void onToolScytheHarvest(TinkerToolEvent.OnScytheHarvest event) {
        if(elToolScytheHarvest.hasHandlers())
            elToolScytheHarvest.publish(new ZETiConToolScytheHarvestEvent(event));
    }
    
    @SubscribeEvent
    public void onToolBowShoot(TinkerToolEvent.OnBowShoot event) {
        if(elToolBowShoot.hasHandlers())
            elToolBowShoot.publish(new ZETiConToolBowShootEvent(event));
    }
}
