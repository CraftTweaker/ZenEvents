package com.crafttweaker.zenevents.compat.tinkerscontruct.events;

import crafttweaker.annotations.*;
import crafttweaker.api.event.IPlayerEvent;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import stanhebben.zenscript.annotations.*;


@ZenClass("mods.tconstruct.ToolBowShootEvent")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConToolBowShootEvent extends ZETiConToolEvent implements IPlayerEvent {
    
    
    private final TinkerToolEvent.OnBowShoot event;
    
    public ZETiConToolBowShootEvent(TinkerToolEvent.OnBowShoot event) {
        super(event);
        this.event = event;
    }
    
    @ZenGetter("ammoItem")
    public IItemStack getAmmoItem() {
        return CraftTweakerMC.getIItemStack(event.ammo);
    }
    
    @ZenGetter("useTime")
    public int getUseTime() {
        return event.useTime;
    }
    
    @ZenGetter("baseInaccuracy")
    public float getBaseInaccuracy() {
        return event.getBaseInaccuracy();
    }
    
    @ZenSetter("baseInaccuracy")
    public void setBaseInaccuracy(float baseInaccuracy) {
        event.setBaseInaccuracy(baseInaccuracy);
    }
    
    @ZenGetter("projectileCount")
    public int getProjectileCount() {
        return event.projectileCount;
    }
    
    @ZenSetter("projectileCount")
    public void setProjectileCount(int projectileCount) {
        event.setProjectileCount(projectileCount);
    }
    
    @ZenGetter("consumeAmmoPerProjectile")
    public boolean getConsumeAmmoPerProjectile() {
        return event.consumeAmmoPerProjectile;
    }
    
    @ZenSetter("consumeAmmoPerProjectile")
    public void setConsumeAmmoPerProjectile(boolean consumeAmmoPerProjectile) {
        event.setConsumeAmmoPerProjectile(consumeAmmoPerProjectile);
    }
    
    @ZenGetter("consumeDurabilityPerProjectile")
    public boolean getConsumeDurabilityPerProjectile() {
        return event.consumeDurabilityPerProjectile;
    }
    
    @ZenSetter("consumeDurabilityPerProjectile")
    public void setConsumeDurabilityPerProjectile(boolean consumeDurabilityPerProjectile) {
        event.setConsumeDurabilityPerProjectile(consumeDurabilityPerProjectile);
    }
    
    @ZenGetter("bonusInaccuracy")
    public float getBonusInaccuracy() {
        return event.bonusInaccuracy;
    }
    
    @ZenSetter("bonusInaccuracy")
    public void setBonusInaccuracy(float bonusInaccuracy) {
        event.setBonusInaccuracy(bonusInaccuracy);
    }
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.entityPlayer);
    }
}
