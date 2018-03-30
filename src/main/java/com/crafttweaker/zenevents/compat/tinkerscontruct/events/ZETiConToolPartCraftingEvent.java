package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import slimeknights.tconstruct.library.events.TinkerCraftingEvent;
import stanhebben.zenscript.annotations.ZenClass;

@ZenClass("mods.tconstruct.ToolPartCraftingEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolPartCraftingEvent extends ZETiConTinkerCraftingEvent {
    public ZETiConToolPartCraftingEvent(TinkerCraftingEvent.ToolPartCraftingEvent event) {
        super(event);
    }
}
