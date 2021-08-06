public class TestMaximum {
	String X, Y, Z;

	public TestMaximum(String X, String Y, String Z) {	
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}

	public String maximum() {
		return TestMaximum.maximum(X, Y, Z); 
	}

	// determines the largest integer from 3 Strings
	public static String maximum(String X, String Y, String Z) { 
		String max = X; // assume initially X is the largest integer
	
		if(Y.compareTo(max) > 0) { 
			max = Y; //y is the largest integer so far
		}
	
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest integer now
		}
		
		printMax(X, Y, Z, max);
		return max; // returns the largest object
	}

	public static  void printMax(String X, String Y, String Z, String max) {
		System.out.printf("Maximum Integer From %s, %s and %s is %s\n",X, Y, Z, max);
	}

	public static void main(String args[]) {
		String XStr = "Parrot", YStr = "Rabbit", ZStr = "Lion";
		
		new TestMaximum(XStr, YStr, ZStr).maximum(); // for TC 1.1
		new TestMaximum(YStr, ZStr, XStr).maximum(); // for TC 1.2
		new TestMaximum(ZStr, XStr, YStr).maximum(); // for TC 1.3
		
	}
}