
public class WrapperClass {

	public static void main(String[] args) {
		
		//valueOf method is static method that available in all wrapper class. It takes string as an arguments and returns an object of same data called.
		Integer it1 = Integer.valueOf(41);
		Float flt1 = Float.valueOf("3.14");
		System.out.println(it1);
		System.out.println(flt1);
		
		//parseXXX (XXX->data type) is a static method & XXX can be replaced by any primitive data-type.
		int x = Integer.parseInt("61"); //parseInt returns the argument string into its (primitive data type i.e. XXX) data-type value.
		double y = Double.parseDouble("39.0965");
		System.out.println(x);
		System.out.println(y);
		
		//xxxValue(), it is an instance method of wrapper class and returns corresponding primitive data-type.
		int w = it1.intValue();
		float q = flt1.floatValue();
		System.out.println(w);
		System.out.println(w);
		
	}

}
