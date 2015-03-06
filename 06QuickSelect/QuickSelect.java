import java.util.*;

public class QuickSelect{
    
    public static void partition(int[] ary, int start, int end){
        System.out.println(Arrays.toString(ary));
	int[] D = new int[ary.length];
        for (int i = 0; i < start; i++) {
            D[i] = ary[i];
	}
	for (int i = end+1; i < D.length; i++){
	    D[i] = ary[i];
	}
        System.out.println(Arrays.toString(D));

	int pivot = ary[start];
	//System.out.println("pivot: " + pivot);
	int pos = start;
	//System.out.println("While Loop:");
        while ( start < end) { 
	    if ( ary[pos] < pivot ) { 
		//System.out.println ( ary[pos] + " < " + pivot) ;
		D[start] = ary[pos];
		start++;
	    } else if ( ary[pos] > pivot ) {
		//System.out.println ( ary[pos] + " > " + pivot) ;
		D[end] = ary[pos];
		end--;
	    }
	    pos++;
	    System.out.println(Arrays.toString(D));
        }
	//System.out.println( start + " == " + end + " ?");
	
	if (start == end){
	    D[start] = pivot;
	}
        
        System.out.println(Arrays.toString(D));
    }

    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};
	partition(testing, 4, 8);
    }

    // yello.
}

    

  
