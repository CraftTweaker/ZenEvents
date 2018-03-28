package com.crafttweaker.zenevents.compat.bloodmagic.Wrapper;

import WayofTime.bloodmagic.ritual.data.IMasterRitualStone;
import crafttweaker.annotations.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.world.*;
import stanhebben.zenscript.annotations.*;


@ZenClass("mods.bloodmagic.MasterRitualStone")
@ZenRegister
@ModOnly("bloodmagic")
public class ZEBloodMagicMasterRitualStone {
    
    private final IMasterRitualStone ritualStone;
    
    public ZEBloodMagicMasterRitualStone(IMasterRitualStone mrs) {
        ritualStone = mrs;
    }
    
    @ZenGetter("cooldown")
    public int getCooldown() {
        return ritualStone.getCooldown();
    }
    
    @ZenSetter("cooldown")
    public void setCooldown(int cooldown) {
        ritualStone.setCooldown(cooldown);
    }
    
    @ZenSetter("active")
    public void setActive(boolean active) {
        ritualStone.setActive(active);
    }
    
    @ZenGetter("areTanksEmpty")
    public boolean getAreTanksEmpty() {
        return ritualStone.areTanksEmpty();
    }
    
    @ZenGetter("runningTime")
    public int getRunningTime() {
        return ritualStone.getRunningTime();
    }
    
    @ZenGetter("world")
    public IWorld getWorld() {
        return CraftTweakerMC.getIWorld(ritualStone.getWorldObj());
    }
    
    @ZenGetter("blockPos")
    public IBlockPos getBlockPos() {
        return CraftTweakerMC.getIBlockPos(ritualStone.getBlockPos());
    }
}
