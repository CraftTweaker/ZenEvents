package com.crafttweaker.zenevents.compat.bloodmagic;

import com.crafttweaker.zenevents.compat.bloodmagic.events.*;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.util.IEventHandler;
import stanhebben.zenscript.annotations.*;

import static com.crafttweaker.zenevents.compat.bloodmagic.BMEventHandler.*;

@ZenExpansion("crafttweaker.events.IEventManager")
@ZenRegister
@ModOnly("bloodmagic")
public class BloodMagicEventsExpansion {
    
    
    @ZenMethod
    public static IEventHandle onBloodAltarCrafted(IEventManager ignored, IEventHandler<ZEBloodMagicAltarCraftedEvent> handler) {
        return elAltarCrafted.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBoundToolCharge(IEventManager ignored, IEventHandler<ZEBloodMagicBoundToolChargeEvent> handler) {
        return elBoundToolChargeEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBoundToolRelease(IEventManager ignored, IEventHandler<ZEBloodMagicBoundToolReleaseEvent> handler) {
        return elBoundToolReleaseEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicItemBind(IEventManager ignored, IEventHandler<ZEBloodMagicItemBindEvent> handler) {
        return elItemBindEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicRitualRun(IEventManager ignored, IEventHandler<ZEBloodMagicRitualEvent.ZEBloodMagicRitualRunEvent> handler) {
        return elRitualRunEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicRitualStop(IEventManager ignored, IEventHandler<ZEBloodMagicRitualEvent.ZEBloodMagicRitualStopEvent> handler) {
        return elRitualStopEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicRitualActivated(IEventManager ignored, IEventHandler<ZEBloodMagicRitualEvent.ZEBloodMagicRitualActivatedEvent> handler) {
        return elRitualActivatedEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicSacrificialKnifeUsed(IEventManager ignored, IEventHandler<ZEBloodMagicSacrificialKnifeUsedEvent> handler) {
        return elSacrificialKnifeUsedEvent.add(handler);
    }
    
    @ZenMethod
    public static IEventHandle onBloodMagicTelepose(IEventManager ignored, IEventHandler<ZEBloodMagicTeleposeEvent> handler) {
        return elTeleposeEvent.add(handler);
    }
}
