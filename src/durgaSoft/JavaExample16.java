//pankaj
//this program is about how to create data structure, how to put data in it, and how to fetch data from it(Array, List, Map)

//array,list,map are type of data structure
//array: how to add value to it, how to fetch data from it, how do you know length of it
//once created  then arrays size can't be changed so it is of fixed length

package durgaSoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaExample16 {

	String array [] = {"a","b"};
	//once created  then arrays size can't be changed so it is of fixed length
	List<String> listName = new ArrayList<String>();
	// with list we can add values and increase size as no need to specify length
	Map<String, String> logMap = new HashMap<String, String>();
	//to store data in key value pair format,no need to specify length,map<String, int> or anything inside <>can be taken
	
	public void testCase1() {
		listName.add("c");
		listName.add("d");
		listName.add("e");
		//array.add is not possible
	
	System.out.println("-------------testCase1 (1st for loop)----------");
	for(int i = 0; i < listName.size(); i++) {
		System.out.println(listName.get(i));
	}
	System.out.println("-------------testCase1 (2nd for loop)----------");
	for(String n1: listName) {
		System.out.println("new for loop: " + n1);
	}
}
	
	public void testCase2() {
		logMap.put("a", "b");//add value
		logMap.put("c", "d");
	
		System.out.println("----------testCase2 (accesing Map using get method)-----------");
		System.out.println(logMap.get("a"));//gives value for keys
		System.out.println(logMap.get("c"));
	}
	
	public void testCase3() {
		logMap.put("a", "e");//overlap value
		logMap.put("c", "f");
		
		System.out.println("---------testCase3 (accessing Map using EntrySet object)-------");
		
		for(Map.Entry<String, String> entry : logMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() +  " Value: " + entry.getValue());
		}
	}
	
	public void testCase4() {
		System.out.println("---------testCase4 (array of string)-------");
		System.out.println("value of array at index 0 :" + array[0]);
		array[0] = "date";
		array[3] = "time";//gives err as size of array is 2 and tried to fit 4th value 
	}
	public static void main(String args[]) {
		JavaExample16 obj = new JavaExample16();
		obj.testCase1();
		obj.testCase2();
		obj.testCase3();
		obj.testCase4();
	}
}
