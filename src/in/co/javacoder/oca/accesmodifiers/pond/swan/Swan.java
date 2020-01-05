package in.co.javacoder.oca.accesmodifiers.pond.swan; // in a different package than Bird class

import in.co.javacoder.oca.accesmodifiers.pond.shore.Bird;

public class Swan extends Bird {  // but subclass of the Bird class
	public void swim() {
		floatInWater();				// package access to the super class members with protected visibility
		System.out.println(text);   // package access to the super class members with protected visibility
	}
	
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater();
		System.out.println(other.text);
	}
	
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater(); // 
		System.out.println(other.text);
	}
	

}
