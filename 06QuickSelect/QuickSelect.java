import java.util.*;

public class QuickSelect{

    public static int quickSelect(int[] ary, int k){
	if (k <= 0 || k > ary.length){
	    throw new IndexOutOfBoundsException();
	}
	return 1;
    }


    public static int partition(int[] ary, int start, int end){
        System.out.println(Arrays.toString(ary));
	int[] d = new int[ary.length];

        //System.out.println(Arrays.toString(d));
	Random r = new Random();
	int pivot = ary[start + r.nextInt(end - start + 1) ];

	System.out.println("pivot: " + pivot + " , start: " + start + 
			   " , end: " + end);
	int pos = start;
	int temp = 0;
	//System.out.println("While Loop:");
        while ( start < end) { 
	    if ( ary[pos] < pivot ) { 
		System.out.println ( ary[pos] + " < " + pivot) ;
		d[start] = ary[pos];
		start++;
	    } else if ( ary[pos] > pivot ) {
		System.out.println ( ary[pos] + " > " + pivot) ;
		d[end] = ary[pos];
		end--;
	    }
	    pos++;
	    System.out.println(Arrays.toString(ary));
        }
	//System.out.println( start + " == " + end + " ?");

	d[start] = pivot; // no if statement needed
        System.out.println(Arrays.toString(d));
	return start;

    }

    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};
	//System.out.println(partition(testing, 2, 7));
	System.out.println(quickSelect(testing,5)); 
	System.out.println(quickSelect(testing,-3)); // returns exception as it should
	System.out.println(quickSelect(testing,15)); // returns exception as it should
	
	

    }

    
    
}

    

  
