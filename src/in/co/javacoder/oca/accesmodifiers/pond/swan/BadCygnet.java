package in.co.javacoder.oca.accesmodifiers.pond.swan;

import in.co.javacoder.oca.accesmodifiers.pond.duck.MotherDuck;

public class BadCygnet {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // quack() method has package private access or default access. but it cannot be accessible from the pond.swan package. So it can be accessible from the classes which are in the same package.
		System.out.println(duck.noise); // noise data member restricted to the package private access or default access. So, it can not accessible from the other packages. 
	}
}
