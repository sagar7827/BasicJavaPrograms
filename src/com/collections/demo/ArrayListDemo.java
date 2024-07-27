package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;


/* Collection : To represent group of elements/objects/data into a single entity
 * "collection" is an interface available in java.util
 * ArrayList is a class which is implemented List interface.
 * 1) Heterogeneous data --> allowed ( different type of data)
 * 2)Insertion order --> preserved(index)
 * 3) Duplicate elements --> allowed
 * 4) multiple nulls --> allowed
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		
		ArrayList myList = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <String> mylist = new ArrayList<String>();
		
		// adding data into ArrayList.
		
		myList.add(100);
		myList.add("sagar");
		myList.add(true);
		myList.add('A');
		myList.add(100);
		myList.add(null);
		myList.add(null);
		
		// size of an arraylist
		
		System.out.println(myList.size());
		
		// printing data from an arraylist.
		
		System.out.println("Data of arraylist :"+myList);
		
		// Remove the element
		
		myList.remove(4);  // 4 is index of element
		System.out.println(" After Removing Data of arraylist :"+myList);
		
		// Insert element in ArrayList
		
		myList.add(4,200);  // add(index,value)
		System.out.println("After Insertion :"+myList);
		
		// modify element in ArrayList (modify/change.replace)
		myList.set(1,"Mangesh");
		System.out.println("After Replacing :"+myList);
		
		// access specific element from arraylist
		System.out.println(myList.get(3)); // 3 is index
		
		// Reading all the elements from ArrayList
		
		// using normal for loop
		
		/*for(int i=0; i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		 */
		
		//using inhanced for loop or for each loop
		
		/*for(Object x:myList)
		{
			System.out.println(x);
		}*/
		
		// using Iterator
		
		Iterator it = myList.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		// checking ArrayList is empty or not
		
		System.out.println(myList.isEmpty());
		
		// Remove all element from ArrayList
		
		ArrayList myList2 = new ArrayList();
		
		myList2.add(100);
		myList2.add(null);
		
		myList.removeAll(myList2);
		
		System.out.println(myList);
		
		// Remove all the ArrayList
		
		myList.clear();
		System.out.println(myList.isEmpty());
	}

}
