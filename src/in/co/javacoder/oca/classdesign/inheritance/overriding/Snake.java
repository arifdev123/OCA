package in.co.javacoder.oca.classdesign.inheritance.overriding;



public class Snake extends Reptile {
	protected double getHeight() /* throws Exception */ {
		return 2;
	}

	protected int getLength() /* throws InsufficientDataException */ {
		return 10;
	}
	protected boolean hasLegs(){
		return false;
	}
	protected double getWeight() throws InsufficientDataException {
		return 2;
	}
}
