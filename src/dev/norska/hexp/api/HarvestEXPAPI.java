package dev.norska.hexp.api;

import org.bukkit.block.Block;

import dev.norska.hexp.HarvestEXP;
import dev.norska.hexp.data.CropProfile;

public class HarvestEXPAPI {
	
	/** 
	* Check if a Block is a valid crop that the plugin utilizes.
	* You can get the instance of HarvestEXP with HarvestEXP.getInstance();.
	* @param HarvestEXP Instance, Block
	* @return Boolean
	*/
	
	public static Boolean isValidCrop(HarvestEXP instance, Block b) {
		return instance.getCropProfileHandler().getCropProfile(b.getType()) != null;
	}
	
	/** 
	* Get the crop profile of a block to access it's settings (should be checked with #isValidCrop first).
	* You can get the instance of HarvestEXP with HarvestEXP.getInstance();.
	* @param HarvestEXP Instance, Block
	* @return CropProfile
	*/
	
	public static CropProfile getCropProfile(HarvestEXP instance, Block b) {
		return instance.getCropProfileHandler().getCropProfile(b.getType());
	}

}
