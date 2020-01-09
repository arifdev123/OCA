package in.co.javacoder.oca.constructors.chaining;

public class Mouse {
	
	private int numTeeth;
	private int numWhishkers;
	private int weight;
	
	public Mouse(int weight) {
		this(weight, 16); // calls constructor with 2 parameters
	}
	
	public Mouse(int weight, int numTeeth) {
		this(weight,numTeeth,6); // calls constructor with 3 parameters
	}
	
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhishkers = numWhiskers;
	}

	public static void main(String[] args) {
		Mouse mouse = new Mouse(15);
		mouse.print();

	}

	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhishkers);
	}

}
