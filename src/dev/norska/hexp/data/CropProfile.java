package dev.norska.hexp.data;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;

import lombok.Getter;
import lombok.Setter;

public class CropProfile {
	
	@Getter @Setter private Boolean enabled, dropOnBreak, permissionRequired;
	@Getter @Setter private int experienceAmount;
	@Getter @Setter private List<String> worldBlacklist;
	@Getter @Setter private Material material;
	@Getter @Setter private String permission;
	
	// Overridden methods below
	
	public Boolean getDropOnlyIfRipe() {return false;}

	public void setDropOnlyIfRipe(Boolean dropOnlyIfRipe) {}

	public Boolean getDropOnlyIfNaturallyGrown() {return false;}
	
	public Boolean isRipe(Block crop) {return false;}
	
	public void setDropOnlyIfNaturallyGrown(Boolean dropOnlyIfNaturallyGrown) {}

}
