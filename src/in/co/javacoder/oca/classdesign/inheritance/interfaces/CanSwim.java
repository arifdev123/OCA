package in.co.javacoder.oca.classdesign.inheritance.interfaces;

public interface CanSwim {
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE ="Submersible";
}

// The above interface is equivalant to the below one(except interface name):

interface CanSwimAfterCompile {
	
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

// invalid interface variable declarations

interface CanDig {
	private int MAXIMUM_DEPTH = 100; // CE : modifier private not allowed here.
	protected abstract boolean UNDERWATER = false;  // CE: modifier abstract not allowed here.
	
	protected boolean isWork = false;  // CE : modifier protected not allowed here.
	public static String TYPE;  // CE: = expected
}