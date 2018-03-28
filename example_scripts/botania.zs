#modonly botania

events.onBotaniaManaDiscount(function(event as mods.botania.ManaDiscountEvent) {
	print("ManaDiscountEvent: ");
	print("\tPlayer: " + (isNull(event.player) ? "null" : event.player.displayName));
	//The way Botania currently does stuff, this is almost certainly null!
	print("\tItem: " + (isNull(event.item) ? "null" : event.item.commandString));
	print("\tDiscount: " + event.discount);
});