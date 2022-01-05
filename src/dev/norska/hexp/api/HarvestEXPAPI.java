package dev.norska.hexp.api;

import org.bukkit.block.Block;

import dev.norska.hexp.HarvestEXP;
import dev.norska.hexp.data.CropProfile;

public class HarvestEXPAPI {
	
	public static Boolean isValidCrop(HarvestEXP instance, Block b) {
		return instance.getCropProfileHandler().getCropProfile(b.getType()) != null;
	}
	
	public static CropProfile getCropProfile(HarvestEXP instance, Block b) {
		return instance.getCropProfileHandler().getCropProfile(b.getType());
	}

}
