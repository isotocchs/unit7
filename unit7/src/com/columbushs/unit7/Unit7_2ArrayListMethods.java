package com.columbushs.unit7;

import java.util.ArrayList;

public class Unit7_2ArrayListMethods {
	
	
	public void arrayMethods() {
		
		//.size returns an int with the number of elements in arraylist
		
		int[] intarray = {3,56,23,45,18};
		
		ArrayList<Integer> a1 =  new ArrayList<Integer>();
		//System.out.println(a1.size());
		
		//.add(x) appends element to the end of the arraylist
		a1.add(24);
		a1.add(267);
		a1.add(15);
		a1.add(456);
		a1.add(789);
		//System.out.println(intarray);
		
		//System.out.println(a1);
		
		//.get(index) gets what's in that specific index in the arraylist
		// if you want to get the very last element you can use a1.get(a1.size()-1)
		
//		for (int i = 0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		//.add(index, x) adds element to the arraylist in specific index position
		// and moves what was already there to the right. 
		// Size and index goes up
		// if you put an index value that is not in the arrayList it gives you an error
		
		a1.add(2,56);
		//a1.add(10,100);
//		for (int i = 0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		
		//.remove(index) removes the element in the array at the index position
		//moves everything after it to the left
		//Size and index goes down
		//to remove last thing you can use ai.remove(ai.size-1)
		a1.remove(1);
		
		a1.remove(a1.size()-1);
//		for (int i = 0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		
		//.set(index, x) replaces element in set position. 
		//Keeps arraylist the same size
		
		a1.set(2, 22);
		
//		for (int i = 0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		//Passsing ArrayList to another method
		//otherMethod(a1);
		//otherMethod1(a1);
		
	}
	
//	public void otherMethod(ArrayList<Integer> arr) {
//		
//		arr.set(2, "Apple");
//		
//		for (int i = 0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
//		
//		
//	}
	
	
	
//	public void otherMethod2(ArrayList<Integer> arr) {
//		
//		arr.set(2, "Apple");
//		
//		for (int i = 0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
//		
//	}
	
	//same concept for returning
	
//	public ArrayList otherMethod3() {
//		ArrayList<Integer> a2 =  new ArrayList<Integer>(10);
//		return a2;
//	}
////	
//	public ArrayList<Integer> otherMethod4() {
//		ArrayList<Integer> a2 =  new ArrayList<Integer>(10);
//		return a2;
//	}

}
