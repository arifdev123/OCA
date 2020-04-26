package in.co.javacoder.oca.classdesign.inheritance.prevent_overriding_method_hidding;

class Bird {
	
	public final boolean hasFeathers() {
		return true;
	}
	
}
public class Penguine extends Bird {
	
	public  boolean hasFeathers() {
		return false;
	}

}
