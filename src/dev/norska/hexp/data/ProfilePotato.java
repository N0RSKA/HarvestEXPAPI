package dev.norska.hexp.data;

import org.bukkit.block.Block;

public class ProfilePotato extends CropProfile {
	
	@Override
	public Boolean getDropOnlyIfRipe() {
		return dropOnlyIfRipe;
	}

	@Override
	public void setDropOnlyIfRipe(Boolean dropOnlyIfRipe) {
		this.dropOnlyIfRipe = dropOnlyIfRipe;
	}
	
	@Override
	public Boolean isRipe(Block crop) {
		return crop.getData() == 7;
	}

	private Boolean dropOnlyIfRipe;
	
}
