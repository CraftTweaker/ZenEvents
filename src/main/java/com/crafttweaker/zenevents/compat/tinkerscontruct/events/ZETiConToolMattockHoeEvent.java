package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import crafttweaker.api.world.*;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;


@ZenClass("mods.tconstruct.ToolMattockHoeEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolMattockHoeEvent extends ZETiConToolEvent implements IPlayerEvent, IEventPositionable {
    
    
    private final TinkerToolEvent.OnMattockHoe event;
    
    public ZETiConToolMattockHoeEvent(TinkerToolEvent.OnMattockHoe event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("world")
    public IWorld getWorld() {
        return CraftTweakerMC.getIWorld(event.world);
    }
    
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.player);
    }
    
    @Override
    public IBlockPos getPosition() {
        return CraftTweakerMC.getIBlockPos(event.pos);
    }
}
