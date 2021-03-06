import java.util.*;

public class QuickSelect{

    public static int quickSelect(int[] ary, int k){
	if (k < 0 || k >= ary.length){
	    throw new IndexOutOfBoundsException();
	}
	int start = 0;
	int end = ary.length - 1;

	int ans = -1;
	while (ans <= 0){  
	    int pi = partition(ary, start, end); // pi - index of resulting partition
	    if ( pi == k){
		ans = ary[pi];
	    } else if (pi > k) {
		end = pi - 1;
	    } else if (pi < k){
		start = pi + 1;
	    }
	}
	return ans;
    }


    public static int partition(int[] ary, int start, int end){
        //System.out.println(Arrays.toString(ary));
	int[] d = new int[ary.length];

	Random r = new Random();
	int pivot = ary[start + r.nextInt(end - start + 1) ];

	/* System.out.println("pivot: " + pivot + " , start: " + start + 
	   " , end: " + end); */
	int pos = start;
	int temp = 0;

        while ( start < end) { 
	    if ( ary[pos] < pivot ) { 
		//System.out.println ( ary[pos] + " < " + pivot) ;
		d[start] = ary[pos];
		start++;
	    } else if ( ary[pos] > pivot ) {
		//System.out.println ( ary[pos] + " > " + pivot) ;
		d[end] = ary[pos];
		end--;
	    }
	    pos++;
	    // System.out.println(Arrays.toString(ary));
        }

	d[start] = pivot; // no if statement needed
	for(int i = 0; i < d.length; i++){
	    if (d[i] != 0){
		ary[i] = d[i];
	    }
	}	 
	// System.out.println(Arrays.toString(ary));
	return start;
    }

    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};

	// check to see if completely works... sorting the array
	int[] sortWQS = new int[testing.length];
	for (int i = 0; i < sortWQS.length; i++){
	    sortWQS[i] = quickSelect(testing,i+1);
	}
	System.out.println(Arrays.toString(sortWQS));
	// success!!!
	    

	//System.out.println(quickSelect(testing,0) + "^ my answer"); // returns exceptions as it should
	//System.out.println(quickSelect(testing,-3)); // returns exception as it should
	//System.out.println(quickSelect(testing,15)); // returns exception as it should
	//System.out.println(partition(testing, 2, 7));


    }

}
    

    

  
