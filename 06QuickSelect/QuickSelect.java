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
        start++;

        while ( start < end ) { 
             if ( ary[start] < pivot ) { 
                  D[start] = ary[start];
                  start++;
             } else {
                  D[end] = ary[start];
                  end--;
		  start++;
             }
        }
        D[start] = pivot;
        
        System.out.println(Arrays.toString(D));
    }

    public static void main(String[]args){
	int[] testing = {19, 7, 14, 19, 2, 10, 6, 17};
	partition(testing, 2, 6);
    }
}

    

  
