package com.crafttweaker.zenevents.compat.gamestages.events;

import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import net.darkhax.gamestages.event.GameStageEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.gamestages.GameStageEvent")
@ZenRegister
@ModOnly("gamestages")
public class ZEGameStageEvent implements IPlayerEvent {
    
    protected final GameStageEvent event;
    
    public ZEGameStageEvent(GameStageEvent event) {
        this.event = event;
    }
    
    @ZenGetter("stage")
    public String getStage() {
        return event.getStageName();
    }
    
    @ZenSetter("stage")
    public void setStage(String stage) {
        event.setStage(stage);
    }
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.getPlayer());
    }
    
    @ZenClass("mods.gamestages.GameStageEventCancelable")
    @ZenRegister
    @ModOnly("gamestages")
    public static class ZEGameStageEventCancelable extends ZEGameStageEvent implements IEventCancelable {
        
        public ZEGameStageEventCancelable(GameStageEvent event) {
            super(event);
        }
        
        @Override
        public boolean isCanceled() {
            return event.isCanceled();
        }
        
        @Override
        public void setCanceled(boolean canceled) {
            event.setCanceled(canceled);
        }
    }
}
