package com.crafttweaker.zenevents.compat.botania.events;


import crafttweaker.annotations.*;
import crafttweaker.api.event.IPlayerEvent;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;
import vazkii.botania.api.mana.ManaDiscountEvent;

@ZenClass("mods.botania.ManaDiscountEvent")
@ZenRegister
@ModOnly("botania")
public class ZEBotaniaManaDiscountEvent implements IPlayerEvent {
    private final ManaDiscountEvent event;
    
    
    public ZEBotaniaManaDiscountEvent(ManaDiscountEvent event) {
        this.event = event;
    }
    
    @ZenGetter("item")
    public IItemStack getItem() {
        return CraftTweakerMC.getIItemStack(event.getTool());
    }
    
    @ZenGetter("discount")
    public float getDiscount() {
        return event.getDiscount();
    }
    
    @ZenSetter("discount")
    public void setDiscount(float discount) {
        event.setDiscount(discount);
    }
    
    @Override
    public IPlayer getPlayer() {
        return CraftTweakerMC.getIPlayer(event.getEntityPlayer());
    }
}
