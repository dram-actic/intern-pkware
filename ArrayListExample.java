import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		
//	inserting values using add function
		al1.add(13);
		al1.add(7);
		al1.add(21);
		al1.add(9);
		al1.add(52);
		
		al2.add(673);
		al2.add(100);
		al2.add(215);
		al2.add(934);
		al2.add(528);
		al2.add(000);
		
		System.out.println(al1);
		System.out.println(al2);
		
//		inserting values at particular index using add function
		al1.add(4,23);
		al1.add(1,70);
		for(int i=0; i<al1.size();i++) {
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		
//		adding a complete arraylist object to the al1
		al2.addAll(al1);
		System.out.println(al2);
		
//		sorting the list using static method of collections
		Collections.sort(al2);
		System.out.println(al2);
		
//		deleting all the values
		al1.clear();
		System.out.println(al1);
		
		System.out.println(al1.contains(5));
		System.out.println(al2.indexOf(100));
		
//		removing 1 elements by passing the index number
		al2.remove(4);
		System.out.println(al2);
		
		System.out.println(al1.isEmpty());
		
		ArrayList<Integer> al3 = new ArrayList<>();
		
//		cloning of list
		al3 = (ArrayList) al2.clone();
		System.out.println(al3);
		Iterator itr = al2.iterator();
//		for(itr.hasNext()) {
//			
//		}
	}

}
