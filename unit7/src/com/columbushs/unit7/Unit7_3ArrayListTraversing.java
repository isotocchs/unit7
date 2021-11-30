package com.columbushs.unit7;

import java.util.ArrayList;

public class Unit7_3ArrayListTraversing {
	
	public void arrayListTrav() {
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Apple");
		stringArrayList.add("Orange");
		stringArrayList.add("Banana");
		stringArrayList.add("Grapes");
		stringArrayList.add("Mango");
		stringArrayList.add("Berry");
		
		int i=0;
		while (i<stringArrayList.size()) {
			
			System.out.println(stringArrayList.get(i));
			//can use string methods
			//System.out.println(stringArrayList.get(i).length());
			i++;
		}
		
		for (String fruits:stringArrayList) {
			
			System.out.println(fruits);
				
		}
		
	}

}
