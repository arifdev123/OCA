package in.co.javacoder.oca;

public class YetMoreInitializationOrder extends YetMoreInitializationOrderSuper {
	
	static { add(2); }  // 2
	
	static void add(int num) { System.out.print(num + " "); }
	
	public YetMoreInitializationOrder() {
		add(5);  // 10
	}
	
	static { add(4); }  // 3
	
	{ add(6); } // 8
	
	static { add(7); }  // 4
	
	{ add(8); } // 9

	public static void main(String[] args) {
		add(9);  // 5
		
		new YetMoreInitializationOrder();
		
		//YetMoreInitializationOrder.add(10);

	}

}

// 2 4 6 8 5 9

// 2 4 7 9 6 8 5

// 2 4 7 9 10
