package in.co.javacoder.oca.methods.passing.args;

public class CopyingAReferenceWithPassByValue {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Arif");
		System.out.println(name); // Arif
		speak(name);
		System.out.println(name); // Webby

	}

	private static void speak(StringBuilder name) {
		name.delete(0, name.length());
		name.append("Webby");
		
	}

}
