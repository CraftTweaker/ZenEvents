package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.block.IBlockState;
import crafttweaker.api.entity.IEntity;
import crafttweaker.api.event.IEventCancelable;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.world.IBlockPos;
import slimeknights.tconstruct.library.events.ProjectileEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.ProjectileHitBlockEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConProjectileHitBlockEvent {
    
    private final ProjectileEvent.OnHitBlock event;
    
    public ZETiConProjectileHitBlockEvent(ProjectileEvent.OnHitBlock event) {
        this.event = event;
    }
    
    @ZenGetter("projectile")
    public IEntity getProjectile() {
        return CraftTweakerMC.getIEntity(event.projectileEntity);
    }
    
    @ZenGetter("speed")
    public float getSpeed() {
        return event.speed;
    }
    
    @ZenGetter("blockPos")
    public IBlockPos getBlockPos() {
        return CraftTweakerMC.getIBlockPos(event.pos);
    }
    
    @ZenGetter("blockState")
    public IBlockState getBlockState() {
        return CraftTweakerMC.getBlockState(event.blockState);
    }
}
