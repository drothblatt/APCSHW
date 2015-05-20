import java.util.*;

public class HeapSort{

    public static void heapify(int[] a){
	int size = a.length;
	for (int i = a.length - 1; i >= 0; i--){
	    moveDown(a, i, size);
	}
	System.out.println(Arrays.toString(a));

	
    }
    
    public static void moveDown(int[] a, int i, int size){
	if ( ((i*2)+2) < size ){ // tailored, heap-sort version of ComeOnDownMax from MyHeap
		if (a[i] < a[i*2]){
		    swap(a, i, (i*2)+1);
		    moveDown(a, (i*2)+1, size);
		} 
		if (a[i] < a[(i*2)+1] ){
		    swap(a, i, (i*2)+2);
		    moveDown(a, (i*2)+2, size);
		}
	} if ( ((i*2)+1) < size && a[i] < a[(i*2)+1] ){
	    swap(a, i, (i*2)+1);
	    moveDown(a, (i*2)+1, size);
	}
    }

    public static void heapsort(int[] a){}


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
