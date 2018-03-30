package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.ToolEvent")
@ZenRegister
@ModOnly("tconstruct")
public abstract class ZETiConToolEvent {
    
    private final TinkerToolEvent event;
    
    protected ZETiConToolEvent(TinkerToolEvent event) {
        this.event = event;
    }
    
    @ZenGetter("item")
    public IItemStack getItem() {
        return CraftTweakerMC.getIItemStack(event.itemStack);
    }
    
    
    
}
