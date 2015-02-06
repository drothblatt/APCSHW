public class Recursion implements hw1{

    public String name(){
	return "Rothblatt,David";
    }
    // must throw error for negatives. will do later.

    // 1.21: factorial. 
    public int fact(int n){
	if (n <= 1){ // 0! and 1! are both equal to 1
	    return 1;
	}
	return n * fact(n-1);
    }
    
    // 1.22: fibonacci. 
    public int fib(int n){
	if (n <= 1) {
	    return n;
	}
	return fib(n-2) + fib(n-1);
    }

    // 1.23: sqrt. 
    public double sqrt(double n){ 
	if (n < 0){   
	}
	double guess = n/2;
	return sqrtHelper(n,guess);
    }

    public double sqrtHelper(double n, double guess){
	if (n == 0){
	    return 0;
	}
	if (  ( (guess*guess) - n < .00000000000001 ) // could be a smaller number but 
	      && ( (guess*guess) - n > -.00000000000001 ) ){ // this makes ans look better
	    return guess; 
	}else{
	    guess =  ( n / guess + guess) / 2;
	    return sqrtHelper(n, guess);
	}
    }
    
    // checking
    public static void main(String[]args){
	Recursion r = new Recursion();
	System.out.println("\n01Recursion\n");

	System.out.println("(1.21) fact(int n):\n");
	System.out.println("r.fact(5):  expecting 120... " + r.fact(5));
	System.out.println("r.fact(10): expecting 3628800... " + r.fact(10) + "\n");

	System.out.println("(1.22) fib(int n):\n");	

	System.out.println("r.fib(0):  expecting 0... " + r.fib(0));
	System.out.println("r.fib(1):  expecting 1... " + r.fib(1));
	System.out.println("r.fib(17): expecting 1597... " + r.fib(17) + "\n");

	System.out.println("(1.23) sqrt(int n):\n");
	System.out.println("r.sqrt(1):   expecting 1.0... " + r.sqrt(1));
	System.out.println("r.sqrt(2):   expecting 1.414bleh... " +  r.sqrt(2));
	System.out.println("r.sqrt(9):   expecting 3.0... " +  r.sqrt(9));
	System.out.println("r.sqrt(13):  expecting 3.605bleh... " +  r.sqrt(13));
	System.out.println("r.sqrt(25):  expecting 5.0... " + r.sqrt(25));
	System.out.println("r.sqrt(64):  expecting 8.0... " + r.sqrt(64));
	System.out.println("r.sqrt(100): expecting 10.0... " + r.sqrt(100));
	System.out.println("r.sqrt(169): expecting 13.0... " + r.sqrt(169) + "\n\n");




    }


}
