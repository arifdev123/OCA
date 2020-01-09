package in.co.javacoder.oca.constructors.defaultnoarg;

public class Rabbit1 {

}

class Rabbit2 {
	public Rabbit2() {}
}

class Rabbit3 {
	public Rabbit3(boolean b) { }
}

class Rabbit4 {
	private Rabbit4() {}
}


// Only Rabbit1 gets a default no-argument constructor.
// It doesn't have a constructor coded so java generates a default no argument constructor. 

// Rabbit3 and Rabbit4 classes already have public construcotrs already.

// Rabbit4 class has a private constructor.

// Lets test of all the above definitions in a another class.
// called RabbitsMultiply class
