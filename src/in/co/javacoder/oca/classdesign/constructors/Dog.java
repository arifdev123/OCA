package in.co.javacoder.oca.classdesign.constructors;

public class Dog {
	
	
	static {
		System.out.println(Dog.class.getConstructors().length);
	}
	
	//public Dog() {}
	
	public Dog(String color) {}
	

}
