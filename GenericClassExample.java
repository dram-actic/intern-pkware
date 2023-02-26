
/*class MyData{
	Integer i;
	public void add(Integer num) {
		i = num;
	}
	public Integer get() {
		return (i);
	}
} */

class MyData<T>{
	T i;
	public void add(T num) {
		i = num;
	}
	public T get() {
		return (i);
	}
}

//class Book<T> {
//    private static T book; // Using generics, type parameters are not allowed to be static. 
//    						//As static variable is shared among object so compiler can not determine which type to be used.
//}

public class GenericClassExample {

	public static void main(String[] args) {
		MyData<Integer> md1 = new MyData<Integer>();
		MyData<String> md2 = new MyData<String>();
		Integer x = 5;
		md1.add(x);
		
//		md.add("Rahul"); to pass the different type of arguments, we have to make different types of class to accept and set the values
//		md.get(3.14);
		
		md2.add("Rahul");
		System.out.println("md1 = "+md1.get()+"\t"+"md2 = "+md2.get());
	}
	
	/*
	 * A generic class declaration looks like a non-generic class declaration, except that the name is followed by a type parameter section <T>.
	 * As with the generic methods, the type parameter section of a generic class can have one or more type parameters seprated by commas.
	 */

}
