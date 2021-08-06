public class TestMaximum {
    Integer X,Y,Z;


	

	public TestMaximum(Integer X, Integer Y, Integer Z) {
		
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}


	public int maximum() {
	
		return TestMaximum.maximum(X, Y, Z); 
	}

	
	// determines the largest integer from 3 Integers
	public static int maximum(Integer X, Integer Y, Integer Z) { 
		Integer max = X; // assume initially X is the largest integer
	

		if(Y.compareTo(max) > 0) { 
			max = Y; //y is the largest integer so far
		}
	
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest integer now
		}
		
		printMax(X, Y, Z, max);
		
		return max; // returns the largest object
	}

	
	public static  void printMax(Integer X, Integer Y, Integer Z, Integer max) {
		System.out.printf("Maximum Integer From %s, %s and %s is %s\n",X, Y, Z, max);
	}

	public static void main(String args[]) {

		Integer XInt=10, YInt = 5, ZInt = 6;
	
		
		// MaximumTest.testMaximum(xInt, yInt , zInt); 
		
		new TestMaximum(XInt, YInt, ZInt).maximum(); // for TC 1.1
		new TestMaximum(YInt, XInt, ZInt).maximum(); // for TC 1.2
		new TestMaximum(ZInt, YInt, XInt).maximum(); // for TC 1.3
		
		
	}
}