package src.in.co.javacoder.oca.classdesign.inheritance.interfaces;

public /* abstract */ interface CanBurrow { // abstract keyword at interface level is assumed here.
	public /* static */ final int MINIMUM_DEPTH = 2; // static is assumed here.

	/* public abstract */ int getMaximumDepth(); // public abstract is assume here.
}

class FieldMouse implements CanBurrow { // use implements keyword to implement a interface
	public int getMaximumDepth() { // must provide implementation for the methods declared in the interface.
		return 10;
	}
}

interface WalksOnFourLegs {} 
interface HasTrunk{} 
interface Herbivore {}

// Elephant class implements multiple interfaces separated by comma.
class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore { }
class TestClass {
	public static void main(String args[]) {
		WalksOnFourLegs example = new WalksOnTwoLegs(); // interface can not be instantiated.
	}
}
final interface WalksOnEightLegs { // interface cannot be defined with final keyword.
	
}

// --------------

interface CanFly { // its visibility can be either public or default
	void fly(int speed); // public abstract keywords are assumed here.
	abstract void takeoff(); // public keyword is assumed here.
	public abstract double dive(); // both public and abstract keywords explicitly provided.
}

/*
 // The compiler will adds assumed keywords automatically in the interface automatically in their absence.
public abstract interface CanFly {
 public abstract void fly(int speed);
 public abstract void takeoff();
 public abstract double dive();
}
*/


private final interface CanCrawl { // it can neither be private nor be final.
	private void dig(int depth); // in interface, the abstract methods are assumed to be public but private is illegal.
	protected abstract double depth(); // it can not be even protected.
	public final void surface(); // it can not be final.
	// in an inteface, all the methods declared are public and abstract.
	
}