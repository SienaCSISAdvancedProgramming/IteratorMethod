import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
   Class example of a method that takes an Iterator as a parameter.

   @author Jim Teresco
   @version Spring 2021
*/
public class IteratorMethod {

    /**
       A method to find and return the largest value in a sequence of Integer
       values produced by the given Iterator.

       @param i the Iterator
       @return the largest value produced by the Iterator
    */
    public static int max(Iterator<Integer> i) {
	
        // we require at least one element for this to make sense
        int result = i.next();
        while (i.hasNext()) {
            int x = i.next();
            if (x > result) {
                result = x;
            }
        }
        return result;
    }

    // a main method to try it out
    public static void main(String args[]) {

	// we can use max with an Iterator over a familiar
	// structure like an ArrayList
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(0);
	a.add(34);
	a.add(-23);
	a.add(882);
	a.add(3);
	a.add(-4);
	a.add(123);
	a.add(-2833);
	a.add(234);
	a.add(88);
	System.out.println("a: " + a);
	System.out.println("Largest: " + max(a.iterator()));

	// or with any Iterator from some other structure
	TreeSet<Integer> b = new TreeSet<Integer>();
	b.add(892);
	b.add(-33);
	b.add(0);
	b.add(-33);
	b.add(72);
	b.add(12);
	b.add(-2);
	b.add(-827);
	b.add(256);
	b.add(17);
	System.out.println("b: " + b);
	System.out.println("Largest: " + max(b.iterator()));
    }
}
