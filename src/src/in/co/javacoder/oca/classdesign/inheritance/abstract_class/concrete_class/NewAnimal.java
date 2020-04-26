package src.in.co.javacoder.oca.classdesign.inheritance.abstract_class.concrete_class;

public abstract class NewAnimal {
 public abstract String getName();
}

class Walrus extends NewAnimal {
	/*
	 * public String getName() { return "My Name is Walrus from a new Animal."; }
	 */
}

// ----

abstract class Eagle extends NewAnimal {
	
}

// ---------------------------------

class Bird extends NewAnimal {
	/*
	 * public String getName() { return "Flamingo"; }
	 */
}

class Flamingo extends Bird {
	public String getName() {
		 return "Flamingo";
	 }
}

// ----------------------------------------------


abstract class BigCat extends NewAnimal {
	public abstract void roar();
}



class Lion extends BigCat {
	public String getName() {
		return "Lion";
	}
	
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}

// ------------------------------------------


abstract class SmallCat extends NewAnimal {
	public String getName() {
		return "Small Cat";
	}
	
	public abstract void meow();
	
	
}

class DomesticCat extends SmallCat {
	public void meow() {
		System.out.println("Meow....");
	}
}








