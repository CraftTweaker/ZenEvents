package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.entity.*;
import crafttweaker.api.event.IEventCancelable;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import slimeknights.tconstruct.library.events.ProjectileEvent;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.tconstruct.ProjectileLaunchEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConProjectileLaunch implements IEventCancelable {
    
    private final ProjectileEvent.OnLaunch event;
    
    public ZETiConProjectileLaunch(ProjectileEvent.OnLaunch event) {
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
    
    @ZenGetter("shooter")
    public IEntityLivingBase getShooter() {
        return CraftTweakerMC.getIEntityLivingBase(event.shooter);
    }
    
    @ZenGetter("projectile")
    public IEntity getProjectile() {
        return CraftTweakerMC.getIEntity(event.projectileEntity);
    }
    
    @ZenGetter("launcher")
    public IItemStack getLauncher() {
        return CraftTweakerMC.getIItemStack(event.launcher);
    }
}
