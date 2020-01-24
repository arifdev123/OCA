package in.co.javacoder.oca.encapsulation;

public class Swan {
	
	private int numberEggs;
	
	public void setNumberEggs(int numberEggs) {
		if(numberEggs >= 0)
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return this.numberEggs;
	}
}
