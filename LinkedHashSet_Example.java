import java.util.*;

public class LinkedHashSet_Example {

	public static void main(String[] args) {
		// Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        linkedset.add("A");	// using add() method
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");
        
        linkedset.add("A");	// This will not add new element as A already exists
        linkedset.add("E");

        System.out.println(linkedset.size());	// using size() method
 
        System.out.println(linkedset);
        
        System.out.println(linkedset.remove("D"));	// using remove() method

        System.out.println("Trying to Remove Z which is not " +"present: " + linkedset.remove("Z"));
 
        System.out.println(linkedset.contains("A"));	// Set or not using contains() method
 
        System.out.println(linkedset);

	}

}
