package com.crafttweaker.zenevents.compat.tinkerscontruct;

import com.crafttweaker.zenevents.compat.tinkerscontruct.events.*;
import crafttweaker.util.EventList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.events.*;

public class TiConEventHandler {
    
    static final EventList<ZETiConProjectileLaunch> elProjectileLaunch = new EventList<>();
    static final EventList<ZETiConProjectileHitBlock> elProjectileHitBlock = new EventList<>();
    static final EventList<ZETiConToolCraftingEvent> elToolCrafting = new EventList<>();
    static final EventList<ZETiConToolPartReplaceEvent> elToolPartReplace = new EventList<>();
    static final EventList<ZETiConToolModifyEvent> elToolModify = new EventList<>();
    //static final EventList<ZETiConToolPartCraftingEvent> elToolPartCrafting = new EventList<>();
    //static final EventList<ZETiConToolExtraBlockBreakEvent> elToolExtraBlockBreak = new EventList<>();
    //static final EventList<ZETiConToolRepairEvent> elToolRepair = new EventList<>();
    //static final EventList<ZETiConMattockHoeEvent> elMattockHoe = new EventList<>();
    //static final EventList<ZETiConShovelPathEvent> elShovelPath = new EventList<>();
    //static final EventList<ZETiConScytheHarvestEvent> elScytheHarvest = new EventList<>();
    //static final EventList<ZETiConBowShootEvent> elBowShoot = new EventList<>();
    
    @SubscribeEvent
    public void onProjectileLaunch(ProjectileEvent.OnLaunch event) {
        if(elProjectileLaunch.hasHandlers())
            elProjectileLaunch.publish(new ZETiConProjectileLaunch(event));
    }
    
    @SubscribeEvent
    public void onProjectileHitBlock(ProjectileEvent.OnHitBlock event) {
        if(elProjectileHitBlock.hasHandlers())
            elProjectileHitBlock.publish(new ZETiConProjectileHitBlock(event));
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
}
