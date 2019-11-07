//naveen
//arraylist: dynamic array type and allocated memory at runtime
//1>can contain duplicate values/elements
//2>maintains insertion order automatically
//3> synchronised 
//4>allows random access to fetch data as it stores values on basis of index

package durgaSoft;

import java.util.ArrayList;
import java.util.Iterator;

public class ConceptOfArraylist {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();// any type of data could be added, so it is also called non generic

		ar.add(100);// will be added on index 0
		ar.add("hello");// will be added on index 1
		ar.add('M');// will be added on index 2
		ar.add(1.0040);// will be added on index 3
		ar.add(-15);// will be added on index 4
		System.out.println(ar.size());
		ar.add("Payu");// will be added on index 5
		System.out.println(ar.size());
		System.out.println(ar.get(4));

		ar.remove(4);// value on index 4 will be removed
		System.out.println(ar.size());
		ar.add(100);// possible to add duplicate value

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("******************");
		// to restrict data type of data that go in arraylist: make it generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();// <Integer>,<String>
		ar1.add(5);
		// ar1.add("Meet"); will now give err as i am trying to feed string

		// System.out.println("******************");
		// ArrayList<E> ar2 = new ArrayList<E>();//when we are not sure of which type of
		// data we will be inserting in arraylist,<E>is used

		System.out.println("******************");
		// Employee class objects
		Employee e1 = new Employee("Tom", 25, "Sales");
		Employee e2 = new Employee("Ross", 29, "Marketing");
		Employee e3 = new Employee("Joey", 35, "Technical");
		// create arraylist
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		// iterator to traverse the values
		Iterator<Employee> i = e.iterator();
		while (i.hasNext()) {
			Employee emp = i.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("******************");
		// addAll()
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Test");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Selenium");
		ar4.addAll(ar5);
		for (int k = 0; k < ar4.size(); k++) {
			System.out.println(ar4.get(k));
		}
		System.out.println("******************");
		// removeAll()
		ar4.removeAll(ar5);
		for (int k = 0; k < ar4.size(); k++) {
			System.out.println(ar4.get(k));
		}
		// retainAll() : to get common values in 2 arrayList objects
	}
}
