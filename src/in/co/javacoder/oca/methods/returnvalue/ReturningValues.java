package in.co.javacoder.oca.methods.returnvalue;

public class ReturningValues {

	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		
		number(number); // 1
		letters = letters(letters);
		System.out.println(number + letters);

	}

	private static int number(int number) {
		number ++;
		return number;
		
	}

	private static String letters(String letters) {
		letters += "d";
		return letters;
	}

}
