package in.co.javacoder.oca.initializers;


public class StaticInitializers {
	
	private static final int NUM_SECONDS_PER_HOUR;
	
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
		// NUM_SECONDS_PER_HOUR =0;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;
	
	static {
		one = 1; // it is not final. so it can be assigned with new value as many times we want.
		two = 2; // it is declared as final and initialized. no issues.
		three = 3; // it is declared and initialized above. the reassignment causes CE.
		two = 4; // it is already assigned with 2 and second assignment is not allowed.
	}
	
	
	/*Note : Using static and instance initializers can make the code harder to read.
	 * Everything that could be done in an instance initializer could be done in a constructor instead. 
	 * The constructor approach is easier to read.
	 * 
	 * static initialization : There is a common case to use a static initializer : when you need to initialize a static field 
	 * and the code to do so requires more than one line. This often occurs when you want to initialize a collection like an ArrayList. 
	 * When you do need to use a static initializer, put all the static initialization in the same block. That way, the order is obvious.
	 * */
	

}
