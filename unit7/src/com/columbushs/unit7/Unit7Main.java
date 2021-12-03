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
		//sorting.selectionSort(arrayListInts);
		
		//sorting.insertionSort(arrayListStr);
		
		
		
		
		ArrayList<String> Class = new ArrayList<String>();
		Class.add("Alfonso, Gustavo");
		Class.add("Andretta, Jan");
		Class.add("Arisso, Francisco");
		Class.add("Callejas, Roberto");
		Class.add("Clark, Michael");
		Class.add("Cunat, Javier");
		Class.add("Dickens, Matthew");
		Class.add("Fernandez, Alessandro");
		Class.add("Ferrer, Christopher");
		Class.add("Gonzalez, Erick");
		Class.add("Gonzalez, Samuel");
		Class.add("Kakouris, George");
		Class.add("Martinez, Sebastian");
		Class.add("Quintana, Andrew");
		Class.add("Sedano, Nicolas");
		Class.add("Siman, Omar");
		Class.add("Solorzano, Felipe");
		Class.add("Tonanez, Lucas");
		
		sorting.randomTeams(Class);

	}
	

}
