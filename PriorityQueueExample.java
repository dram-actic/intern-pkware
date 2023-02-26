import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Character> pr1 = new PriorityQueue<>();
		pr1.add('h');
		pr1.add('o');
		pr1.add('k');
		pr1.add('a');
		pr1.add('g');
		pr1.add('e');
		
		System.out.println(pr1);
		
		PriorityQueue<Character> pr2 = new PriorityQueue<>();
		pr2.add('s');
		pr1.addAll(pr2);
		System.out.println(pr1);
		
		System.out.println(pr1.peek());
		pr1.poll();
		pr1.offer('j');
		pr1.remove('a');
		System.out.println(pr1);
	}

}
