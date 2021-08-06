public class TestMaximum {
    Float X,Y,Z;

	public TestMaximum(Float X, Float Y, Float Z) {
		
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}

	public float maximum() {
	
		return TestMaximum.maximum(X, Y, Z); 
	}

	// determines the largest integer from 3 Integers
	public static float maximum(Float X, Float Y, Float Z) { 
		Float max = X; // assume initially X is the largest integer
	
		if(Y.compareTo(max) > 0) { 
			max = Y; //y is the largest integer so far
		}
	
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest integer now
		}
		
		printMax(X, Y, Z, max);
		
		return max; // returns the largest object
	}

	public static  void printMax(Float X, Float Y, Float Z, Float max) {
		System.out.printf("Maximum Integer From %s, %s and %s is %s\n",X, Y, Z, max);
	}

	public static void main(String args[]) {

		Float Xfloat=12.2f, Yfloat = 10.6f, Zfloat = 9.1f;
	
		
		// MaximumTest.testMaximum(xInt, yInt , zInt); 
		
		new TestMaximum(Xfloat, Yfloat, Zfloat).maximum(); // for TC 1.1
		new TestMaximum(Yfloat, Xfloat, Zfloat).maximum(); // for TC 1.2
		new TestMaximum(Zfloat, Yfloat, Xfloat).maximum(); // for TC 1.3
			
	}
}