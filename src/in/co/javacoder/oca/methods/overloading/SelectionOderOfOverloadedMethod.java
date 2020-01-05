package in.co.javacoder.oca.methods.overloading;

public class SelectionOderOfOverloadedMethod {

	public static void main(String[] args) {
		SelectionOderOfOverloadedMethod order = 
				new SelectionOderOfOverloadedMethod();
		
		order.glide(1,2);
		
		

	}
	
	// public String glide(int i, int j) { System.out.println("java.lang.String glide(int,int)"); return ""; }
	// public String glide(long i, long j) { System.out.println("java.lang.String glide(long, long)"); return ""; }
	// public String glide(Integer i, Integer j) { System.out.println("java.lang.String glide(java.lang.Integer, java.lang.Integer)"); return ""; }
	public String glide(int... nums) {System.out.println("glide(int...)"); return ""; }
	
	/*
	 *  1. Exact match by type.
	 *  2. Larger primitive type.
	 *  3. Autoboxed type.
	 *  4. Varargs.
	 *   */

}
