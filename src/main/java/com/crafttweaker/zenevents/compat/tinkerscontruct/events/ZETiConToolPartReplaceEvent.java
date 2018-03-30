package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import slimeknights.tconstruct.library.events.*;
import stanhebben.zenscript.annotations.*;

import java.util.List;

@ZenClass("mods.tconstruct.ToolPartReplaceEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolPartReplaceEvent extends ZETiConTinkerCraftingEvent {
    
    private final TinkerCraftingEvent.ToolPartReplaceEvent event;
    
    public ZETiConToolPartReplaceEvent(TinkerCraftingEvent.ToolPartReplaceEvent event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("toolParts")
    public List<IItemStack> getToolParts() {
        return CraftTweakerMC.getIItemStackList(event.getToolParts());
    }
    
    
}
