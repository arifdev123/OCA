package in.co.javacoder.oca.methods.overloading;

public class Plane {

	public void fly(int i) {
		System.out.println("fly(int)");
	}
	/*
	 * public void fly(long l) { System.out.println("fly(long)"); }
	 */
	
	public static void main(String[] args) {
		Plane p = new Plane();
		p.fly((int)123345567897567L);
		p.fly(1234);

	}
	/*
	 *  narrower type to wider type conversion is taken care by the java. 
	 *  But the broader type to narrower type.
	 * 
	 * */

}
