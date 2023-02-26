
class A{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

}

class ABC implements Cloneable{
	int p;
	int q;
	@Override
	public String toString() {
		return "ABC [p=" + p + ", q=" + q + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class Shallow_Deep_Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		A obj1 = new A();
		obj1.i = 4;
		obj1.j = 13;
//		Shallow Copy
		A obj2 = obj1;  // here obj2 is act as a refrence variable, So both obj1 & obj2 referring to the same objects, so it's called Shallow Copy
		obj2.j = 9;
		System.out.println(obj1);	// here after changing in the values of obj2, expecting i=4 & j=9
		System.out.println(obj2);  // here we expecting the values of i=4 & j=13
		
//		Deep Copy
		A obj3 = new A();
		obj3.i = obj1.i;
		obj3.j = obj1.j; // here we are copying each values of obj1 to obj3 manually and it's called deep cloning as it not refering to he same object. 
		// but deep copy method is not a good way to copy the object so there is method called clone.
		
		
		ABC ob1 = new ABC();
		ob1.p = 10;
		ob1.q = 16;
		System.out.println(ob1);
		
		ABC ob2 = (ABC) ob1.clone();
		ob2.p = 9;
		ob2.q = 33;
		System.out.println(ob1);
		System.out.println(ob2);
	}
}
