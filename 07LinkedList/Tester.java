
public class Tester{   

    public static void main(String[]args){
	MyLinkedListOld<Integer> l = new MyLinkedListOld<Integer>();
	
	System.out.println("\n" + l.name() + "\n");

	System.out.println("Is Empty? " + "\n" + l.isEmpty() + "\n"); // expect true
	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add(6);
	l.add(7);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add(10);
	l.add(8);
	l.add(3);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");
	System.out.println("Is Empty? " + "\n" + l.isEmpty() + "\n"); // expect false

	l.add(3,21);
	l.add(0,19);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add(7,25);
	l.add(8,36);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Value at Index 4: " + l.get(4)); // should be 21

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");
	l.set(5, 22);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("New Value at Index 5?... " + l.get(5));

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Removed: " + l.remove(6)); // should be 3 

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Index of 36 : " + l.indexOf(36) + "\n\n"); // should be 7 now

    }

}

