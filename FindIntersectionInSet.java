package week3.Day2.Assignments;

import java.util.HashSet;

public class FindIntersectionInSet {
	public static void main(String args[]) {
		  //Declaring 2 HashSet 
	      HashSet <Integer> set1 = new HashSet <Integer>();
	      HashSet <Integer> set2 = new HashSet <Integer>();
	      //Add Elements into first set
	      set1.add(3);
	      set1.add(2);
	      set1.add(11);
	      set1.add(4);
	      set1.add(6);
	      set1.add(7);
	      System.out.println("Set1 Elements :"+ set1);
	    //Add Elements into second set
	      set2.add(1);
	      set2.add(2);
	      set2.add(8);
	      set2.add(4);
	      set2.add(9);
	      set2.add(7);
	      System.out.println("Set2 Elements :"+ set2);
	      // use retainAll function which will keep only the intersected elements in set1
	      set1.retainAll(set2);
	      // display the result
	      System.out.println("Intersection Elements : "+ set1);
	   }
}
