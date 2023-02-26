/*
 Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods 
 or, with a single class declarartion, set of related types.
 
 */
public class GenericExample {
	
/*	public void printArray(String[] str) {
		for(int i=0;i<str.length; i++)
			System.out.println(str[i]);
	}
//	Method overlaoding
	public void printArray(Integer[] nums) {
		for(int i=0;i<nums.length; i++)
			System.out.println(nums[i]);
	}   */
//	We can write a single generic method declaration that can be called with arguments of different type
	
	public <E> void printArray(E[] array) {
//	Here, 'E' will be replaced to their corresponding data types during compile time, hence this method become a genralised form that can be run on any datatype arrays
		for(E x:array)  //for(int i=0;i<array.length; i++)
			System.out.println(x);
	}
	
	public static void main(String[] args) {
		GenericExample ge1 = new GenericExample();
		String[] name = new String[] {"Shikamaru", "Hinata", "Sakura"};
		Integer[] nums = new Integer[] {4, 7, 22, 24};
		ge1.printArray(name);
		ge1.printArray(nums);
	}
	
	/*
	 -> Rules
	 *	All generic method declaration have a type parameter section(<E>) delimited by angle brackets(< and >) that precedes the method's return type.
	 *	Each type parameter section contains one or more type parameters seprated by commas (<E1, E2, E3>).
	 *	The type parameters(E) can be used to declare the return type.
	 *	Type parameters can represents only refrence types, not primitive types (like int, double and char).
	 */
	 
}