
public class CollectionFrameworkIntro {
	public static void main(String[] args) {
		
	}
}


/*
 * Collection -> a group of things/objects
 
 * The collection framework provides a well designed set of interfaces and classes 
 	for storing and manipulating groups of data as a single unit, a collection.
 *	It contains 
 	->Interfaces
 	->Implementations(classes)
 	->Algorithms
 *	Benefits
 	-> Represents group of values as a single entity.
 	-> Size expandable (can grow or shrink depends on the data, so its flexible)
 	->Homogeneous and heterogeneous data can be stored
 	->in frameworks, all classes are abstract datatypes
 *  Collection is an Interface
 *  Collections is a class
 		collection class provies severl utility methods like sort().
 *	Interfaces in collection framework
 	->Collection Interface
 		collection ko koi bhi class directly implements nhi karti hai, basically class implements child of collection interfaces.
 	->List interface extends collection interface (child of collection interface)
 		Duplicates values allowed
 		Insertion order must be preserved
 		ArrayList, LinkedList, Vector, Stack are the Implementations classes.
 	->Set
 		duplicate elements are not alloweded
 		Insertion order is not preserved preserved
 		HashSet,LinkedHashSet are the classes implemented Set Interfaces.
 		
 		->SortedSet
 		child interface of a set
 		cannot contain dublicate elements
 		some sorted order
 		
 		->NavigableSet
 		child interface of a set
 		It defines savral methods for navigations purposes
 		TreeSet is implementations class
 	->Queue
 	->Map
 	Map is not a child of collection Interface, it's seprate.
 	it is used to represent group of objects as key value pairs
 	Keys and values both are object
 	Keys must be unique but values can be repeat
 	HashMAp, LinkedHashMap, WeakHashMAp, IdentityHashMap, Hashtable are Implementations classes.
 	
 	->SortedMap
 	->NavigableMap	
 				
 */