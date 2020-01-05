package in.co.javacoder.oca.staticmembers;

import java.util.ArrayList;

public class Initializers {
	private static int counter = 0; // initialization
	private static final int NUM_BUCKETS = 45; // constants
	
	private static final ArrayList<String> values = new ArrayList<>();
	
	public static void main(String args[]) {
		NUM_BUCKETS = 5; // CE
		values.add("changed"); // in case of final reference / object variables, reassignment of different object is not allowed.
		values.add("again chagned"); // calling the methods on the final reference or object won't cause any issue.
	}
}
