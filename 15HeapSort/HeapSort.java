import java.util.*;

public class HeapSort{

    public static void heapify(int[] a){
	for (int i = a.length - 1; i >= 0; i--){
	    if (a[i] > a[i/2]){
		swap(a, i, i/2);
	    }
	}
	System.out.println(Arrays.toString(a));
	
    }
    
    public static void fixHeap(int[] a){}

    public static void sort(int[] a){}


    public static void swap(int[] a, int x, int y){
	int temp = a[x];
	a[x] = a[y];
	a[y] = temp;
    }
	       
    public static void main(String[]args){
	int[] x = {3, 9, 1, 6, 5, 8, 10, 2, 13, 4};
	heapify(x);

    }





}
