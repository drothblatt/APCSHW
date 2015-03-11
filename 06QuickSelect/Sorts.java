import java.util.*;

public class Sorts{

    public static void quicksort(int[] ary){
	quicksort(ary, 0, ary.length-1);
    }

    public static void quicksort(int[] ary, int start, int end){

    }

    public static int partition(int[] ary, int start, int end){
        System.out.println(Arrays.toString(ary));
	Random r = new Random();
	int temp;
	int pi = start + r.nextInt(end - start + 1);
	int pivot = ary[pi];
	int pos = start;

	temp = ary[end];
	ary[end] = ary[pi];
	ary[pi] = temp;

        System.out.println("pivot: " + pivot + " , start: " + start + 
			   " , end: " + end); 

        while ( start < end) { 
	    if ( ary[pos] < pivot ) { 
		System.out.println ( ary[pos] + " < " + pivot) ;

		temp = ary[pos];
		ary[pos] = ary[start];
		ary[start] = temp;
		start++;
	    } else if ( ary[pos] > pivot ) {
		System.out.println ( ary[pos] + " > " + pivot) ;
		temp = ary[pos];
		ary[pos] = ary[end];
		ary[end] = temp;
		end--;
	    }
	    pos++;
	    System.out.println(Arrays.toString(ary));
        }
	temp = ary[pos];
	ary[start] = pivot;
	ary[pos] = temp; 
	System.out.println(Arrays.toString(ary));
	return start;
    }


    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};
	System.out.println(Arrays.toString(testing));
	System.out.println(partition(testing, 0, 7));
	System.out.println(Arrays.toString(testing));

    }

}
    

    
