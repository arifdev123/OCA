package in.co.javacoder.oca;

public class YetMoreInitializationOrderSuper {
  
	static {System.out.println("super static block 1"); }  // 1
  
	{System.out.println("super instance block 1");}  // 6
  
	public YetMoreInitializationOrderSuper() {
	  System.out.println("Super constructor 1"); // 7
	}
}
