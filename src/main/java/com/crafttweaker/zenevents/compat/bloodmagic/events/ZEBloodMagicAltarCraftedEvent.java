package com.crafttweaker.zenevents.compat.bloodmagic.events;

import WayofTime.bloodmagic.api.event.BloodMagicCraftedEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.AltarCraftedEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicAltarCraftedEvent {
    
    private final BloodMagicCraftedEvent.Altar event;
    
    public ZEBloodMagicAltarCraftedEvent(BloodMagicCraftedEvent.Altar event) {
        this.event = event;
    }
    
    @ZenGetter("output")
    public final IItemStack getOutput() {
        return CraftTweakerMC.getIItemStack(event.getOutput());
    }
    
    @ZenSetter("output")
    public final void setOutput(IItemStack output) {
        event.setOutput(CraftTweakerMC.getItemStack(output));
    }
}
