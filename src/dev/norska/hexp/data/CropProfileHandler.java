package dev.norska.hexp.data;

import org.bukkit.Material;

import lombok.Getter;

public class CropProfileHandler {
	
	@Getter protected ProfileBeetroot beetroot = new ProfileBeetroot();
	@Getter protected ProfileCarrot carrot = new ProfileCarrot();
	@Getter protected ProfileCocoabean cocoabean = new ProfileCocoabean();
	@Getter protected ProfileMelon melon = new ProfileMelon();
	@Getter protected ProfileNetherwart netherwart = new ProfileNetherwart();
	@Getter protected ProfilePotato potato = new ProfilePotato();
	@Getter protected ProfilePumpkin pumpkin = new ProfilePumpkin();
	@Getter protected ProfileSweetberry sweetberry = new ProfileSweetberry();
	@Getter protected ProfileWheat wheat = new ProfileWheat();
	
	public CropProfile getCropProfile(Material m) {
		
		if(m == beetroot.getMaterial()) return beetroot;
		if(m == carrot.getMaterial()) return carrot;
		if(m == cocoabean.getMaterial()) return cocoabean;
		if(m == melon.getMaterial()) return melon;
		if(m == netherwart.getMaterial()) return netherwart;
		if(m == potato.getMaterial()) return potato;
		if(m == pumpkin.getMaterial()) return pumpkin;
		if(m == sweetberry.getMaterial()) return sweetberry;
		if(m == wheat.getMaterial()) return wheat;
		
		return null;
		
	}
}
