import java.util.ArrayList;

public class Screen {

	private ArrayList<Pixel> pixels = new ArrayList<Pixel>();
	private Dimensions dimensions;

	public Screen(int pixelsNo, int width, int length, int depth) {
		this.dimensions = new Dimensions(width, length, depth);
		while (pixelsNo >= 0) {
			pixels.add(new Pixel());
			pixelsNo--;
		}
	}

	public void setPixel(int index, String color) {
		pixels.get(index).setPixel(color);

	}

	public void colorScreen(String color) {
		System.out.println("The screen color is now: " + color);

	}

}
