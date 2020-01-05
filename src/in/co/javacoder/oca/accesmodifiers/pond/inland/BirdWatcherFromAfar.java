package in.co.javacoder.oca.accesmodifiers.pond.inland;   // different package than Bird

import in.co.javacoder.oca.accesmodifiers.pond.shore.Bird;

public class BirdWatcherFromAfar extends Bird{
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); // It does not compile because it is in a differenct package and it does not extend the Bird class.
		System.out.println(bird.text); // text also can not be accessed as it a protected member of the Bird class because of this class should extend the bird class to make use of this data member.
		floatInWater(); // as a result of inheritance , the protected member of the Bird class can be accessed here eventhough packages are different.
		System.out.println(text); // as a result of inheritance, the protect member of the Bird class can be accessed here eventhough the pakages are different.
	}
}
