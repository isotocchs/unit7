package com.columbushs.unit7;

import java.util.ArrayList;

public class Unit7Main {

	public static void main(String[] args) {

		//Unit7_1IntroArrayLists introObj = new Unit7_1IntroArrayLists();
		
		
		Unit7_2ArrayListMethods arrayListMethods = new Unit7_2ArrayListMethods();
		//arrayListMethods.arrayMethods();
	
		Unit7_3ArrayListTraversing arrayListTrav = new Unit7_3ArrayListTraversing();
		//arrayListTrav.arrayListTrav();
		
		ArrayList<Integer> arrayListInts =  new ArrayList<Integer>();
		arrayListInts.add(10);
		arrayListInts.add(45);
		arrayListInts.add(3);
		arrayListInts.add(14);
		arrayListInts.add(567);
		arrayListInts.add(345);
		
		ArrayList<String> arrayListStr = new ArrayList<String>();
		arrayListStr.add("Apple");
		arrayListStr.add("Orange");
		arrayListStr.add("Banana");
		arrayListStr.add("Grapes");
		arrayListStr.add("Mango");
		arrayListStr.add("Berry");
		
		Unit7_5Searching searching = new Unit7_5Searching();
		//System.out.println(searching.whereIsTheNumber(3, arrayListInts));
		
		//System.out.println(searching.whereIsTheString("Tom", arrayListStr));
		
		Unit7_6Sorting sorting = new Unit7_6Sorting();
		sorting.sortStuff(arrayListInts);
		
		
		

	}
	

}
