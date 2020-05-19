package in.co.javacoder.oca.classdesign.inheritance.interfaces;

interface Herbivore {
	public void eatPlants();
}

interface Omnivore {
	public void eatPlants();
}

interface Supervore extends Herbivore, Omnivore {}
abstract class AbstractBear implements Herbivore, Omnivore {}
/*
 * public class Bear implements Herbivore, Omnivore {
 * 
 * @Override public void eatPlants() { // TODO Auto-generated method stub
 * 
 * } }
 */


/*package in.co.javacoder.oca.classdesign.inheritance.interfaces;

interface Herbivore {
	public void eatPlants();
	// or public int eatPlants();
}



interface Omnivore {
	public void eatPlants();
	public void eatMeat();
}

public class Bear implements Herbivore, Omnivore {

	
	 // @Override public int eatPlants() { System.out.println("Eating meat");
	 // 
	 // }
	 
	
	@Override
	public void eatPlants() {
		System.out.println("Eating meat");
		
	}

	@Override
	public void eatMeat() {
		System.out.println("Eating plants");
		
	}

}

interface HerbivoreTwo {
	public void eatPlants(int quantity);
}

class BearTwo implements HerbivoreTwo, Omnivore {

	@Override
	public void eatPlants() {
		System.out.println("Eating plants");
		
	}

	@Override
	public void eatMeat() {
		System.out.println("Eating meat");
		
	}

	@Override
	public void eatPlants(int quantity) {
		System.out.println("Eating plants : " + quantity);
		
	}
	
}
*/
