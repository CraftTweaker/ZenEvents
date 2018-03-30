package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.block.IBlockState;
import crafttweaker.api.event.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.ToolExtraBlockBreakEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolExtraBlockBreakEvent extends ZETiConToolEvent implements IEventCancelable, IPlayerEvent {
    
    private final TinkerToolEvent.ExtraBlockBreak event;
    
    public ZETiConToolExtraBlockBreakEvent(TinkerToolEvent.ExtraBlockBreak event) {
        super(event);
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
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.player);
    }
    
    @ZenGetter("blockState")
    public IBlockState getBlockState() {
        return CraftTweakerMC.getBlockState(event.state);
    }
    
    @ZenGetter("height")
    public int getHeight() {
        return event.height;
    }
    
    @ZenSetter("height")
    public void setHeight(int height) {
        event.height = height;
    }
    
    @ZenGetter("width")
    public int getWidth() {
        return event.width;
    }
    
    @ZenSetter("width")
    public void setWidth(int width) {
        event.width = width;
    }
    
    @ZenGetter("depth")
    public int getDepth() {
        return event.depth;
    }
    
    @ZenSetter("depth")
    public void setDepth(int depth) {
        event.depth = depth;
    }
    
    @ZenGetter("distance")
    public int getDistance() {
        return event.distance;
    }
    
    @ZenSetter("distance")
    public void setDistance(int distance) {
        event.distance = distance;
    }
    
    
}
