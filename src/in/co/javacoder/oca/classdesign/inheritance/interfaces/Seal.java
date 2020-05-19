package in.co.javacoder.oca.classdesign.inheritance.interfaces;

interface HasTail {
	public int getTailLength();
}

interface HasWhiskers {
	public int getNumberOfWhiskers();
}

public interface Seal extends HasTail, HasWhiskers {

}


class AntarticSeal implements Seal {

	/*
	 * @Override public int getTailLength() { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * @Override public int getNumberOfWhiskers() { // TODO Auto-generated method
	 * stub return 0; }
	 */
	
}


// An abstract class that implements an interface

abstract class HarborSeal implements HasTail, HasWhiskers {

}

class LeopardSeal extends HarborSeal /* implements HasTail, HasWhiskers */ {

	@Override
	public int getNumberOfWhiskers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTailLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


