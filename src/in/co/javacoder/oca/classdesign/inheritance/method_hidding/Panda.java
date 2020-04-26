package in.co.javacoder.oca.classdesign.inheritance.method_hidding;

class Bear {
	/*obeying hidden method rules
	 * public static void eat() { System.out.println("Bear is eating."); }
	 */
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

public class Panda extends Bear {
	/* obeying hidden method rules
	 * public static void eat() { System.out.println("Panda Bear is chewing"); }
	 * 
	 * public static void main(String[] args) { Panda.eat();
	 * 
	 * }
	 */
	
	public void sneeze() {
		System.out.println("Panda bear sneezer quietly");
	}
	public static void hibernate() {
		System.out.println("Panda bear is going to sleep");
	}
}
