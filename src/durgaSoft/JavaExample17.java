//pankaj
package durgaSoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaExample17 {
	
	public void countDupChars(String str) {
		
		//create a hashmap
		Map<Character, Integer> map = new HashMap<Character, Integer>();//key:Character, Value:Integer
		//char and int are datatypes, but in map we use classes
		//convert the string to character array
		char[] chars= str.toCharArray();
		
		for(Character ch : chars) {
		if(map.containsKey(ch)){
			map.put(ch, map.get(ch) + 1);
		}else {
			map.put(ch, 1);
			}
		}
			Set<Character>	keys =map.keySet();
			for(Character ch : keys) {
				if(map.get(ch) > 1) {
					System.out.println("Char - " + ch + " : " + map.get(ch));
				}
			}
	}

	public static void main(String[] args) {
		JavaExample17 obj = new JavaExample17();
		System.out.println("String: BegginersBook.com");
		obj.countDupChars("BegginersBook.com");
		
		System.out.println("\nString: ChaitanyaSingh");
		obj.countDupChars("ChaitanyaSingh");

	}

}
