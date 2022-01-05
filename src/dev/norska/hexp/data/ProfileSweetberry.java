package dev.norska.hexp.data;

import org.bukkit.block.Block;

public class ProfileSweetberry extends CropProfile {
	
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
		return crop.getState().getBlockData().toString().contains("[age=3]");
	}

	private Boolean dropOnlyIfRipe;
	
}
