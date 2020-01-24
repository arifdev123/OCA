package in.co.javacoder.oca.immutability;

public class ImmutableRefType {
	
	private StringBuilder builder;
	
	public ImmutableRefType(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}

}
