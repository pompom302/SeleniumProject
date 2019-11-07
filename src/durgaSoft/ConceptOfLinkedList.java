//naveen
//stores value in node form
//every nodes with two parts:actual data(data) ; referenc of the next node(next)
//    head
//      |__>  data|next --->data|next --->data|next --null
//head points to first node;last node's next points to null
package durgaSoft;

import java.util.Iterator;
import java.util.LinkedList;

public class ConceptOfLinkedList {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("Appium");
		ll.add("Ranorex");

		// print
		System.out.println("Elements of linked list: " + ll);
		// addFirst
		ll.addFirst("Watir");
		System.out.println("Elements of linked list: " + ll);
		// addLast
		ll.addLast("Cucumber");
		System.out.println("Elements of linked list: " + ll);

		// get
		System.out.println(ll.get(0));
		// set
		ll.set(6, "JAVA");
		System.out.println(ll.get(6));
		// removeFirst and removeLast
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Elements of linked list: " + ll);

		// how to print all values of linkedlist
		System.out.println("*********");
		System.out.println("With for loop");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("*********");
		System.out.println("With advanced for loop");
		for (String str : ll) {
			System.out.println(str);
		}
		System.out.println("*********");
		System.out.println("With iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*********");
		System.out.println("With while loop");
		int count = 0;
		while (ll.size() > count) {
			System.out.println(ll.get(count));
			count++;
		}
	}

}
