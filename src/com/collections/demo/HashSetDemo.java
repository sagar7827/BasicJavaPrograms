package com.collections.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* HashSet : a class implemented set interface
 * 1) Heterogeneous Data --> allowed
 * 2) Insertion order --> Not preserved ( Index not supported)
 * 3) Duplicate elements --> Not allowed
 * 4) Multiple nulls Not allowed/ only single null is allowed
 * 
 * 
 */


public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		
		 HashSet myset = new HashSet();
		//Set myset = new HashSet();
		//HashSet <String> myset = new HashSet<String>();
		 
		 // adding elements
		 
		 myset.add(100);
		 myset.add("sagar");
		 myset.add('A');
		 myset.add(12.5);
		 myset.add(true);
		 myset.add(100);
		 myset.add(null);
		 myset.add(null);
		 
		 // printing
		 
		 System.out.println(myset); //[null, A, 100, sagar, 12.5, true]
		 
		 // remove element
		 myset.remove(12.5);  // 12.5 is value not index
		 System.out.println("After removing :"+myset);
		 
		 // Insertion is not possible 
		 
		 // accessing specific element not possible
		 
		 // convert HashSet --> ArrayList
		 
		 ArrayList arr = new ArrayList(myset);
		 System.out.println(arr.get(2));
		 
		 // Read all elements using only For..each loop
		 
		 for(Object a:myset)
		 {
			 System.out.println(a);
		 }
		 
		 // using Iterator
		 
		 Iterator it = myset.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 // clearing all elements
		 
		 myset.clear();
		 System.out.println(myset.isEmpty());

	}

}
