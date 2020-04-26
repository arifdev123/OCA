package in.co.javacoder.oca.classdesign.inheritance.overriding_vs_hidding;

class Marsupial {
	public String isBiped() {
		return "Marsupial";
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
	
	
}

class AnotherAnimal extends Marsupial {
	public String isBiped() {
		return "AnotherAnimal";
 }
 public void getAnotherAnimalDescription() {
	 System.out.println("AnotherAnimal hops on two legs: " +isBiped());
 }
}

public class Kangaroo extends Marsupial {
 public String isBiped() {
		return "Kangaroo";
 }
 public void getKangarooDescription() {
	 System.out.println("Kangaroo hops on two legs: " +isBiped());
 }
 
 public static void main(String[] args) {
	 Marsupial joey = new Kangaroo();
	 joey.getMarsupialDescription();
 }
}
