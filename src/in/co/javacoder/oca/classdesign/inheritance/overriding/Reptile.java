package in.co.javacoder.oca.classdesign.inheritance.overriding;

public class Reptile {
 protected double getHeight() throws InsufficientDataException {
	return 2;
 }
 protected int getLength()  {
	return 10;
 }
 protected boolean hasLegs() throws InsufficientDataException {
	 throw new InsufficientDataException();
 }
 protected double getWeight() throws Exception {
	 return 2; 
 }
}
