package in.co.javacoder.oca.classdesign.inheritance.calling.inherited.members;

public class Shark extends Fish {
	private int numberOfFins = 8;
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	public void displaySharkDetails() {
		System.out.println("Shark with age: " + super.getAge());
		System.out.println(" and " + super.size + " meters long");
		System.out.println(" with " + this.numberOfFins + " fins");
	}
}
