package com.crafttweaker.zenevents.compat.bloodmagic.events;


import WayofTime.bloodmagic.event.RitualEvent;
import com.crafttweaker.zenevents.compat.bloodmagic.Wrapper.*;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.RitualEvent")
@ZenRegister
@ModOnly("bloodmagic")
public abstract class ZEBloodMagicRitualEvent {
    
    private final RitualEvent event;
    
    ZEBloodMagicRitualEvent(RitualEvent event) {
        this.event = event;
    }
    
    @ZenGetter("masterRitualStone")
    public ZEBloodMagicMasterRitualStone getMasterRitualStone() {
        return new ZEBloodMagicMasterRitualStone(event.mrs);
    }
    
    @ZenGetter("ritual")
    public ZEBloodMagicRitual getRitual() {
        return new ZEBloodMagicRitual(event.ritual);
    }
    
    @ZenClass("mods.bloodmagic.RitualActivatedEvent")
    @ZenRegister
    @ModOnly("bloodmagic")
    public static class ZEBloodMagicRitualActivatedEvent extends ZEBloodMagicRitualEvent implements IEventCancelable, IPlayerEvent {
        
        private final RitualEvent.RitualActivatedEvent event;
        
        public ZEBloodMagicRitualActivatedEvent(RitualEvent.RitualActivatedEvent event) {
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
        
        @ZenGetter("activationCrystal")
        public IItemStack getActivationCrystal() {
            return CraftTweakerMC.getIItemStack(event.crystalStack);
        }
        
        @ZenGetter("crystalTier")
        public int getCrystalTier() {
            return event.crystalTier;
        }
    }
    
    
    @ZenClass("mods.bloodmagic.RitualRunEvent")
    @ZenRegister
    @ModOnly("bloodmagic")
    public static class ZEBloodMagicRitualRunEvent extends ZEBloodMagicRitualEvent implements IEventCancelable {
        
        private final RitualEvent.RitualRunEvent event;
        
        public ZEBloodMagicRitualRunEvent(RitualEvent.RitualRunEvent event) {
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
    }
    
    
    @ZenClass("mods.bloodmagic.RitualStopEvent")
    @ZenRegister
    @ModOnly("bloodmagic")
    public static class ZEBloodMagicRitualStopEvent extends ZEBloodMagicRitualEvent {
        
        public ZEBloodMagicRitualStopEvent(RitualEvent.RitualStopEvent event) {
            super(event);
        }
    }
}
