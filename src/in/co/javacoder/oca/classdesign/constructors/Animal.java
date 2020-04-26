package in.co.javacoder.oca.classdesign.constructors;

public class Animal {
	private int age;
	
	public Animal(int age) {
		super();
		this.age = age;
	}
}

class Zebra extends Animal {
	public Zebra(int age) {
		super(age);
	}
	
	public Zebra() {
		this(4);
	}
}
