package in.co.javacoder.oca.immutability;


public class TestImmutableRefType {
	public static void main(String args[]) {
		ImmutableRefType nim = new ImmutableRefType(new StringBuilder("constructed "));
		System.out.println(nim.getBuilder().toString());
		nim.getBuilder().append("changeOne");
		System.out.println(nim.getBuilder().toString());
	}
}
