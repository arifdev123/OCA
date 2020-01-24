package in.co.javacoder.oca.immutability;

public class NotImmutable {
	
	private StringBuilder builder;
	
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	
	public StringBuilder getBuilder() {
		return builder; // As this is reference type, the reference can be used to affect the object it is pointing to. 
	}

}


