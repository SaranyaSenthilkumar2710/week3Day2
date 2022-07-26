package week3.Day2.Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestInList {
	public static void main(String[] args) {
		// Initialize the list with given numbers
		List<Integer> list = Arrays.asList(3, 2, 11, 4, 6, 7);
		System.out.println("Given Input : " + list);

		//Sort the given list using Collections.sort method which will sort the given list
		Collections.sort(list);
		
		//display the sorted list
		System.out.println("Sorted List :"+list);
		
		
		// getting second largest element from the list which is in the position second last position
		int secondLargestNumber = list.get(list.size() - 2);
		
		// display the result
		System.out.println("Second largest number in List is: "+ secondLargestNumber);
	}
}
