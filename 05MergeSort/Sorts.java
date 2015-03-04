import java.util.*;
import java.lang.*;

public class Sorts{

    public static void mergesort(int[] a){
	if (a.length <= 1){
	    return;
	}

	int[] copy = new int[a.length];
	
	for (int i = 0; i < a.length; i++){
	    copy[i] = a[i];
	}
	
	int divider = a.length/2;
	int[] arr1 = new int[divider];
	int[] arr2 = new int[a.length - divider];

	for (int m = 0; m < arr1.length; m++){
	    arr1[m] = a[m];
	}
	for (int n = 0; n < arr2.length; n++){
	    arr2[n] = a[n + divider];
	}

	System.out.println(Arrays.toString(a) + "\n" + Arrays.toString(arr1)
			   + "\n" + Arrays.toString(arr2) + "\n");
    }

    /*
    public String toString(int[] z){
	String rStr = " [ ";
	for (int i = 0; i < z.length; i++){
	    rStr += z[i] + " ";
	}
	rStr += "] ...";
	return rStr;
    }
    */
    
    public static void main(String[]args){
	Random r = new Random();
	int rLen = r.nextInt(20) + 3;
	int[] tmi = new int[rLen];
	for (int i = 0; i < tmi.length; i++){
	    tmi[i] = r.nextInt(80) - 40;
	}
	mergesort(tmi);
    }
    



}
