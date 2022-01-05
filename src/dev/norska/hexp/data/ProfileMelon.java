package dev.norska.hexp.data;

public class ProfileMelon extends CropProfile {
	
	@Override
	public Boolean getDropOnlyIfNaturallyGrown() {
		return dropOnlyIfNaturallyGrown;
	}

	@Override
	public void setDropOnlyIfNaturallyGrown(Boolean dropOnlyIfNaturallyGrown) {
		this.dropOnlyIfNaturallyGrown = dropOnlyIfNaturallyGrown;
	}

	private Boolean dropOnlyIfNaturallyGrown;
	
}
