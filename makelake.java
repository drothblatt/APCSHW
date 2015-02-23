public class Makelake{
    private int R, C, E, N;
    private int[][] p;
    private int[] s;
    

    public Makelake(String filename){
	
	p = new int[R][C];
	
	try{
	    Scanner in = new Scanner(new File(filename));
	    //keep reading next line
	    int line = 0; 
	    while(in.hasNext()){
		if (line == 0) R = 
		String line= in.nextLine();
		if(maxy==0){
		    //calculate width of the maze
		    maxx=line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans+=line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: "+filename+" could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}


}