import java.util.*;

public class Comparing{

    public static void main(String[] args){
	int size = 1000000;
	int sort = 0;

	Random r = new Random();
       
	try{
	    sort = Integer.parseInt(args[0]);
	    size = Integer.parseInt(args[1]);
	} catch( IndexOutOfBoundsException e){
	    System.out.println("didn't work. Comparing <sort> <size>");
	    return;
	}

	int[] arr = new int[size];
	for (int i = 0; i < arr.length; i++){
	    arr[i] = r.nextInt(100000) - 50000;
	}

	if (sort == 0){
	    System.out.println("mergesort:");
	    Sorts.mergesort(arr);
	} else{
	    System.out.println("arrays.Sort(): ");
	    Sorts.arrays.Sort();
	}

    }
					      