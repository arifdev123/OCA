package in.co.javacoder.oca.classdesign.constructors;

public class Zoo {
	public Zoo() {
		System.out.println("Zoo created");
		super(); // illegal
	}
	
	public Zoo(int a) {}
}

class ZooB extends Zoo {
	public ZooB() {
		super();
		super(4);
		System.out.println("ZooB created");
		super(); // illegal : CE
	}
}
