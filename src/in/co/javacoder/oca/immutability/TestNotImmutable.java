package in.co.javacoder.oca.immutability;


public class TestNotImmutable {
	public static void main(String args[]) {
		NotImmutable nim = new NotImmutable(new StringBuilder("constructed "));
		System.out.println(nim.getBuilder().toString());
		nim.getBuilder().append("changeOne");
		System.out.println(nim.getBuilder().toString());
	}
}
