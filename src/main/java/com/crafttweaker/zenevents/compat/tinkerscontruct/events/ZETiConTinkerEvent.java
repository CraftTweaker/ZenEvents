package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.event.IEventCancelable;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import slimeknights.tconstruct.library.events.*;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.TinkerEvent")
@ZenRegister
@ModOnly("tconstruct")
public abstract class ZETiConTinkerEvent implements IEventCancelable {
    private final TinkerCraftingEvent event;
    
    protected ZETiConTinkerEvent(TinkerCraftingEvent event) {
        this.event = event;
    }
    
    @ZenGetter("item")
    public IItemStack getItem() {
        return CraftTweakerMC.getIItemStack(event.getItemStack());
    }
    
    @Override
    public boolean isCanceled() {
        return event.isCanceled();
    }
    
    @Override
    public void setCanceled(boolean canceled) {
        event.setCanceled(canceled);
    }
    
    @ZenGetter("player")
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.getPlayer());
    }
    
    @ZenGetter("message")
    public String getMessage() {
        return event.getMessage();
    }
    
    @ZenMethod
    public void setCanceled(String localizedMessage) {
        event.setCanceled(localizedMessage);
    }
    
}
