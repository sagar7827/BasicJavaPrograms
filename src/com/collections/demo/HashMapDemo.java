package com.collections.demo;

import java.util.HashMap;
import java.util.Iterator;

/* HashMap : is a class implemented Map interface.
 * Data can be stored in the form of key,value pairs.
 * Key is unique. But we can have duplicate values.
 * Insertion order not preserved ( Index not followed)
 * 
 */


public class HashMapDemo {

	public static void main(String[] args) {

		// declaration
		
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		
		// adding values
		
		hm.put(101,"John");
		hm.put(102,"David");
		hm.put(103,"ram");
		hm.put(102,"lop");
		
		// printing
		
		System.out.println(hm);
		
		// size 
		System.out.println(hm.size());
		
		// remove pair
		
		hm.remove(103); //103 is key of pair
		System.out.println(hm);
		
		// access value 
		System.out.println(hm.get(101));
		
		// get all keys from hashmap
		
		System.out.println(hm.keySet());//only keys
		System.out.println(hm.values());//only values
		System.out.println(hm.entrySet());//both key and value
		
		// reading data 
		// using for each
	/*	
		for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}*/
		
		// using Iterator
		
		Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
