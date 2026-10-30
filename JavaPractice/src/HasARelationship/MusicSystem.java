package HasARelationship;

public class MusicSystem {
	private String soundEffect;
	private int speakers;
	public MusicSystem() {
		soundEffect="Spatial Audio";
		speakers=10;
	}
	public String getSoundEffect() {
		return soundEffect;
	}
	public void setSoundEffect(String soundEffect) {
		this.soundEffect = soundEffect;
	}
	public int getSpeakers() {
		return speakers;
	}
	public void setSpeakers(int speakers) {
		this.speakers = speakers;
	}
	public MusicSystem(String soundEffect, int speakers) {
		super();
		this.soundEffect = soundEffect;
		this.speakers = speakers;
	}
	

}
