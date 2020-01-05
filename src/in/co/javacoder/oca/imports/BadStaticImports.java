package in.co.javacoder.oca.imports;

import static java.util.Arrays; // CE. static import can not be used to import a class.
// Remember static imports are for only importing static members of a class.
import static java.util.Arrays.asList; // No issues asList() will be imported.

static import java.util.Arrays.*; // CE. it should import static but not static import. The order matters here.
import static java.util.Arrays.*; // Willcard static import can be used to import all the static members of that class.

// The static import can cause issue when two static member with same name are attempted to imported. For example, 

// import static statics.A.TYPE
// import static statics.B.TYPE

// in the above case,static members can be refered via their classname in the code instead of trying to use a static import.

public class BadStaticImports {

	public static void main(String[] args) {
		Arrays.asList("one"); // asList() method alone imported but The class Arrays is not imported. But it is ok to use asList() alone.

	}

}
