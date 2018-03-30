package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.block.IBlockState;
import crafttweaker.api.event.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import crafttweaker.api.world.*;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;


@ZenClass("mods.tconstruct.ToolScytheHarvestEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolScytheHarvestEvent extends ZETiConToolEvent implements IPlayerEvent, IEventCancelable, IBlockEvent {
    
    
    private final TinkerToolEvent.OnScytheHarvest event;
    
    public ZETiConToolScytheHarvestEvent(TinkerToolEvent.OnScytheHarvest event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("harvestable")
    public boolean getHarvestable() {
        return event.harvestable;
    }
    
    @Override
    public IWorld getWorld() {
        return CraftTweakerMC.getIWorld(event.world);
    }
    
    @Override
    public IBlockState getBlockState() {
        return CraftTweakerMC.getBlockState(event.blockState);
    }
    
    @Override
    public boolean isCanceled() {
        return event.isCanceled();
    }
    
    @Override
    public void setCanceled(boolean canceled) {
        event.setCanceled(canceled);
    }
    
    @Override
    public IBlockPos getPosition() {
        return CraftTweakerMC.getIBlockPos(event.pos);
    }
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.player);
    }
}
