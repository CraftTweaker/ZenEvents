package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import slimeknights.tconstruct.library.events.TinkerCraftingEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.ToolModifyEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolModifyEvent extends ZETiConTinkerEvent {
    
    private final TinkerCraftingEvent.ToolModifyEvent event;
    
    public ZETiConToolModifyEvent(TinkerCraftingEvent.ToolModifyEvent event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("toolBeforeModification")
    public IItemStack getToolBeforeModification() {
        return CraftTweakerMC.getIItemStack(event.getToolBeforeModification());
    }
    
}
