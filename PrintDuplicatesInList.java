package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInList {
	public static void main(String[] args) {
		//Declare 2 Integer arrayLists
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> myNewList = new ArrayList<Integer>();

		//add elements into the list
		myList.add(14);
		myList.add(12);
		myList.add(13);
		myList.add(11);
		myList.add(15);
		myList.add(14);
		myList.add(18);
		myList.add(16);
		myList.add(17);
		myList.add(19);
		myList.add(18);
		myList.add(17);
		myList.add(20);

		//Iterates thru mylist and check the adjacent elements
		for(int i=0;i<=myList.size();i++) {
			for(int j=i+1;j<=myList.size()-1;j++) {
				//check if the elements are equal put the duplicates into another list 
				if(myList.get(i).equals(myList.get(j))) {
					myNewList.add(myList.get(i));
				}
			}
		}
		//print the result
		System.out.println("Given List :" );
		System.out.println(myList);
		System.out.println("Duplicates in the List :" );
		System.out.println(myNewList);
	}
}
