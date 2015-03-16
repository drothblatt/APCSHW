
public class Tester{   

    public static void main(String[]args){
	MyLinkedList l = new MyLinkedList();
	
	System.out.println("\n" + l.name() + "\n");

	System.out.println("Is Empty? " + "\n" + l.isEmpty() + "\n"); // expect true
	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add(6);
	l.add("Hello");

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add('c');
	l.add(8);
	l.add(3.1415926);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");
	System.out.println("Is Empty? " + "\n" + l.isEmpty() + "\n"); // expect false

	l.add(3,21);
	l.add(0,'@');

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	l.add(7,'?');
	l.add(8,'_');

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Value at Index 4: " + l.get(4));

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");
	l.set(5, 22);

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("New Value at Index 5?... " + l.get(5));

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Removed: " + l.remove(6)); // should be pi 

	System.out.println("Current List: " + "\n" + l.toString());
	System.out.println("Current Size: " + "\n" + l.size() + "\n");

	System.out.println("Index of _ : " + l.indexOf('_') + "\n\n"); // should be 7 now

    }

}

