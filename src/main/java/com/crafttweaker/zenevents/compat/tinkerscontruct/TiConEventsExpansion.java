package com.crafttweaker.zenevents.compat.tinkerscontruct;

import com.crafttweaker.zenevents.compat.tinkerscontruct.events.*;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.util.IEventHandler;
import stanhebben.zenscript.annotations.*;

import static com.crafttweaker.zenevents.compat.tinkerscontruct.TiConEventHandler.*;

@ZenExpansion("crafttweaker.events.IEventManager")
@ZenRegister
@ModOnly("tconstruct")
public class TiConEventsExpansion {
    
    @ZenMethod
    public static IEventHandle onTConstructProjectileHitBlock(IEventManager ignored, IEventHandler<ZETiConProjectileHitBlockEvent> handler) {
        return elProjectileHitBlock.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructProjectileLaunch(IEventManager ignored, IEventHandler<ZETiConProjectileLaunchEvent> handler) {
        return elProjectileLaunch.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolCrafting(IEventManager ignored, IEventHandler<ZETiConToolCraftingEvent> handler) {
        return elToolCrafting.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolModify(IEventManager ignored, IEventHandler<ZETiConToolModifyEvent> handler) {
        return elToolModify.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolPartReplace(IEventManager ignored, IEventHandler<ZETiConToolPartReplaceEvent> handler) {
        return elToolPartReplace.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolPartCrafting(IEventManager ignored, IEventHandler<ZETiConToolPartCraftingEvent> handler) {
        return elToolPartCrafting.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolExtraBlockBreak(IEventManager ignored, IEventHandler<ZETiConToolExtraBlockBreakEvent> handler) {
        return elToolExtraBlockBreak.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolRepair(IEventManager ignored, IEventHandler<ZETiConToolRepairEvent> handler) {
        return elToolRepair.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolMattockHoe(IEventManager ignored, IEventHandler<ZETiConToolMattockHoeEvent> handler) {
        return elToolMattockHoe.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolShovelPath(IEventManager ignored, IEventHandler<ZETiConToolShovelMakePathEvent> handler) {
        return elToolShovelPath.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolScytheHarvest(IEventManager ignored, IEventHandler<ZETiConToolScytheHarvestEvent> handler) {
        return elToolScytheHarvest.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTConstructToolBowShoot(IEventManager ignored, IEventHandler<ZETiConToolBowShootEvent> handler) {
        return elToolBowShoot.add(handler);
    }
}
