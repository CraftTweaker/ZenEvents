package com.crafttweaker.zenevents.compat.bloodmagic.events;


import WayofTime.bloodmagic.event.TeleposeEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.block.IBlockState;
import crafttweaker.api.event.IEventCancelable;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.world.*;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.TeleposeEvent")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicTeleposeEvent implements IEventCancelable {
    
    private final TeleposeEvent event;
    
    public ZEBloodMagicTeleposeEvent(TeleposeEvent event) {
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
    
    @ZenGetter("initalWorld")
    public IWorld getInitalWorld() {
        return CraftTweakerMC.getIWorld(event.initalWorld);
    }
    
    @ZenGetter("initialBlockPos")
    public IBlockPos getInitialBlockPos() {
        return CraftTweakerMC.getIBlockPos(event.initialBlockPos);
    }
    
    @ZenGetter("initialState")
    public IBlockState getInitialState() {
        return CraftTweakerMC.getBlockState(event.initialState);
    }
    
    @ZenGetter("finalWorld")
    public IWorld getFinalWorld() {
        return CraftTweakerMC.getIWorld(event.finalWorld);
    }
    
    @ZenGetter("finalBlockPos")
    public IBlockPos getFinalBlockPos() {
        return CraftTweakerMC.getIBlockPos(event.finalBlockPos);
    }
    
    @ZenGetter("finalState")
    public IBlockState getFinalState() {
        return CraftTweakerMC.getBlockState(event.finalState);
    }
}
