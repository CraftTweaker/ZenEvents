package com.crafttweaker.zenevents.compat.bloodmagic.Wrapper;

import WayofTime.bloodmagic.ritual.data.Ritual;
import crafttweaker.annotations.*;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.bloodmagic.Ritual")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicRitual {
    
    private final Ritual ritual;
    
    public ZEBloodMagicRitual(Ritual ritual) {
        this.ritual = ritual;
    }
    
    @ZenGetter("name")
    public String getName() {
        return ritual.getName();
    }
    
    @ZenGetter("unlocalizedName")
    public String getUnlocalizedName() {
        return ritual.getUnlocalizedName();
    }
    
    @ZenGetter("refreshTime")
    public int getRefreshTime() {
        return ritual.getRefreshTime();
    }
    
    @ZenGetter("refreshCost")
    public int getRefreshCost() {
        return ritual.getRefreshCost();
    }
    
    @ZenGetter("crystalLevel")
    public int getCrystalLevel() {
        return ritual.getCrystalLevel();
    }
    
    @ZenGetter("activationCost")
    public int getActivationCost() {
        return ritual.getActivationCost();
    }
    
    
}
