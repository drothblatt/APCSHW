import java.util.*;

public class HeapSort{

    private static void heapify(int[] a){
	int size = a.length;
	for (int i = a.length - 1; i >= 0; i--){
	    moveDown(a, i, size);
	}
    }
    
    private static void heapToSort(int[] a){ // utilize heap to sort the array
	for (int i = a.length - 1; i >= 0; i--){
	    swap(a, 0, i); // swap a[0], the max num of the heap, with the end. 
	    moveDown(a, 0, i); // only reorganize numbers up to i. 
	}
    }

    private static void moveDown(int[] a, int i, int size){
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

    public static void heapsort(int[] a){
	heapify(a); // part 1 of heapsort, altering array to be a psuedo-heap
	heapToSort(a); // part 2 of heapsort, moving max vals to the back one at a time
    }


    private static void swap(int[] a, int x, int y){
	int temp = a[x];
	a[x] = a[y];
	a[y] = temp;
    }
	       
    public static void main(String[]args){
	int[] x = {3, 9, 1, 6, 5, 8, 10, 2, 13, 4};
	System.out.println(Arrays.toString(x));
	heapsort(x);
	System.out.println(Arrays.toString(x));


    }





}
