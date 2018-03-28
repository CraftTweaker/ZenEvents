package com.crafttweaker.zenevents.compat.botania;

import com.crafttweaker.zenevents.compat.botania.events.ZEBotaniaManaDiscountEvent;
import crafttweaker.annotations.*;
import crafttweaker.api.event.*;
import crafttweaker.util.IEventHandler;
import stanhebben.zenscript.annotations.*;

import static com.crafttweaker.zenevents.compat.botania.BotaniaEventHandler.elManaDiscount;

@ZenExpansion("crafttweaker.events.IEventManager")
@ZenRegister
@ModOnly("botania")
public class BotaniaEventsExpansion {
    
    @ZenMethod
    public static IEventHandle onBotaniaManaDiscount(IEventManager ignored, IEventHandler<ZEBotaniaManaDiscountEvent> handler) {
        return elManaDiscount.add(handler);
    }
}
