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
		
		for(int index = 0;index<arrLis.size();index+=3) {
			arrLis.add(index,"//////////////////////");
		}
		for (String names:arrLis) {
			System.out.println(names);
		}
	}
	
	public void shuffleOmar(ArrayList<String> input) {
		ArrayList<String> newList = new ArrayList<String>();
		
		for(int i = 0;i<input.size();i++) {
			
			int rand = (int)(Math.random()*input.size());
			String obj = input.get(rand);
			
			while(obj==null) {
				rand=(int)(Math.random()*input.size());
				obj=input.get(rand);
			}
			newList.add(obj);
			input.set(rand, null);
			
		}
		input=newList;
		
		for(int index = 0;index<input.size();index+=3) {
			newList.add(index,"//////////////////////");
		}
		for (String names:input) {
			System.out.println(names);
		}
	}
	
	public void shuffleFerrer(ArrayList<String> input) {
		int i;
		int y;
		ArrayList<String> List = new ArrayList<String>();
		ArrayList<String> List2 = new ArrayList<String>();
		
		for(i=0;i<input.size();i++) {
			
			List2.add(input.get(i));
		}
		
		for(y=0;y<List2.size();y++) {
			
			int rand = (int)(Math.random()*input.size());
			String temp = input.get(rand);
			List.add(temp);
			input.remove(rand);
		}
		
		for(int index = 0;index<List.size();index+=3) {
			List.add(index,"//////////////////////");
		}
		for (String names:List) {
			System.out.println(names);
		}
	}
	
	public void shufflejan(ArrayList<String> input) {
		
		int size = input.size()-1;
		String holder;
		ArrayList<String> newArray = new ArrayList<String>(size);
		
		for(int i=0;i<input.size();i++) {
			
			newArray.add(null);
		}
		
		for(int outerloop =0;outerloop<size;outerloop++) {
			holder = input.get(outerloop);
			for (int innerloop = 0;innerloop<size;innerloop++) {
				int random = (int)(Math.random()*size);
				if(newArray.get(random)==null) {
					newArray.set(random, holder);
					innerloop=innerloop+size;
				}
				
			}
			
			
		}
		
		
		for(int index = 0;index<newArray.size();index+=3) {
			newArray.add(index,"//////////////////////");
		}
		for (String names:newArray) {
			System.out.println(names);
		}
}
	
	public void shuffleGeorge(ArrayList<String> input) {

		
		for(int i=0;i<input.size();i++) {
			
			String x = input.get(i);
			int y = (int)(Math.random()*input.size());
			String z = input.get(y);
			input.set(y, x);
			input.set(i, z);
			
		}

		
		for(int index = 0;index<input.size();index+=1) {
			input.add(index,"//////////////////////");
		}
		for (String names:input) {
			System.out.println(names);
		}
	
	}
}
