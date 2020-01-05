package in.co.javacoder.oca.accesmodifiers.pond.duck;

public class GoodDuckling {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // quack() method is accessible from here as it has package private access.
		System.out.println(duck.noise); // noise property of the MotherDuck class is accessible via its object as it has default access or package private access.
	}
}
