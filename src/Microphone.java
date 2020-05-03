
public class Microphone {

	private int microphoneMaxVolume;
	private int microphoneCrtVolume;

	public Microphone(int microphoneMaxVolume) {
		this.microphoneMaxVolume = microphoneMaxVolume;
		microphoneCrtVolume = 25 / 100 * microphoneMaxVolume;
	}

	public Microphone(int microphoneMaxVolume, int microphoneCrtVolume) {
		this.microphoneMaxVolume = microphoneMaxVolume;
		this.microphoneCrtVolume = microphoneCrtVolume;
	}

	public boolean increaseVolume() {
		if (microphoneCrtVolume < microphoneMaxVolume) {
			microphoneCrtVolume++;
			System.out.println("Microphone volume is now: " + microphoneCrtVolume);
			return true;

		}

		return false;
	}

	public boolean decreaseVolume() {
		if (microphoneCrtVolume > 0) {
			microphoneCrtVolume--;
			System.out.println("Microphone volume is now: " + microphoneCrtVolume);
			return true;
		}
		return false;
	}

	public void muteMicrophone() {
		microphoneCrtVolume = 0;
		System.out.println("Microphone is now muted");
	}

}
