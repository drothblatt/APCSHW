public class QuickSelect{
    
    public static void partition(int[] ary, int start, int end){
	int[] D = new int[ary.length];
	for (int i = end+1; i < D.length; i++){
	    D[i] = ary[i];
	}

	int pivot = ary[start];
         
        start++;


        while ( start < end ) { 
             if ( ary[start] < pivot ) { 
                  D[start] = ary[start];
             } else {
                  D[start] = ary[start];
             }
        }
        

	



    }





}
