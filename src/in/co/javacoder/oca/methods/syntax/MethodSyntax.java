package in.co.javacoder.oca.methods.syntax;

public class MethodSyntax {
	
	public final void completeMethod(int minutes) throws InterruptedException {
		
	}
	
	public void walk1() {} 
	//default void walk2() {} // default keyword won't denote default access, that is, package private access or default is not
	// valid access modifier. It used within the switch case block as a default case as well as interfaces before dafault methods
	//void public walk3() {} // return type void should come before method name walk3
	
	void walk4() {} // declared with no access modifier that means it has default access level i.e package private.
//	public void walk5; // should have a pair of parenthesis of no or one or more arguments. without parenthesis compiler won't recognize it as a method. but as a variable.
	//public void walk6();//This should have a  method body. Atleast an empty method body.
	
	public final void walk7() {}
    public static final void walk8() {}
    public final static void walk9() {}
    // public modifier void walks10() {} //  modifier is not a valid optional modifier
    // public void final walk11() {} // the optional specifier is after the return type
    final public void walk12() {}
    
    public void walk13() {}
    public void walk14() { return; }
    public String walk15() { return ""; }
	//public String walk16() {} // This method must return a value of type String
	String walk18(int a) { if (a == 4) return ""; } // Though it has a return statement under a condition. In some scenario, the condition may fail. so, the return statement is unreachable in that scenario. Two solutions for this : 
	// First one is , we have to define a else part where also we have to have a return statement. This will satisfy the compiler because when condition fails, the return statement inside the else part is reachable.
	String walk19(int a) { 
			if (a == 4) { 
				return ""; 
			} else {  
				return "N/A"; 
			}
	}
	// Second one is, the method should always return some value outside of the conditions and before the end of the method.
	String walk20(int a) { 
		if (a == 4) return ""; 
		
		return "N/A";
	}
    
	int integer() {
		return 9;
	}
	
	int lonG() {
		//return 9L; // type mismatch cannot convert from long to int. CE : PLP 
		// Solution : When returning a value, it should be assignable to the return type.
	}
	
	int integerExpanded() {
		int temp = 9;
		return temp;
	}
	
	int longExpandable() {
		int temp = 9L; // type mismatch cannot convert from long to int. CE : PLP 
		// Solution : When returning a value, it should be assignable to the return type.
		return temp;
	}
    
	
	public void walk21() {}
	public void 22walk() {} // An identifier can not start with digits
	public walk23 void() {} // return type should come before method name
	public void Walk_$() {} 
	public void() {} // method name is missing
	
	public void walk24() {}
	public void walk25 {} // empty parenthesis with no paremeters are mandatory
	public void walk26(int a) {}
	public void walk27(int a; int b) {} // semicolon can not be used to separate the paremeters
	public void walk28(int a, int b) {} 
	
	
	
	
		
	public static void main(String[] args) {}

}
