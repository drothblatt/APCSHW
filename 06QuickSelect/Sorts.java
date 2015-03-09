import java.util.*;

public class Sorts{

    public static void quicksort(int[] ary){
	  



    }

    public static void slowsort(int[] ary){
	int[] d = new int[ary.length];
	for (int i = 0; i < ary.length; i++){
	    d[i] = quickSelect(ary,i+1);
	}
	for (int i = 0; i < d.length; i++){
	    ary[i] = d[i];
	}
    }

    public static int quickSelect(int[] ary, int k){
	if (k <= 0 || k > ary.length){
	    throw new IndexOutOfBoundsException();
	}
	int start = 0;
	int end = ary.length - 1;

	int ans = -1;
	while (ans <= 0){  
	    int pi = partition(ary, start, end); // pi - index of resulting partition
	    if ( pi == k-1){
		ans = ary[pi];
	    } else if (pi > k-1) {
		end = pi - 1;
	    } else if (pi < k-1){
		start = pi + 1;
	    }
	}
	return ans;
    }


    public static int partition(int[] ary, int start, int end){
        //System.out.println(Arrays.toString(ary));
	//int[] d = new int[ary.length];

	Random r = new Random();

	int rInt = start + r.nextInt(end - start + 1);
	int pivot = ary[rInt];

	int pos = start;
	int temp = 0;

	

        while ( start < end) { 
	    if ( ary[pos] < pivot ) { 
		d[start] = ary[pos];
		start++;
	    } else if ( ary[pos] > pivot ) {
		d[end] = ary[pos];
		end--;
	    }
	    pos++;
        }

	d[start] = pivot; // no if statement needed
	for(int i = 0; i < d.length; i++){
	    if (d[i] != 0){
		ary[i] = d[i];
	    }
	}	 
	return start;
    }

    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};
	System.out.println(Arrays.toString(testing));
	quicksort(testing);
	System.out.println(Arrays.toString(testing));

    }

}
    

    