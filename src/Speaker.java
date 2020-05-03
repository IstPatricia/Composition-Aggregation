
public class Speaker {

	private int speakerMaxVolume;
	private int speakerCrtVolume;

	public Speaker(int speakerMaxVolume) {
		this.speakerMaxVolume = speakerMaxVolume;
		speakerCrtVolume = 25 / 100 * speakerMaxVolume;
	}

	public Speaker(int maxVolume, int crtVolume) {
		this.speakerMaxVolume = maxVolume;
		this.speakerCrtVolume = crtVolume;
	}

	public boolean increaseVolume() {
		if (speakerCrtVolume < speakerMaxVolume) {
			speakerCrtVolume++;
			System.out.println("Speaker volume is now: " + speakerCrtVolume);
			return true;
		}

		return false;
	}

	public boolean decreaseVolume() {
		if (speakerCrtVolume > 0) {
			speakerCrtVolume--;
			System.out.println("Speaker volume is now: " + speakerCrtVolume);
			return true;
		}
		return false;
	}

	public void setSilenceMode() {
		speakerCrtVolume = 0;
		System.out.println("Speaker is now muted");
	}

}
