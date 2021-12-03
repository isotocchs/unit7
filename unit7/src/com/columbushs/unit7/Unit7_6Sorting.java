package com.columbushs.unit7;

import java.util.*;

public class Unit7_6Sorting {
	
	public void selectionSort(ArrayList<Integer> arrLis) {
		
		for(int outerLoop = 0;outerLoop<arrLis.size();outerLoop++) {
			int minIndex=outerLoop;
			
			for (int innerLoop = outerLoop+1;innerLoop<arrLis.size();innerLoop++) {
				
				if(arrLis.get(innerLoop).compareTo(arrLis.get(outerLoop))<0) {
					minIndex=innerLoop;
				}
			}
			
			if(minIndex != outerLoop) {
				int holder = arrLis.get(minIndex);
				arrLis.set(minIndex, arrLis.get(outerLoop));
				arrLis.set(outerLoop, holder);
			}
			
		}
		for (Integer ints:arrLis) {
			System.out.println(ints);
		}
		
	}
	
	public void insertionSort(ArrayList<String> arrLis) {
		
		for(int outerLoop = 1;outerLoop<arrLis.size();outerLoop++) {
			String tester = arrLis.get(outerLoop);
			
			int innerLoop = outerLoop-1;
			while(innerLoop>=0 && tester.compareTo(arrLis.get(innerLoop))<0) {
				arrLis.set(innerLoop+1, arrLis.get(innerLoop));
				innerLoop--;	
			}
			arrLis.set(innerLoop+1, tester);
		}
		
		for (String words:arrLis) {
			System.out.println(words);
		}
		
	}
	
	
	
	
	public void randomTeams(ArrayList<String> arrLis) {
		
		Collections.shuffle(arrLis);
		for(int index = 0;index<arrLis.size();index+=4) {
			arrLis.add(index,"//////////////////////");
		}
		for (String names:arrLis) {
			System.out.println(names);
		}
	}
	

}
