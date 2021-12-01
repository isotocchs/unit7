package com.columbushs.unit7;

import java.util.ArrayList;

public class Unit7_5Searching {
	
	public int whereIsTheNumber(int numberLookingFor, ArrayList<Integer> arrayListIn) {
		
		for(int index = 0;index<arrayListIn.size();index++) {
			
			if(arrayListIn.get(index)==numberLookingFor) {
				return index;
			}
		}
		return -1;
	}
	
	public int whereIsTheString(String stringImLookingFor, ArrayList<String> arrayListIn) {
		
		for(int index = 0;index<arrayListIn.size();index++) {
			
			if(arrayListIn.get(index).equals(stringImLookingFor)) {
				return index;
			}
		}
		return -1;
	}
	

}
