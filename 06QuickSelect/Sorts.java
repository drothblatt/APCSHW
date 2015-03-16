import java.util.*;

public class Sorts{

    public String name(){
	return "rothblatt.david";
    }

    public static void quicksort(int[] ary){
	quicksort(ary, 0, ary.length-1);
    }

    public static void quicksort(int[] ary, int start, int end){
	if (start < end){
	    int pi = partition(ary, start, end);
	    quicksort(ary, start, pi-1); // quicksort on left half of pivot
	    quicksort(ary, pi + 1, end); // quicksort on right half of pivot
	}
    }

    public static int partition(int[] ary, int start, int end){
	// System.out.println(Arrays.toString(ary));
	
	Random r = new Random();
	int temp;
	int pi = start + r.nextInt(end - start + 1);
	int pivot = ary[pi];
	int pos = start;

	/* System.out.println("pivot: " + pivot + " , start: " + start + 
	   " , end: " + end);  */

	// move pivot to the end
	temp = ary[end];
	ary[end] = ary[pi];
	ary[pi] = temp;
	// swapping to move to proper side
	for (int i = start; i < end; i++){
	    if (ary[i] < pivot){
		temp = ary[i];
		ary[i] = ary[pos];
		ary[pos] = temp;
		pos++;
	    }
	}
	// move pivot back to where it needs to be
	temp = ary[end];
	ary[end] = ary[pos];
	ary[pos] = temp;
	//System.out.println(Arrays.toString(ary));
	return pos;
    }

    public static boolean sorted(int[] ary){
	for (int i = 0; i < ary.length-1; i++){
	    if (ary[i] > ary[i+1]){
		return false;
	    }
	} 
	return true;
    }

    public static void main(String[]args){
	/*
	int[] testing = new int[2000000];
	Random r = new Random();
	for (int i = 0; i < testing.length; i++){
	    testing[i] = r.nextInt(10000000)-5000000;
	}
					   
	//System.out.println(Arrays.toString(testing));
	quicksort(testing);
	//System.out.println(Arrays.toString(testing) + "\n" + sorted(testing));
	System.out.println(sorted(testing));
	*/
    }

}
    

    
