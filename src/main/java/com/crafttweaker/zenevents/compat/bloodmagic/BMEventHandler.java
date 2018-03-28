package com.crafttweaker.zenevents.compat.bloodmagic;

import WayofTime.bloodmagic.api.event.BloodMagicCraftedEvent;
import WayofTime.bloodmagic.event.*;
import com.crafttweaker.zenevents.compat.bloodmagic.events.*;
import crafttweaker.util.EventList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BMEventHandler {
    
    static final EventList<ZEBloodMagicAltarCraftedEvent> elAltarCrafted = new EventList<>();
    static final EventList<ZEBloodMagicBoundToolChargeEvent> elBoundToolChargeEvent = new EventList<>();
    static final EventList<ZEBloodMagicBoundToolReleaseEvent> elBoundToolReleaseEvent = new EventList<>();
    static final EventList<ZEBloodMagicItemBindEvent> elItemBindEvent = new EventList<>();
    static final EventList<ZEBloodMagicRitualEvent.ZEBloodMagicRitualActivatedEvent> elRitualActivatedEvent = new EventList<>();
    static final EventList<ZEBloodMagicRitualEvent.ZEBloodMagicRitualRunEvent> elRitualRunEvent = new EventList<>();
    static final EventList<ZEBloodMagicRitualEvent.ZEBloodMagicRitualStopEvent> elRitualStopEvent = new EventList<>();
    static final EventList<ZEBloodMagicSacrificialKnifeUsedEvent> elSacrificialKnifeUsedEvent = new EventList<>();
    static final EventList<ZEBloodMagicTeleposeEvent> elTeleposeEvent = new EventList<>();
    
    
    @SubscribeEvent
    public static void onBloodAltarCrafted(BloodMagicCraftedEvent.Altar event) {
        if(elAltarCrafted.hasHandlers())
            elAltarCrafted.publish(new ZEBloodMagicAltarCraftedEvent(event));
    }
    
    @SubscribeEvent
    public static void onBoundToolCharge(BoundToolEvent.Charge event) {
        if(elBoundToolChargeEvent.hasHandlers())
            elBoundToolChargeEvent.publish(new ZEBloodMagicBoundToolChargeEvent(event));
    }
    
    @SubscribeEvent
    public static void onBoundtoolRelease(BoundToolEvent.Release event) {
        if(elBoundToolReleaseEvent.hasHandlers())
            elBoundToolReleaseEvent.publish(new ZEBloodMagicBoundToolReleaseEvent(event));
    }
    
    @SubscribeEvent
    public static void onItemBind(ItemBindEvent event) {
        if(elItemBindEvent.hasHandlers())
            elItemBindEvent.publish(new ZEBloodMagicItemBindEvent(event));
    }
    
    @SubscribeEvent
    public static void onRitualActivated(RitualEvent.RitualActivatedEvent event) {
        if(elRitualActivatedEvent.hasHandlers())
            elRitualActivatedEvent.publish(new ZEBloodMagicRitualEvent.ZEBloodMagicRitualActivatedEvent(event));
    }
    
    @SubscribeEvent
    public static void onRitualRun(RitualEvent.RitualRunEvent event) {
        if(elRitualRunEvent.hasHandlers())
            elRitualRunEvent.publish(new ZEBloodMagicRitualEvent.ZEBloodMagicRitualRunEvent(event));
    }
    
    @SubscribeEvent
    public static void onRitualStop(RitualEvent.RitualStopEvent event) {
        if(elRitualStopEvent.hasHandlers())
            elRitualStopEvent.publish(new ZEBloodMagicRitualEvent.ZEBloodMagicRitualStopEvent(event));
    }
    
    @SubscribeEvent
    public static void onSacrificialKniveUsed(SacrificeKnifeUsedEvent event) {
        if(elSacrificialKnifeUsedEvent.hasHandlers())
            elSacrificialKnifeUsedEvent.publish(new ZEBloodMagicSacrificialKnifeUsedEvent(event));
    }
    
    @SubscribeEvent
    public static void onTelepose(TeleposeEvent event) {
        if(elTeleposeEvent.hasHandlers())
            elTeleposeEvent.publish(new ZEBloodMagicTeleposeEvent(event));
    }
}
