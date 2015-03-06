import java.util.*;

public class QuickSelect{


    public static int partition(int[] ary, int start, int end){
        System.out.println(Arrays.toString(ary));
	int[] d = new int[ary.length];
        for (int i = 0; i < start; i++) {
            d[i] = ary[i];
	}
	for (int i = end+1; i < d.length; i++){
	    d[i] = ary[i];
	}
        //System.out.println(Arrays.toString(d));
	Random r = new Random();
	int pivot = ary[start + r.nextInt(end - start + 1) ];
	System.out.println("pivot: " + pivot + " , start: " + start + 
			   " , end: " + end);
	int pos = start;
	//System.out.println("While Loop:");
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
	    //System.out.println(Arrays.toString(d));
        }
	//System.out.println( start + " == " + end + " ?");

	d[start] = pivot; // no if statement needed

        System.out.println(Arrays.toString(d));
    }

    
    public static void partition(int[] ary, int start, int end){
        System.out.println(Arrays.toString(ary));
	int[] d = new int[ary.length];
        for (int i = 0; i < start; i++) {
            d[i] = ary[i];
	}
	for (int i = end+1; i < d.length; i++){
	    d[i] = ary[i];
	}
        //System.out.println(Arrays.toString(d));
	Random r = new Random();
	int pivot = ary[start + r.nextInt(end - start + 1) ];
	System.out.println("pivot: " + pivot + " , start: " + start + 
			   " , end: " + end);
	int pos = start;
	//System.out.println("While Loop:");
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
	    //System.out.println(Arrays.toString(d));
        }
	//System.out.println( start + " == " + end + " ?");

	d[start] = pivot; // no if statement needed

        System.out.println(Arrays.toString(d));
    }

    public static void main(String[]args){
	int[] testing = {21, 7, 19, 1, 4, 3, 23, 6, 35, 17};
	partition(testing, 4, 8);
    }

    // fin.
}

    

  
