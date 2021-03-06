package in.co.javacoder.oca.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearchEditionThree {
	
	private int foo;
	private static int bar;

	public static void main(String[] args) {
		int newLocal = 2;
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, a -> {int c = newLocal; return a.canHop();}); // pass class that does check
		print(animals, a -> !a.canSwim());
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal))   // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
	public void methodOne(String[] names, int... ages) {}
	
	public int howMany(boolean b, boolean... b2) {
		  return b2.length;
	}

	
}
