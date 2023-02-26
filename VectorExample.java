import java.util.Vector;

/*
	 Dynamic array is used to implement vector
	 duplicates are allowed
	 null insertion is allowed
	 order is preserved
	 methods are synchronized so thread safe
 */

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vect = new Vector<>();
		vect.add("Hashirama");
		vect.add("Oro-chimaru");
		vect.add("Kakashi");
		vect.add("Hinata");
		vect.add("Minato");
		
		System.out.println(vect);
		for(int i=0; i<vect.size();i++) {
			System.out.print(vect.get(i)+" ");
		}
		System.out.println(vect.capacity());
		vect.add(2,"Guy");
		vect.add("Master Roshi");
		System.out.println(vect);
		
		System.out.println(vect.contains("Obito"));
		System.out.println(vect.isEmpty());
		vect.remove(1);
		vect.sort(null);
		System.out.println(vect); //Collections.sort(vect);
		
		
		
	}

}
