package com.crafttweaker.zenevents.compat.gamestages;

import com.crafttweaker.zenevents.compat.gamestages.events.ZEGameStageEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.util.IEventHandler;
import stanhebben.zenscript.annotations.*;

import static com.crafttweaker.zenevents.compat.gamestages.GameStagesEventHandler.*;

@ZenExpansion("crafttweaker.events.IEventManager")
@ZenRegister
@ModOnly("gamestages")
public class GameStageEventsExpansion {
    
    @ZenMethod
    public static IEventHandle onGameStagesAdd(IEventManager ignored, IEventHandler<ZEGameStageEvent.ZEGameStageEventCancelable> eventHandler) {
        return elAdd.add(eventHandler);
    }
    
    @ZenMethod
    public static IEventHandle onGameStagesAdded(IEventManager ignored, IEventHandler<ZEGameStageEvent> eventHandler) {
        return elAdded.add(eventHandler);
    }
    
    @ZenMethod
    public static IEventHandle onGameStagesRemove(IEventManager ignored, IEventHandler<ZEGameStageEvent.ZEGameStageEventCancelable> eventHandler) {
        return elRemove.add(eventHandler);
    }
    
    @ZenMethod
    public static IEventHandle onGameStagesRemoved(IEventManager ignored, IEventHandler<ZEGameStageEvent> eventHandler) {
        return elRemoved.add(eventHandler);
    }
    
    @ZenMethod
    public static IEventHandle onGameStagesCheck(IEventManager ignored, IEventHandler<ZEGameStageEvent.ZEGameStageEventCancelable> eventHandler) {
        return elCheck.add(eventHandler);
    }
}
