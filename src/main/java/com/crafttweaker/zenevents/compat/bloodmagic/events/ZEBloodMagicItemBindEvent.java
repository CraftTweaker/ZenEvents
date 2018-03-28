package com.crafttweaker.zenevents.compat.bloodmagic.events;

import WayofTime.bloodmagic.event.ItemBindEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.ItemBindEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicItemBindEvent implements IEventCancelable, IPlayerEvent {
    
    private final ItemBindEvent event;
    
    public ZEBloodMagicItemBindEvent(ItemBindEvent event) {
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
    
    @ZenGetter("item")
    public IItemStack getItem() {
        return CraftTweakerMC.getIItemStack(event.getBindingStack());
    }
    
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.getNewOwner());
    }
}
