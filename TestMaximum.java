public class TestMaximum <N extends Comparable<N>> {
	N X, Y, Z;

	public TestMaximum(N X, N Y, N Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}

	public N Maximum () {
		return TestMaximum.maximum(X, Y, Z);
	}

	// determines the largest integer from 3 Integres, Floats & Strings
	public static <N extends Comparable<N>> N maximum(N X, N Y, N Z) { 
		N max = X; // assume initially X is the largest integer
	
		if(Y.compareTo(max) > 0) { 
			max = Y; //y is the largest integer so far
		}
	
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest integer now
		}
		
		printMax(X, Y, Z, max);
		return max; // returns the largest object
	}

	public static String testMaximum(String X, String Y, String Z) {
	
		String max = X; 
		if(Y.compareTo(max) > 0) {
		
			max = Y; //y is the largest so far
		
		} 
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest now
		
		}
	
		printMax(X, Y, Z, max); 
		return max; // returns the largest object
	}

	public static <N extends Comparable> void printMax(N X, N Y, N Z, N max) {
		System.out.printf("Maximum Integer From %s, %s and %s is %s\n",X, Y, Z, max);
	}

	public static void main(String args[]) {

		Integer XInt = 6 , YInt = 8, ZInt = 3;
		Float  XFloat = 6.9f , YFloat = 7.2f, ZFloat = 9.1f;
		String XStr = "Parrot", YStr = "Rabbit", ZStr = "Lion"; 
		
	    TestMaximum.testMaximum(XStr, YStr, ZStr);
		TestMaximum.maximum(XInt, YInt, ZInt);
		TestMaximum.maximum(XFloat, YFloat, ZFloat);
		TestMaximum.maximum(XStr, YStr, ZStr);
		
	}
}