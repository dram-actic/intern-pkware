import java.util.*;

public class HashMap_Example {

	public static void main(String[] args) {
		 HashMap<Integer, String> hm1 = new HashMap<>();
	     HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	 
	        hm1.put(1, "one");	// Adding elements using put method
	        hm1.put(2, "two");
	        hm1.put(3, "three");
	        hm1.put(4, "four");
	 
	        hm2.put(4, "four");
	        hm2.put(5, "five");
	        hm2.put(6, "six");
	 
	        System.out.println("hm1 : "+ hm1);
	        System.out.println("hm2 : "+ hm2);
	        hm1.put(2, "four");
	        hm2.remove(5);	// using remove method
	        System.out.println(hm1.get(2));
	        
	        // for-each loop
	        for (Map.Entry<Integer, String> e : hm1.entrySet())
	            System.out.println("Key: " + e.getKey()+ "  Value: " + e.getValue());
	}

}
