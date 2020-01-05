package in.co.javacoder.oca.methods.passing.args;

public class PassByValueObjectType {

	public static void main(String[] args) {
		String name = "Webby";
		speak(name);
		System.out.println(name);
	}

	private static void speak(String name) {
		name = "Sparky";
	}

}
