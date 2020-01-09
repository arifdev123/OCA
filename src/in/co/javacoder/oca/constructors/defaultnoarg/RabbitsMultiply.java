package in.co.javacoder.oca.constructors.defaultnoarg;

public class RabbitsMultiply {

	public static void main(String[] args) {
		Rabbit1 r1 = new Rabbit1(); // it is allowed. Though the class has no default constructor, the compiler provided is used here.
		Rabbit2 r2 = new Rabbit2(); // It is also allowed. default constructor is coded in it.
		Rabbit3 r3 = new Rabbit3(true); // a constructor with a boolean arg is used.
		Rabbit4 r4 = new Rabbit4(); // It won't allow to instantiate because there is no public constructor. but it has a private default constructor.
	
	}

}

/*
 * Having a private constructor in a class tells the compiler not to provide a default no-arg constructor.
 * It also prevents other classes from instantiating the class.
 * This is useful when a class only has static methods or the class wants to control all calls to create new instances of itself.
 * 
 * */


