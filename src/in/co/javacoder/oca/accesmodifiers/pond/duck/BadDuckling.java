package in.co.javacoder.oca.accesmodifiers.pond.duck;

public class BadDuckling {

	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
		duck.quack(); // quack() is a private method in the FatherDuck class. so it is not accessible from here.
		System.out.println(duck.noise); // noise is also a private data member of the FatherDuck class. it is not accessible from this class.
	}
}
