package in.co.javacoder.oca.constructors;

public class Bunny {
	public Bunny() {
		System.out.println("constructor");
	}

	// The name of the constructor mathces the name of the class
	// It has no return type not even void

	/*
	 * public bunny() {
	 * 
	 * }
	 */

	// bunny() is not a constructor as it has a different name.
	// so java expects a return type in front of method name.

	public void Bunny() {
	}

	// The above on is a perfect method but it is not a constructor.
	// Because it has a return type void.

	// 1. Constructors are used when creating a new object.
	// 2. The process of creating new objects is called Instantiation.
	// 3. new keyword is used to create a new object.
	// 4. new keyword is followed by a class name.
	// 5. new keyword allocates memory for the new object.
	// 6. The constructor used for the object instantiation initializes the projects
	// of the object.
	// 7. Java looks for a constructor and invokes it.
	// 8. Constructors can be prefered over the instance initializer blocks. Because
	// the statements inside the instance initializers are then copied into the
	// constructor during the compile time in the order they are defined.
	// 9. this keyword is used to refer the instance variable inside a constructor
	// when the local variable declared in the constructor have same name as the
	// instance variable to avoid confusion.

	private String color;

	public Bunny(String color) {
		this.color = color;
	}

	// 10. the left side of the assignment uses this to tell java we want to use the
	// instnce variable.
	// 11. If this keyword is not used, then the java will refer to the local
	// variable.

	private int height;
	private int length;

	public Bunny(int length, int theHeight) {
		length = this.length; // backwards - no good
		height = theHeight; // fine because a different name
		this.color = "white"; // fine, but redundant. It is allowed to use this even when there is no duplication of variable names
	}

	public static void main(String[] args) {
		Bunny b = new Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);

	}

}
