//naveen
package durgaSoft;

import java.util.Hashtable;

//dynamic array type and allocated memory at runtime
public class ConceptOfHashtable {

	public static void main(String[] args) {
		//Hashtable is a class and can take any values for below case in key value pair form
		Hashtable h = new Hashtable();
		h.put("A", "Test");//h.put(key, value);
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		h.put(1, 100);//put to insert data
		h.put(2, 200);
		h.put(3, 300);
		h.put(4, 400);
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		//to restrict type it could take
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(10, "Cute");
		System.out.println(h1.get(10));
	}

}
