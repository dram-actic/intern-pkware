import java.util.HashSet;
import java.util.Iterator;

public class Set_Example {

	public static void main(String[] args) {
		 // Creating an empty HashSet
        HashSet<String> h = new HashSet<String>();
        
        h.add("India");	// using add() method
        h.add("Australia");
        h.add("South Africa");
  
        h.add("India");	// Adding duplicate elements
  
        System.out.println(h);
        System.out.println(h.contains("India"));
  
        h.remove("Australia");	// using remove() method
        System.out.println(h);
  
        
        Iterator<String> i = h.iterator();	// Iterating over hashSet 
        while (i.hasNext())
        	System.out.println(i.next());

	}

}
