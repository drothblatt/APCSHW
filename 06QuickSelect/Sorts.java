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





    
    public static void mergesort(int[] arr){
	if (arr.length == 1){ // essentially a base case
	    return;
	}
	int divider = arr.length/2;
	int[] arr1 = new int[divider];
	int[] arr2 = new int[arr.length - divider];
	for (int m = 0; m < arr1.length; m++){
	    arr1[m] = arr[m];
	}
	for (int n = 0; n < arr2.length; n++){
	    arr2[n] = arr[n + divider];
	}
	mergesort(arr1); // recursion until we're left w/ arrays of 0 and 1 length.
	mergesort(arr2);
	letsUnite(arr, arr1, arr2);
    }
    public static void letsUnite(int[] arr, int[] arr1, int[] arr2){
	int a = 0, b = 0, c = 0;
	while (b < arr1.length && c < arr2.length){
	    if (arr1[b] < arr2[c]){
		arr[a] = arr1[b];
		b++;
	    } else{
		arr[a] = arr2[c];
		c++;
	    }
	    a++; // a gets bigger regardless
	}
	for (int i = b; i < arr1.length; i++ , a++){
	    arr[a] = arr1[i];
	}
	for (int j = c; j < arr2.length; j++ , a++){
	    arr[a] = arr2[j];
	}
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
    

    
