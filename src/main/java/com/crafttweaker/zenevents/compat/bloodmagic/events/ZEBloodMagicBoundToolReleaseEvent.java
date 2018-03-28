package com.crafttweaker.zenevents.compat.bloodmagic.events;

import WayofTime.bloodmagic.event.BoundToolEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.BoundToolReleaseEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicBoundToolReleaseEvent implements IPlayerEvent, IEventCancelable {
    
    private final BoundToolEvent.Release event;
    
    public ZEBloodMagicBoundToolReleaseEvent(BoundToolEvent.Release event) {
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
    
    @ZenGetter("item")
    public IItemStack getItem() {
        return CraftTweakerMC.getIItemStack(event.boundTool);
    }
    
    @ZenGetter("charge")
    public int getCharge() {
        return event.charge;
    }
    
    @ZenSetter("charge")
    public void setCharge(int charge) {
        event.charge = charge;
    }
}
