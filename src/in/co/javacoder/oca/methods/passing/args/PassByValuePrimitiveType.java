package in.co.javacoder.oca.methods.passing.args;

public class PassByValuePrimitiveType {

	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		
		System.out.println(num);

	}

	private static void newNumber(int num) {
		num = 8;
		
	}

}
