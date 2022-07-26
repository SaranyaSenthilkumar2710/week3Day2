package week3.Day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInListSet {
	public static void main(String[] args) {
		// Given String with duplicate values
		String sentence = "We learn java in week3 in java We learn";
		System.out.println("Original Input with duplicates:");
		System.out.println(sentence);
		
		//Splitting and adding each input string into input array 
		String[] strArray = sentence.split(" ");
		
		//Initializing a LinkedHashSet to remove the duplicates
		Set<String> mySet = new LinkedHashSet<String>();
		
		//Iterates thru array and add into set
		for(String temp:strArray) {
			mySet.add(temp);
		}
		//Print the result after removing the duplicates
		System.out.println("\nResult after removing duplicates:");
		System.out.println(mySet);
	}

	
}
