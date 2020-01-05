package in.co.javacoder.oca.staticmembers;

public class Static {
	private String name = "Static class";
	public static void first() { }
	public static void second() { }
	public void third() { System.out.println(name); }
	public static void main(String[] args) {
		first();
		second();
		third(); // CE. a static method , in this case , it is main() cannot call non-static or instance method, third() method.
		
		// NOTE : a static or instance method can call a static method that means static method does not require an object.

	}

}
