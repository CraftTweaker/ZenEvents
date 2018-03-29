package com.crafttweaker.zenevents.compat.tinkerscontruct.custom;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.*;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.mc1120.events.handling.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;
import slimeknights.tconstruct.library.traits.ITrait;
import stanhebben.zenscript.annotations.*;

import javax.annotation.Nonnull;

@ZenClass("mods.tconstruct.modifiers.custom")
@ZenRegister
@ModOnly("tconstruct")
public class ZETiConModifier extends ModifierTrait implements ITrait {
    
    @ZenProperty
    public boolean hidden = false;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.afterBlockBreak afterBlockBreak = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.beforeBlockBreak beforeBlockBreak = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.blockHarvestDrops onBlockHarvestDrops = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.damage onDamage = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.isCriticalHit calcCrit = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.miningSpeed getMiningSpeed = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onHit onHit = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onUpdate onUpdate = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.afterHit afterHit = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.knockBack calcKnockBack = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onBlock onBlock = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onToolDamage calcToolDamage = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onToolHeal calcToolHeal = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onToolRepair onToolRepair = null;
    
    @ZenProperty
    public ZeTiConModifierEventHandlers.onPlayerHurt onPlayerHurt = null;
    
    public ZETiConModifier(@Nonnull String identifier, int color, int maxLevel, int countPerLevel) {
        super(identifier, color, maxLevel, countPerLevel);
        TinkerRegistry.addTrait(this);
    }
    
    @ZenMethod
    public static ZETiConModifier create(String identifier, int color, @Optional int maxLevel, @Optional int countPerLevel) {
        if(identifier == null) {
            CraftTweakerAPI.logError("Empty or null Trait identifier");
            return null;
        } else if(TinkerRegistry.getTrait(identifier) != null) {
            CraftTweakerAPI.logError("Empty or null Trait already exists!");
            return null;
        }
        
        return new ZETiConModifier(identifier, color, maxLevel, countPerLevel);
    }
    
    @ZenMethod
    public void addModifierItem(IIngredient ingredient, @Optional(valueLong = 1) int amountNeeded, @Optional(valueLong = 1) int amountMatched) {
        items.add(new ZETiConRecipeMatch(ingredient, amountMatched, amountNeeded));
    }
    
    @Override
    public boolean isHidden() {
        return hidden;
    }
    
    @Override
    public void onPlayerHurt(ItemStack tool, EntityPlayer player, EntityLivingBase attacker, LivingHurtEvent event) {
        if(onPlayerHurt != null)
            onPlayerHurt.handle(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIPlayer(player), CraftTweakerMC.getIEntityLivingBase(attacker), new MCEntityLivingHurtEvent(event));
        else
            super.onPlayerHurt(tool, player, attacker, event);
    }
    
    @Override
    public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
        if(onUpdate != null)
            onUpdate.handle(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIWorld(world), CraftTweakerMC.getIEntity(entity), itemSlot, isSelected);
        else
            super.onUpdate(tool, world, entity, itemSlot, isSelected);
    }
    
    @Override
    public void miningSpeed(ItemStack tool, PlayerEvent.BreakSpeed event) {
        if(getMiningSpeed != null)
            getMiningSpeed.handle(CraftTweakerMC.getIItemStack(tool), new MCPlayerBreakSpeedEvent(event));
        else
            super.miningSpeed(tool, event);
    }
    
    @Override
    public void beforeBlockBreak(ItemStack tool, BlockEvent.BreakEvent event) {
        if(beforeBlockBreak != null)
            beforeBlockBreak.handle(CraftTweakerMC.getIItemStack(tool), new MCBlockBreakEvent(event));
        else
            super.beforeBlockBreak(tool, event);
    }
    
    @Override
    public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player, boolean wasEffective) {
        if(afterBlockBreak != null)
            afterBlockBreak.handle(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIWorld(world), CraftTweakerMC.getBlockState(state), CraftTweakerMC.getIBlockPos(pos), CraftTweakerMC.getIEntityLivingBase(player), wasEffective);
        else
            super.afterBlockBreak(tool, world, state, pos, player, wasEffective);
    }
    
    @Override
    public void blockHarvestDrops(ItemStack tool, BlockEvent.HarvestDropsEvent event) {
        if(onBlockHarvestDrops != null)
            onBlockHarvestDrops.handle(CraftTweakerMC.getIItemStack(tool), new MCBlockHarvestDropsEvent(event));
        else
            super.blockHarvestDrops(tool, event);
    }
    
    @Override
    public boolean isCriticalHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target) {
        if(calcCrit != null)
            return calcCrit.isCriticalHit(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIEntityLivingBase(player), CraftTweakerMC.getIEntityLivingBase(target));
        else
            return super.isCriticalHit(tool, player, target);
    }
    
    @Override
    public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
        if(onDamage != null)
            return onDamage.calcDamage(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIEntityLivingBase(player), CraftTweakerMC.getIEntityLivingBase(target), damage, newDamage, isCritical);
        else
            return super.damage(tool, player, target, damage, newDamage, isCritical);
    }
    
    @Override
    public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, boolean isCritical) {
        if(onHit != null)
            onHit.onHit(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIEntityLivingBase(player), CraftTweakerMC.getIEntityLivingBase(target), damage, isCritical);
        super.onHit(tool, player, target, damage, isCritical);
    }
    
    @Override
    public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
        if(afterHit != null)
            afterHit.handle(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIEntityLivingBase(player), CraftTweakerMC.getIEntityLivingBase(target), damageDealt, wasCritical, wasHit);
        else
            super.afterHit(tool, player, target, damageDealt, wasCritical, wasHit);
    }
    
    @Override
    public float knockBack(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float knockback, float newKnockback, boolean isCritical) {
        if(calcKnockBack != null)
            return calcKnockBack.calcKnockBack(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIEntityLivingBase(player), CraftTweakerMC.getIEntityLivingBase(target), damage, knockback, newKnockback, isCritical);
        else
            return super.knockBack(tool, player, target, damage, knockback, newKnockback, isCritical);
    }
    
    @Override
    public void onBlock(ItemStack tool, EntityPlayer player, LivingHurtEvent event) {
        if(onBlock != null)
            onBlock.handle(CraftTweakerMC.getIItemStack(tool), CraftTweakerMC.getIPlayer(player), new MCEntityLivingHurtEvent(event));
        else
            super.onBlock(tool, player, event);
    }
    
    @Override
    public int onToolDamage(ItemStack tool, int damage, int newDamage, EntityLivingBase entity) {
        if(calcToolDamage != null)
            return calcToolDamage.onToolDamage(CraftTweakerMC.getIItemStack(tool), damage, newDamage, CraftTweakerMC.getIEntityLivingBase(entity));
        else
            return super.onToolDamage(tool, damage, newDamage, entity);
    }
    
    @Override
    public int onToolHeal(ItemStack tool, int amount, int newAmount, EntityLivingBase entity) {
        if(calcToolHeal != null)
            return calcToolHeal.onToolHeal(CraftTweakerMC.getIItemStack(tool), amount, newAmount, CraftTweakerMC.getIEntityLivingBase(entity));
        else
            return super.onToolHeal(tool, amount, newAmount, entity);
    }
    
    @Override
    public void onRepair(ItemStack tool, int amount) {
        if(onToolRepair != null)
            onToolRepair.onToolRepair(CraftTweakerMC.getIItemStack(tool), amount);
        else
            super.onRepair(tool, amount);
    }
}
