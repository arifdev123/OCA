package in.co.javacoder.oca.classdesign.inheritance.interfaces;
public interface Carnivore {
	public default void eatMeat(); // CE : missing method body, or declare abstract
	public int getRequiredFoodAmount() { // CE : interface abstract methods cannot have body
		return 12;
	}
}
