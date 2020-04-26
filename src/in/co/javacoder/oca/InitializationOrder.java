package in.co.javacoder.oca;

public class InitializationOrder {
	private String name = "Torchie";
	{System.out.println(name);}
	
	private static int COUNT;
	static { System.out.println(COUNT);}
	
	{
		COUNT++; 
		System.out.println(COUNT);
	}
	
	public InitializationOrder() {
		System.out.println("Constructor");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Ready to construct");
		new InitializationOrder();

	}

}
