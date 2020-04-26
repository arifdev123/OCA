package in.co.javacoder.oca.classdesign.inheritance.abstract_class;

public abstract class Animal { } // valid abstract class without any methods

abstract class Vehicle {} // valid abstract class with package private access

abstract final class Shop {} // an abstract class with final modifier. This is invalid because an abstract class should be subclassed.

private class Student {} // a NON abstract class with private access which is illegal

private abstract class Product {} // an abstract class with private access which is illegal

class TestAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal(); // an abstract class cannot be instantiated.
	}
}

class Chicken {
	public abstract void peck(); // does not compile: an abstract method is defined inside non abstract class. So, this is illegal.
}

class abstract AnAbstractClass {} // abstract keyword is should come before the class keyword.

abstract class Turtle {
	public abstract void swim() {} // Doesn't compile : an abstract method cannot a have body or definion or implementation.
	
	public abstract int getAges() { // it cannot have a body/definition
		return 10;
	}
	
	public void getDetails() {} // Abstract class can have non abstract method with body. It may be overrided in its child class.
}

abstract class Goat {
	public abstract final void chew(); // final keyword makes this method not overidable. This is causes compile time error.
}


abstract class Whale {
	private abstract void sing(); // Does not compile : an abstract method should be declared with final keyword because it should be overrided in the sub class.
}

class HumpbackWhale extends Whale {
	private void sing() { // This is actually not overriding the parent method. parent method is not accessible as it is with private access.
		// so, this is completely belongs to child class.
		System.out.println("Humpack whale is singing.");
	}
}

abstract class WhaleTwo {
	protected abstract void sing(); 
}

class HumpbackWhaleTwo extends WhaleTwo {
	private void sing() { // child method should have the visibility same as the parent method's visibility or more that its parent method's visibility.
		System.out.println("Humpack whale is singing.");
	}
}


