public class Recursion implements hw1{

    public String name(){
	return "Rothblatt,David";
    }

    public int fact(int n){
	if (n <= 1){ // 0! and 1! are both equal to 1
	    return 1;
	} else{
	    return n * fact(n-1);
	}
    }
    
    public int fib(int n){
	if (n <= 1) {
	    return n;
	} else {
	    return fib(n-2) + fib(n-1);
	}
    }

    public double sqrt(double n){
	double guess = 1;
	guess =  ( n / guess + guess) / 2;
	return n;
    }

    public double sqrtHelper(double n, double guess){
	guess = guess - ( ((guess*guess) - n) / (n*2));
	return 0;

    }

    public static void main(String[]args){
	Recursion r = new Recursion();
	System.out.println("\n01Recursion\n");

	System.out.println("(1.21) fact(int n):\n");
	System.out.println("    expecting 120... " + r.fact(5));
	System.out.println("    expecting 3628800... " + r.fact(10) + "\n");

	System.out.println("(1.22) fib(int n):\n");	

	System.out.println("    expecting 0... " + r.fib(0));
	System.out.println("    expecting 1... " + r.fib(1));
	System.out.println("    expecting 1597... " + r.fib(17) + "\n");

	System.out.println("(1.23) sqrt(int n):\n");
	System.out.println("    expecting 1.41bleh... " +  r.sqrt(2));
	System.out.println("    expecting 5... " + r.sqrt(25));
	System.out.println("    expecting 8... " + r.sqrt(64));
	System.out.println("    expecting 10... " + r.sqrt(100) + "\n\n");
    }


}
