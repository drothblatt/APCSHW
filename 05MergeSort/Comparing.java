import java.util.*;

public class Comparing{
    // See screenshot of terminal to see actual results.
    // A summary of results: arrays.sort() was faster, getting progressively faster as size went up

    public static void main(String[] args){
	int size = 1000000;
	int sort = 0;

	Random r = new Random();

	if (args.length == 0){
	    System.out.println("Compaing <sort> <size>... " +
			       "Need to pick a sort (0 for mergesort, 1 for arrays.sort() ");
	    return;
	}
       
	try{
	    sort = Integer.parseInt(args[0]);
	    size = Integer.parseInt(args[1]);
	} catch( IndexOutOfBoundsException e){
	    System.out.println("Didn't work. Comparing <sort> <size>");
	    return;
	}

	int[] arr = new int[size];
	for (int i = 0; i < arr.length; i++){
	    arr[i] = r.nextInt(100000) - 50000;
	}

	if (sort == 0){
	    System.out.println("MergeSort:");
	    System.out.println(size + "\n");
	    Sorts.mergesort(arr);
	} else{
	    System.out.println("arrays.sort(): ");
	    System.out.println(size + "\n");
	    Arrays.sort(arr);
	}
    }

}
					      
