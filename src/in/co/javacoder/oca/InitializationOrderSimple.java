package in.co.javacoder.oca;

public class InitializationOrderSimple {
	
	private String name = "Torchie"; // 4
	
	{ System.out.println(name); }  // 5
	private static int COUNT = 0;  //1
	
	static { System.out.println(COUNT);} //2
	static { COUNT += 10; System.out.println(COUNT);}  //3
	
	public InitializationOrderSimple() {
		System.out.println("cosntructor");  // 6
	}
}


