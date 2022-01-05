package dev.norska.hexp;

import org.bukkit.plugin.java.JavaPlugin;

import dev.norska.hexp.data.CropProfileHandler;
import lombok.Getter;

public class HarvestEXP extends JavaPlugin{
	
	private static HarvestEXP instance;
	
	public HarvestEXP() { instance = this; }

	public static HarvestEXP getInstance() { return instance; }

	@Getter private CropProfileHandler cropProfileHandler = new CropProfileHandler();
	
}
