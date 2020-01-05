package in.co.javacoder.oca.staticmembers;

public class KoalaTester {

	public static void main(String[] args) {
		Koala.main(new String[0]);
		
		Koala k = new Koala();
		// The compiler checks for the type of the reference and usess that instead of the object.
		System.out.println(k.count);  // k is a koala
		k = null; // java doesn't care that k happens to be null. Since we are looking for a static variable, it doesn't matter.
		System.out.println(k.count); // k is still a Koala
		
		Koala.count = 4;
		Koala koala1 = new Koala(); // references are just distractions.
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);
	}

}
