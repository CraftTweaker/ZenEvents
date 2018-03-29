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
    public static IEventHandle onTiConstructProjectileHitBlock(IEventManager ignored, IEventHandler<ZETiConProjectileHitBlock> handler) {
        return elProjectileHitBlock.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTiConstructProjectileLaunch(IEventManager ignored, IEventHandler<ZETiConProjectileLaunch> handler) {
        return elProjectileLaunch.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTiConstructToolCrafting(IEventManager ignored, IEventHandler<ZETiConToolCraftingEvent> handler) {
        return elToolCrafting.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTiConstructToolModify(IEventManager ignored, IEventHandler<ZETiConToolModifyEvent> handler) {
        return elToolModify.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onTiConPartReplace(IEventManager ignored, IEventHandler<ZETiConToolPartReplaceEvent> handler) {
        return elToolPartReplace.add(handler);
    }
}
