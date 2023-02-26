import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		java.util.LinkedList<String> list = new java.util.LinkedList<>();
		list.addFirst("Deepak");
		list.addLast("Kumar");
		System.out.println(list.getFirst() +" "+ list.getLast());
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		
//	inserting values using add function
		ll1.add(13);
		ll1.add(7);
		ll1.add(21);
		ll1.add(9);
		ll1.add(52);
		
		ll2.add(673);
		ll2.add(100);
		ll2.add(215);
		ll2.add(934);
		ll2.add(528);
		ll2.add(000);
		
		System.out.println(ll1);
		System.out.println(ll2);
		
//		inserting values at particular index using add function
		ll1.add(4,23);
		ll1.add(1,70);
		for(int i=0; i<ll1.size();i++) {
			System.out.print(ll1.get(i)+" ");
		}
		System.out.println();
		
//		adding a complete arraylist object to the al1
		ll2.addAll(ll1);
		System.out.println(ll2);
		
//		sorting the list using static method of collections
		Collections.sort(ll2);
		System.out.println(ll2);
		
//		deleting all the values
		ll1.clear();
		System.out.println(ll1);
		
		System.out.println(ll1.contains(5));
		System.out.println(ll2.indexOf(100));
		
//		removing 1 elements by passing the index number
		ll2.remove(4);
		System.out.println(ll2);
		
		System.out.println(ll1.isEmpty());
		
		LinkedList<Integer> ll3 = new LinkedList<>();
		
//		cloning of list
		ll3 = (LinkedList) ll2.clone();
		System.out.println(ll3);
		Iterator itr = ll2.iterator();
		System.out.println(ll3.peekFirst());
		System.out.println(ll3.peekLast());
		
		ll2.poll();
		
//		for(itr.hasNext()) {
//			
//		}
	}

}
