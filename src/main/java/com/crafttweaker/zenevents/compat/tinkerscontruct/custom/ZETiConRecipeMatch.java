package com.crafttweaker.zenevents.compat.tinkerscontruct.custom;

import crafttweaker.api.item.*;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import slimeknights.mantle.util.RecipeMatch;

import java.util.*;

public class ZETiConRecipeMatch extends RecipeMatch {
    
    private final IIngredient ingredient;
    
    public ZETiConRecipeMatch(IIngredient ingredients, int amountMatched, int amountNeeded) {
        super(amountMatched, amountNeeded);
        this.ingredient = ingredients;
    }
    
    @Override
    public List<ItemStack> getInputs() {
        List<ItemStack> out = new ArrayList<>();
        if(ingredient != null)
            for(IItemStack itemStack : ingredient.getItems()) {
                if(itemStack != null)
                    out.add(CraftTweakerMC.getItemStack(itemStack));
            }
        return out;
    }
    
    @Override
    public Optional<Match> matches(NonNullList<ItemStack> stacks) {
        int stillNeeded = amountNeeded;
        List<ItemStack> found = new ArrayList<>();
        for(ItemStack item : stacks) {
            if(ingredient != null && ingredient.matchesExact(CraftTweakerMC.getIItemStack(item))) {
                ItemStack copy = item.copy();
                copy.setCount(Math.min(copy.getCount(), stillNeeded));
                stillNeeded -= copy.getCount();
                found.add(copy);
            }
        }
        return stillNeeded > 0 ? Optional.empty() : Optional.of(new Match(found, amountMatched));
    }
    
    
}
