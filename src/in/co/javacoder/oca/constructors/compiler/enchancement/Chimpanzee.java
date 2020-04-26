package in.co.javacoder.oca.constructors.compiler.enchancement;

class Primate {
	public Primate() {
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape() {
		System.out.println("Ape");
	}
}

public class Chimpanzee extends Ape {
	
	public Chimpanzee() {
		System.out.println("Chimpanzee");
	}

	public static void main(String[] args) {
		new Chimpanzee();
	}

}
