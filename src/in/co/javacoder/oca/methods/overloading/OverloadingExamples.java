package in.co.javacoder.oca.methods.overloading;

public class OverloadingExamples {
	// public void fly(int numMiles) { System.out.println("fly(int)");} // #1
	public void fly(short numFeet) {System.out.println("fly(short)"); } // #2
	public boolean fly() { return false; }  // #3
	void fly(int numMiles, short numFeet) { }  // #4
	public void fly(short numFest, int numMiles) throws Exception {  }  // #5
	
	// invalid overloading
	
	//public int fly(int numMiles) {} // #6. it's signature is same as #1. that is it has same number of arguments and same type. The return type is not considered in the method overloading
	//public static void fly(int numMiles) {} // #7. It access speicifiers are not considered in the overloading. it's signature is same as the that of #1
	// And one more difference is that the #1 is an instance method and the #7 is the class method.
	
	
	// caling overloaded methods : 
	
	public static void main(String[] args) {
		OverloadingExamples overloadingExamples = new OverloadingExamples();
		
		overloadingExamples.fly((short) 1); // #mc1
		// For the above method call, java will try to find the most specific match in the list
		// of overloaded methods. In the method call #mc1, the argument's type is short.
		// so, the java succeeds in finding the exact match with the short type of argument.
		
		
		// Calling vararg method and non vararg but array methods
		overloadingExamples.fly(new int[] {1,2,3});
		// OR
		// overloadingExamples.fly(1,2,3);
		
		///  AUTOBOXING
		overloadingExamples.fly(4);
		
	}
	
	// Overloading varargs : 
	
	public void fly(int[] lengths) { System.out.println("fly(int[])"); }
	// OR
	//public void fly(int... lengths) { System.out.println("fly(int...)"); } // Though , it looks different than fly(int[]). fly(int...) is equivalent.
	
	
	///  AUTOBOXING
	
	public void fly(Integer numMiles) {System.out.println("fly(java.lang.Integer)");}
	
	
	

}
