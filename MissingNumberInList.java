package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumberInList {
	public static void main(String[] args) {
		// Initialize Interger List
		List<Integer> myList = new ArrayList<Integer>();
		//adding elements to the list
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(6);
		myList.add(8);
		myList.add(9);
		// Print the given List elements 
		System.out.print("\nGiven Numbers in the List: \n");
		System.out.println(myList);

		// sort the list using Collections.sort
		Collections.sort(myList);

		//initializing the temp value
		int temp = 1;
		System.out.println("Missing numbers  : "); 

		//Iterating the list
		for(int i = 0; i < myList.size(); i++)
		{
			// check the current value of list and temp are same
			if (myList.get(i) != temp) {
				//iterating the list and print the missing elements
				for (int j = temp; j < myList.get(i); j++) {
					System.out.println(j);
				}
			}
			temp = myList.get(i) + 1;
		}
	}
}
