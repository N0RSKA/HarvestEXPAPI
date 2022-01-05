package dev.norska.hexp.data;

import org.bukkit.block.Block;

public class ProfileNetherwart extends CropProfile {
	
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
		return crop.getData() == 3;
	}
	
	private Boolean dropOnlyIfRipe;
	
}
