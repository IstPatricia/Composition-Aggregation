
public class Main {

	public static void main(String[] args) {

		Screen phoneScreen = new Screen(2048, 50, 500, 2);
		Speaker phoneSpeaker = new Speaker(100, 20);
		Microphone phoneMic = new Microphone(100, 50);
		Case phoneCase = new Case();
		Smartphone mySmartphone = new Smartphone(phoneScreen, phoneSpeaker, phoneMic, phoneCase);
		Cover aCover = new Cover();
		ScreenProtector glass = new ScreenProtector();

		mySmartphone.colorScreen("green");
		mySmartphone.decreaseMicrophoneVolume();
		mySmartphone.increaseMicrophoneVolume();
		mySmartphone.muteMicrophone();
		mySmartphone.setSilenceMode();
		mySmartphone.setCover(aCover);
		mySmartphone.removeCover();

	}

}
