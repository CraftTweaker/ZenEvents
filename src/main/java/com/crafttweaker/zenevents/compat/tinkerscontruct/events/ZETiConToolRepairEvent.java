package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;


@ZenClass("mods.tconstruct.ToolRepairEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolRepairEvent extends ZETiConToolEvent {
    
    
    private final TinkerToolEvent.OnRepair event;
    
    public ZETiConToolRepairEvent(TinkerToolEvent.OnRepair event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("repairAmount")
    public int getRepairAmount() {
        return event.amount;
    }
}
