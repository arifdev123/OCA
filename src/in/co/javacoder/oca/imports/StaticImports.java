package in.co.javacoder.oca.imports;

import java.util.List;
import static java.util.Arrays.asList;   // static import

public class StaticImports {
	
	public static void main(String[] args) {
		List<String> list = asList("one" , "two"); // no Arrays. asList() from Arrays class is imported specifically. What would happen if
		// we created an asList method in this same class ? Java would give it preference over the imported one and the method we coded would
		// be used.
	}

}

/*Note : In a large program, static imports can be over used. When importing from too many places, 
 * it can be hard to remember where each static member comes from.*/
