package com.crafttweaker.zenevents.compat.botania;

import com.crafttweaker.zenevents.compat.botania.events.ZEBotaniaManaDiscountEvent;
import crafttweaker.util.EventList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vazkii.botania.api.mana.ManaDiscountEvent;

public class BotaniaEventHandler {
    
    static final EventList<ZEBotaniaManaDiscountEvent> elManaDiscount = new EventList<>();
    
    @SubscribeEvent
    public static void onBotaniaManaDiscount(ManaDiscountEvent event) {
        if(elManaDiscount.hasHandlers())
            elManaDiscount.publish(new ZEBotaniaManaDiscountEvent(event));
    }
}
