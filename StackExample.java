import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<Integer>();
		 	stack.push(10);  //push
	        stack.push(15);
	        stack.push(30);
	        stack.push(20);
	        stack.push(5);
	        System.out.println("Initial Stack: " + stack);
	        System.out.println("Popped element: "+ stack.pop()); //pop
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("The element at the top of the"+ " stack is: " + stack.peek());  //peak
	        System.out.println("Stack after pop operation "+ stack);
	        System.out.println(stack.empty());  //empty
	        System.out.println(stack.search(15));  //search or contains
	        System.out.println(stack.elementAt(4));  //elementAt -> finding the position of the element
	        System.out.println(stack.size());  //size
	}

}
