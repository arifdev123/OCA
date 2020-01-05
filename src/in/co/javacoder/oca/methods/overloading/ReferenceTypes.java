package in.co.javacoder.oca.methods.overloading;

public class ReferenceTypes {
	/*
	 * public void fly(String s) { System.out.println("fly(java.lang.String)"); }
	 */
	public void fly(Object o) {
		System.out.println("fly(java.lang.Object)");
	}
	/*
	 * public void fly(Integer integer) {
	 * System.out.println("fly(java.lang.Integer)"); }
	 */
	/*
	 * public void fly(int num) { System.out.println("fly(int)"); }
	 */

	public static void main(String[] args) {
		ReferenceTypes r = new ReferenceTypes();
		r.fly("test");
		r.fly(56);
	}
	
	/*
 	The java compiler finds the most specific match for the provided
 	argument in the call statement of the fly method: 
 	
 	 1. When r.fly(56) is called,
 	 
 	 The java is trying to find a exact match of a method with the 
 	 signature fly(int). If it is not defined, then it will look for
 	 the signature fly(java.lang.Ingeger). Again, if fly(java.lang.Integer)
 	 is also not found, then java has no other options than the fly(java.lang.Object).
 	 
 	 This is the order in which java tries to resolve the method selection based on the signature of the methods overloaded.
	
	2. When r.fly("test") is called, 
	
	 The java tries to find the exact match in the available methods.
	 So, the method with the signature fly(java.lang.String) is available. 
	 The java picks it up and executes it. 
	 
	 Why doesn't java select the choice of fly(java.lang.Object) ? 
	 This is because of the presence of exact signature. Suppose , if
	 the definition of the fly(java.lang.String is commented out, then
	 java will pickup the fly(java.lang.Object) for the method call : 
	 r.fly("test"). Let's check it out first in the code.
*
*
*/

}
