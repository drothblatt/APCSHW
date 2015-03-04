import java.util.*;
import java.lang.*;

public class Sorts{

    public static void mergesort(int[] arr){
	if (arr.length == 1){ // essentially a base case
	    return;
	}
	/*
	int[] copy = new int[arr.length];
	
	for (int i = 0; i < arr.length; i++){
	    copy[i] = arr[i];
	}
	*/
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
	Random r = new Random();
	System.out.println("\nMergeSort v.0.1.0\n");


	if (args.length == 0 || Integer.parseInt(args[0]) == 0 ){  

	    // TEST CASE 1:
	    
	    int[] a1 = { -50, -43, -9, -2, 0, 1, 6, 10, 14, 19, 26, 34, 40, 73 } ;
	    System.out.println("Test Case 1:");
	    System.out.println("\nBefore: " + Arrays.toString(a1) + "\n\nsorting...\n");
	    mergesort(a1);
	    System.out.println("After:  " + Arrays.toString(a1) + "\n"); // A should be same as B

	

	    // TEST CASE 2:


	    int[] a2 = {100, 67, 49, 34, 26, 13, 5, 1, 0, -1, -5, -19, -23, -29 } ;
	    System.out.println("Test Case 2:");
	    System.out.println("\nBefore: " + Arrays.toString(a2) + "\n\nsorting...\n");
	    mergesort(a2);
	    System.out.println("After:  " + Arrays.toString(a2) + "\n"); // A should be reverse of B

	

	    // TEST CASE 3a:

	    int tc3a = r.nextInt(16) + 3;
	    int[] a3a = new int[tc3a];
	    for (int i = 0; i < a3a.length; i++){
		a3a[i] = r.nextInt(6) - 3;
	    }
	    System.out.println("Test Case 3a:");
	    System.out.println("\nBefore: " + Arrays.toString(a3a) + "\n\nsorting...\n");
	    mergesort(a3a);
	    System.out.println("After:  " + Arrays.toString(a3a) + "\n"); // A should be reverse of B

      


	    // TEST CASE 3b: 

	    int tc3b = r.nextInt(16) + 3;
	    int[] a3b = new int[tc3b];
	    for (int i = 0; i < a3b.length; i++){
		a3b[i] = r.nextInt(2000001) - 1000000;
	    }
	    System.out.println("Test Case 3b:");
	    System.out.println("\nBefore: " + Arrays.toString(a3b) + "\n\nsorting...\n");
	    mergesort(a3b);
	    System.out.println("After:  " + Arrays.toString(a3b) + "\n");

	} else{

 


	    // Answer about changing run time... no, all run in just about the same amount of time. 
	    // All ran at about... real: 0.105 s, user: 0.080 s, sys: 0.029 s

	    // TEST CASE 1:
	    if (Integer.parseInt(args[0]) == 1){  
		int[] a1 = { -50, -43, -9, -2, 0, 1, 6, 10, 14, 19, 26, 34, 40, 73 } ;
		System.out.println("Test Case 1:");
		System.out.println("\nBefore: " + Arrays.toString(a1) + "\n\nsorting...\n");
		mergesort(a1);
		System.out.println("After:  " + Arrays.toString(a1) + "\n"); // A should be same as B

	    }

	    // TEST CASE 2:
	    if (Integer.parseInt(args[0]) == 2){

		int[] a2 = {100, 67, 49, 34, 26, 13, 5, 1, 0, -1, -5, -19, -23, -29 } ;
		System.out.println("Test Case 2:");
		System.out.println("\nBefore: " + Arrays.toString(a2) + "\n\nsorting...\n");
		mergesort(a2);
		System.out.println("After:  " + Arrays.toString(a2) + "\n"); // A should be reverse of B

	    }

	    // TEST CASE 3a:
	    if (Integer.parseInt(args[0]) == 3){

		int tc3a = r.nextInt(16) + 3;
		int[] a3a = new int[tc3a];
		for (int i = 0; i < a3a.length; i++){
		    a3a[i] = r.nextInt(6) - 3;
		}
		System.out.println("Test Case 3a:");
		System.out.println("\nBefore: " + Arrays.toString(a3a) + "\n\nsorting...\n");
		mergesort(a3a);
		System.out.println("After:  " + Arrays.toString(a3a) + "\n"); // A should be reverse of B

	    }


	    // TEST CASE 3b: 
	    if (Integer.parseInt(args[0]) == 4){

		int tc3b = r.nextInt(16) + 3;
		int[] a3b = new int[tc3b];
		for (int i = 0; i < a3b.length; i++){
		    a3b[i] = r.nextInt(2000001) - 1000000;
		}
		System.out.println("Test Case 3b:");
		System.out.println("\nBefore: " + Arrays.toString(a3b) + "\n\nsorting...\n");
		mergesort(a3b);
		System.out.println("After:  " + Arrays.toString(a3b) + "\n");

	    }

	}		   
		       
    }

}


