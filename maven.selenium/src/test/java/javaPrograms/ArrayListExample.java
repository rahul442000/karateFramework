package javaPrograms;

import java.util.*;

public class ArrayListExample {


	public static void main(String[] args) {
		
		// Declaring ArrayList
		List<String> arrlist = new ArrayList<String>();
		//Adding values in ArrayList
		arrlist.add("a");
		arrlist.add("e");
		arrlist.add("i");
		arrlist.add("o");
		arrlist.add("u");
		
		System.out.println(arrlist);
		
		arrlist.remove(0);
		System.out.println(arrlist);
		
		List<String> arrlist_2 = new ArrayList<String>();
		arrlist_2.add("w");
		arrlist_2.add("r");
		arrlist_2.add("u");
		System.out.println(arrlist_2);
		
		List<String> finallist = new ArrayList<String>();
		finallist.addAll(arrlist);
		System.out.println(finallist);
		finallist.addAll(arrlist_2);
		System.out.println(finallist);
		
		
	}
		
}
