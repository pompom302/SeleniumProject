//1.Define a string.
//2.Convert the string into lowercase to make the comparison insensitive.
//3.Split the string into words.
//4.Two loops will be used to find duplicate words. Outer loop will select a word and Initialize variable count to 1. Inner loop will compare the word selected by outer loop with rest of the words.
//5.If a match found, then increment the count by 1 and set the duplicates of word to '0' to avoid counting it again.
//6.After the inner loop, if count of a word is greater than 1 which signifies that the word has duplicates in the string.

package BasicJavaScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWorsInString {

	//Payal wears Payal and Payal suits Payal
	//Payal : 4 times
	
	public static void dupWords(String str) {
		
		//split:
		String words[] = str.split(" "); //Splits this string around matches of the given regular expression. It returns an array
		
		//create a hashmap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
	
		//to chck each word in given array
		for(String word : words) {
			//if word is present already in the words aray
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word,1);
		}
	}		
		//extracting all keys of map wordCount:
		Set<String> wordsInString = wordCount.keySet();
		
		//loop through all the words in wordCount to find repititive words
		for(String word : wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " occurs " + wordCount.get(word) + " times.");
			}
		
	} 
}

	
	public static void main(String[] args) {
		
		dupWords("and Payal wears Payal and Payal suits Payal");
		dupWords("hi hi Hi hi man");
		dupWords("100 5 100 55 200 3 40 200 5");
	}

}
