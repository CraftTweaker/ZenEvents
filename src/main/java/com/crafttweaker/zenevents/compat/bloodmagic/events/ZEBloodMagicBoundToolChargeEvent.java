package com.crafttweaker.zenevents.compat.bloodmagic.events;

import WayofTime.bloodmagic.event.BoundToolEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.BoundToolChargeEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicBoundToolChargeEvent implements IPlayerEvent, IEventCancelable {
    
    private final BoundToolEvent.Charge event;
    
    public ZEBloodMagicBoundToolChargeEvent(BoundToolEvent.Charge event) {
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
        return CraftTweakerMC.getIItemStack(event.result);
    }

}
