package com.crafttweaker.zenevents.compat.bloodmagic.events;

import WayofTime.bloodmagic.event.SacrificeKnifeUsedEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.SacrificialKnifeUsedEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicSacrificialKnifeUsedEvent implements IPlayerEvent, IEventCancelable {
    
    private final SacrificeKnifeUsedEvent event;
    
    public ZEBloodMagicSacrificialKnifeUsedEvent(SacrificeKnifeUsedEvent event) {
        this.event = event;
    }
    
    @Override
    public boolean isCanceled() {
        return event.isCanceled();
    }
    
    @Override
    public void setCanceled(boolean canceled) {
        event.setCanceled(canceled);
    }
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.player);
    }
    
    @ZenGetter("healthDrained")
    public int getHealthDrained() {
        return event.healthDrained;
    }
    
    @ZenGetter("lpAdded")
    public int getLpAdded() {
        return event.lpAdded;
    }
    
    @ZenSetter("lpAdded")
    public void setLpAdded(int lpAdded) {
        event.lpAdded = lpAdded;
    }
    
    @ZenGetter("shouldDrainHealth")
    public boolean getShouldDrainHealth() {
        return event.shouldDrainHealth;
    }
    
    @ZenSetter("shouldDrainHealth")
    public void setShouldDrainHealth(boolean shouldDrainHealth) {
        event.shouldDrainHealth = shouldDrainHealth;
    }
    
    @ZenGetter("shouldFillAltar")
    public boolean getShouldFillAltar() {
        return event.shouldFillAltar;
    }
    
    @ZenSetter("shouldFillAltar")
    public void setShouldFillAltar(boolean shouldFillAltar) {
        event.shouldFillAltar = shouldFillAltar;
    }
}
