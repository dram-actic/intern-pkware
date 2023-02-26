import java.util.*;

public class ListInterfaceMethods {

	public static void main(String[] args) {
		int l[] = {0, 24, 7};
		ArrayList l1 = new ArrayList();		//Here by default capacity of arrayList is 10 and if arrayList reaches to its max capacity then a new arrayList 
											//object will be created with *New Capacity = (Current Capacity*3/2)+1
		ArrayList l2 = new ArrayList(4);  //Here capacity of arrayList is 4
		ArrayList nameList = new ArrayList(5);
		nameList.add("Vishal");
		nameList.add("Gautham");
		nameList.add("Talib");
		nameList.add("Khushi");
		nameList.add("Divyansh");
		nameList.add("edh");
		nameList.add(2, "Anish");
		System.out.println(nameList.get(4));
		
		Iterator it = nameList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

//Method of collections -> visit oracle documentation
/*
 ->ArrayList
  it is defined using dynamic arrays
  Therefore it is resizable
  Duplicates are allowed
  order of elements are preserved
  Null insertion is possible
  Heterogeneous abjects are allowed
 */
	