package in.co.javacoder.oca.classdesign.inheritance.overriding.redeclare_private_method_in_parent;

class Camel {
	private String getNumberOfHumps() {
		return "Undefined";
	}
}

public class BactrianCamel extends Camel {
	private int getNumberOfHumps() {
		return 2;
	}
}
