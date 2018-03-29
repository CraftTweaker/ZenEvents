package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import slimeknights.tconstruct.library.events.TinkerCraftingEvent;
import stanhebben.zenscript.annotations.*;

import java.util.List;

@ZenClass("mods.tconstruct.ToolCraftingEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolCraftingEvent extends ZETiConTinkerEvent {
    
    private final TinkerCraftingEvent.ToolCraftingEvent event;
    
    public ZETiConToolCraftingEvent(TinkerCraftingEvent.ToolCraftingEvent event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("toolParts")
    public List<IItemStack> getToolParts() {
        return CraftTweakerMC.getIItemStackList(event.getToolParts());
    }
    
    
}
