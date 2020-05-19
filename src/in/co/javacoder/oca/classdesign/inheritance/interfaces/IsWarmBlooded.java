package in.co.javacoder.oca.classdesign.inheritance.interfaces;

public interface IsWarmBlooded {
	
	boolean hasScales();
	 public default double getTemp(); // without body . CE : missing method body, or declare abstract
	
	public default double getTemprature() {
		return 0.0;
	}
	
	static default void defaultMethodAsStatic() {} // CE : illegal combination of modifiers: static and default
	
	final default void defaultMethodAsFinal() {} // CE : modifier final not allowed here
	
	abstract default void defaultMethodAsAbstract() {} // CE : illegal combination of modifiers : abstract and default
	
	private default void testDefaultMethod() {} // CE : modifier private not allowed here.
	
	protected default void testProtectedDefaultMethod() {} // CE :modifier protected not allowed here.
}

class HelloDefaultMethod {
	public default void hello() { // CE : modifier default not allowed here
		System.out.println("Hello , I am a default method inside a class. I am not allowed here.");
	}
}

abstract class AbstractHelloDefaultMethod {
	public default void hello() { // CE : modifier default not allowed here
		System.out.println("Hello , I am a default method inside an ABSTRACT class. I am not allowed inside it.");
	}
}
