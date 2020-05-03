
public class Smartphone {

	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;

	private Cover aCover;
	private ScreenProtector aScreenProtector;

	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVolume, int microphoneMaxVolume) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theSpeaker = new Speaker(speakerMaxVolume);
		this.theMicrophone = new Microphone(microphoneMaxVolume);
	}

	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVolume, int speakerCrtVolume,
			int microphoneMaxVolume, int microphoneCrtVolume) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theSpeaker = new Speaker(speakerMaxVolume, speakerCrtVolume);
		this.theMicrophone = new Microphone(microphoneMaxVolume, microphoneCrtVolume);
	}

	public Smartphone(Screen phoneScreen, Speaker phoneSpeaker, Microphone phoneMic, Case phoneCase) {
		this.theScreen = phoneScreen;
		this.theCase = phoneCase;
		this.theSpeaker = phoneSpeaker;
		this.theMicrophone = phoneMic;
	}

	public boolean setCover(Cover aCover) {
		if (this.aCover != null) {
			System.out.println("Err: A cover is already in place!");
			return false;
		}
		this.aCover = aCover;
		System.out.println("The phone have a cover now");
		return true;
	}

	public Cover removeCover() {
		Cover referenceToCover = this.aCover;
		this.aCover = null;
		System.out.println("The cover was removed");
		return referenceToCover;
	}

	public void pressPowerButton() {
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressPowerButton();
	}

	public void pressVolumeUp() {
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}

	public void pressVolumeDown() {
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}

	public void setPixel(int index, String color) {
		this.theScreen.setPixel(index, color);
	}

	public void colorScreen(String color) {
		this.theScreen.colorScreen(color);
	}

	public void increaseMicrophoneVolume() {
		this.theMicrophone.increaseVolume();
	}

	public void decreaseMicrophoneVolume() {
		this.theMicrophone.decreaseVolume();
	}

	public void muteMicrophone() {
		this.theMicrophone.muteMicrophone();
	}

	public void setSilenceMode() {
		this.theSpeaker.setSilenceMode();
	}
}
