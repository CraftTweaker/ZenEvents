package com.crafttweaker.zenevents.compat.gamestages;

import com.crafttweaker.zenevents.compat.gamestages.events.ZEGameStageEvent;
import crafttweaker.util.EventList;
import net.darkhax.gamestages.event.GameStageEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.crafttweaker.zenevents.compat.gamestages.events.ZEGameStageEvent.ZEGameStageEventCancelable;

public class GameStagesEventHandler {
    
    static final EventList<ZEGameStageEventCancelable> elAdd = new EventList<>();
    static final EventList<ZEGameStageEvent> elAdded = new EventList<>();
    static final EventList<ZEGameStageEventCancelable> elRemove = new EventList<>();
    static final EventList<ZEGameStageEvent> elRemoved = new EventList<>();
    static final EventList<ZEGameStageEventCancelable> elCheck = new EventList<>();
    
    @SubscribeEvent
    public static void onAdd(GameStageEvent.Add event) {
        if(elAdd.hasHandlers()) {
            elAdd.publish(new ZEGameStageEventCancelable(event));
        }
    }
    
    @SubscribeEvent
    public static void onAdded(GameStageEvent.Added event) {
        if(elAdded.hasHandlers()) {
            elAdded.publish(new ZEGameStageEvent(event));
        }
    }
    
    @SubscribeEvent
    public static void onRemove(GameStageEvent.Remove event) {
        if(elRemove.hasHandlers()) {
            elRemove.publish(new ZEGameStageEventCancelable(event));
        }
    }
    
    @SubscribeEvent
    public static void onRemoved(GameStageEvent.Removed event) {
        if(elRemoved.hasHandlers()) {
            elRemoved.publish(new ZEGameStageEvent(event));
        }
    }
    
    @SubscribeEvent
    public static void onCheck(GameStageEvent.Check event) {
        if(elCheck.hasHandlers()) {
            elCheck.publish(new ZEGameStageEventCancelable(event));
        }
    }
}
