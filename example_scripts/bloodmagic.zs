#modonly bloodmagic

events.onBloodAltarCrafted(function(event as mods.bloodmagic.AltarCraftedEvent){
	print("AltarCraftedEvent: ");
	print("\tOutput item: " + event.output.commandString);
	print("");
});


events.onBoundToolCharge(function(event as mods.bloodmagic.BoundToolChargeEvent){
	print("BoundToolChargeEvent: ");
	print("\tItem: " + event.item.commandString);
	print("\tPlayer: " + event.player.displayName);
	print("");
});


events.onBoundToolRelease(function(event as mods.bloodmagic.BoundToolReleaseEvent){
	print("BoundToolReleaseEvent: ");
	print("\tItem: " + event.item.commandString);
	print("\tCharge: " + event.charge);
	print("\tPlayer: " + event.player.displayName);
	print("");
});


events.onBloodMagicItemBind(function(event as mods.bloodmagic.ItemBindEvent){
	print("ItemBindEvent: ");
	print("\tItem: " + event.item.commandString);
	print("");
});


events.onBloodMagicRitualRun(function(event as mods.bloodmagic.RitualRunEvent){
	print("RitualRunEvent: ");
	print("\tMasterRitualStone: ");
	val mrs = event.masterRitualStone;
	print("\t\tCooldown: " + mrs.cooldown);
	print("\t\tTanksEmpty: " + mrs.areTanksEmpty);
	print("\t\tRunning Time: " + mrs.runningTime);
	val pos = mrs.blockPos;
	print("\t\tPosition: " + "(" + pos.x + " | " + pos.y + " | " + pos.z + ")");
	print("\tRitual:");
	val ritual = event.ritual;
	print("\t\tName: " + ritual.name);
	print("\t\tUnlocalizedName: " + ritual.unlocalizedName);
	print("\t\tRefreshCost: " + ritual.refreshCost);
	print("\t\tCrystalLevel: " + ritual.crystalLevel);
	print("\t\tActivationCost: " + ritual.activationCost);
	print("");
});


events.onBloodMagicRitualStop(function(event as mods.bloodmagic.RitualStopEvent){
	print("RitualStopEvent: ");
	print("\tMasterRitualStone: ");
	val mrs = event.masterRitualStone;
	print("\t\tCooldown: " + mrs.cooldown);
	print("\t\tTanksEmpty: " + mrs.areTanksEmpty);
	print("\t\tRunning Time: " + mrs.runningTime);
	val pos = mrs.blockPos;
	print("\t\tPosition: " + "(" + pos.x + " | " + pos.y + " | " + pos.z + ")");
	print("\tRitual:");
	val ritual = event.ritual;
	print("\t\tName: " + ritual.name);
	print("\t\tUnlocalizedName: " + ritual.unlocalizedName);
	print("\t\tRefreshCost: " + ritual.refreshCost);
	print("\t\tCrystalLevel: " + ritual.crystalLevel);
	print("\t\tActivationCost: " + ritual.activationCost);
	print("");
});


events.onBloodMagicRitualActivated(function(event as mods.bloodmagic.RitualActivatedEvent){
	print("RitualActivatedEvent: ");
	print("\tActivation Crystal: " + event.activationCrystal.commandString);
	print("\tCrystal Tier: " + event.crystalTier);
	print("\tMasterRitualStone: ");
	val mrs = event.masterRitualStone;
	print("\t\tCooldown: " + mrs.cooldown);
	print("\t\tTanksEmpty: " + mrs.areTanksEmpty);
	print("\t\tRunning Time: " + mrs.runningTime);
	print("\t\tPosition: " + makePosString(mrs.blockPos));
	print("\tRitual:");
	val ritual = event.ritual;
	print("\t\tName: " + ritual.name);
	print("\t\tUnlocalizedName: " + ritual.unlocalizedName);
	print("\t\tRefreshCost: " + ritual.refreshCost);
	print("\t\tCrystalLevel: " + ritual.crystalLevel);
	print("\t\tActivationCost: " + ritual.activationCost);	
	print("");
});


events.onBloodMagicSacrificialKnifeUsed(function(event as mods.bloodmagic.SacrificialKnifeUsedEvent){
	print("SacrificialKnifeUsedEvent: ");
	print("\tHealth Drained amount: " ~ event.healthDrained);
	print("\tLP added amount: " ~ event.lpAdded);
	print("\tShould drain health: " ~ event.shouldDrainHealth);
	print("\tShould fill Altar: " ~ event.shouldFillAltar);
	print("");
});


events.onBloodMagicTelepose(function(event as mods.bloodmagic.TeleposeEvent){
	print("TeleposeEvent: ");
	print("\tFrom: " + makePosString(event.initialBlockPos));
	print("\tTo:   " + makePosString(event.finalBlockPos));
	print("");
});


function makePosString(pos as crafttweaker.world.IBlockPos) as string {
	return "(" + pos.x + " | " + pos.y + " | " + pos.z + ")";
}