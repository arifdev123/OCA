package in.co.javacoder.oca.methods.overloading;

public class TooManyConversions {
	
	public static void play(Long l ) { System.out.println("play(int)");}
	public static void play(Long...l) { System.out.println("play(java.lang.Long...)"); }
	public static void play(Object o) {} 
	public static void main(String[] args) {
		play(4); // This CE is resolved by play(Object). Java has to do many conversions such as int to long and the long to Long. This is too many steps that java won't support.
		play(4L); 

	}

}
