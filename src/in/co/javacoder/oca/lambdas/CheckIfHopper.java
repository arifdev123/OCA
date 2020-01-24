package in.co.javacoder.oca.lambdas;

public class CheckIfHopper implements CheckTrait {

	@Override
	public boolean test(Animal a) {
		
		return a.canHop();
	}

}
