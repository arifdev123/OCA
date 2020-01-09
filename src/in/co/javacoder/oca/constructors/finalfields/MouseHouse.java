package in.co.javacoder.oca.constructors.finalfields;

public class MouseHouse {
	private final int volume;
	private final String name = "The Mouse House";
	public MouseHouse(int length, int width, int height) {
		this.volume = length * width * height;
		// volume = 123;
	}
	
	public MouseHouse() {
		this.volume = 1;
	}
}
