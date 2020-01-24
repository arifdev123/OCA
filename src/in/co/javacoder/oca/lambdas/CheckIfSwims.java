package in.co.javacoder.oca.lambdas;

public class CheckIfSwims implements CheckTrait {

	@Override
	public boolean test(Animal a) {
		return a.canSwim();
	}

}
