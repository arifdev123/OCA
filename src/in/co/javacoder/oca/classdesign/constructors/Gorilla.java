package in.co.javacoder.oca.classdesign.constructors;


public class Gorilla extends AnimalTwo {
	
	final int x;
 public Gorilla(int age) {
	 super(age,"Gorilla");
	 x = age;
 }
 
 public Gorilla() {
	 super(5);
	 x = 4;
 }
}
