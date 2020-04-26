package in.co.javacoder.oca.classdesign.constructors;

public class AnimalTwo {
	
	private int age;
	private String name;
	public AnimalTwo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public AnimalTwo(int age) {
		super();
		this.age = age;
		this.name = null;
	}

}
