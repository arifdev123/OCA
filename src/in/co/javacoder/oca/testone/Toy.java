package in.co.javacoder.oca.testone;

public class Toy {
	public void play() {
	      System.out.print("play-");
	   }
	   public void finalize() {
	      System.out.print("clean-");
	   }
	   public static void main(String[] fun) {
	      Toy car = new Toy();
	      car.play();
	      car = null;
	      System.gc();
	      Toy doll = new Toy();
	      doll.play();
	   }
}
