
import java.util.ArrayList;
import java.util.List;

public class Unit7Main {

	public static void main(String[] args) {

        System.out.println("------------------");

		Unit7_1IntroArrayLists introObj = new Unit7_1IntroArrayLists();
		
		
		Unit7_2ArrayListMethods arrayListMethods = new Unit7_2ArrayListMethods();
		// arrayListMethods.arrayMethods();
	
		Unit7_3ArrayListTraversing arrayListTrav = new Unit7_3ArrayListTraversing();
		// arrayListTrav.arrayListTrav();
		
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

		Unit7_4ArrayListAlgorithms algo = new Unit7_4ArrayListAlgorithms();
		algo.findMaxArray(null);
		
		// Unit7_5Searching searching = new Unit7_5Searching();
		//System.out.println(searching.whereIsTheNumber(3, arrayListInts));
		
		//System.out.println(searching.whereIsTheString("Tom", arrayListStr));
		
		// Unit7_6Sorting sorting = new Unit7_6Sorting();
		//sorting.selectionSort(arrayListInts);
		
		//sorting.insertionSort(arrayListStr);
		
		
		
		
		ArrayList<String> Class = new ArrayList<String>();
		
		
		
		//System.out.print(Class);
		//sorting.randomTeams(Class);
		
		String str1= "Apple";
		String str2= "Simpl";
		
		//System.out.println(str1.compareTo(str2));
		//System.out.println(str2.compareTo(str1));
		
		// ArrayList<String> reverseAlph = new ArrayList<String>();
		// reverseAlph.add("Killer");
		// reverseAlph.add("App");
		// reverseAlph.add("Time");
		// reverseAlph.add("Go");
		// reverseAlph.add("Fill");
		// reverseAlph.add("Susan");
		// reverseAlph.add("Zeta");
		
		// String worded=null;
		// for (int i=0;i<reverseAlph.size();i++) {
		// 	for(int k=reverseAlph.size()-1;k>i;k--) {
		// 		if (reverseAlph.get(i).compareTo(reverseAlph.get(k))>0)
		// 			worded = reverseAlph.get(i);
		// 		reverseAlph.set(i, reverseAlph.get(k));
		// 		reverseAlph.set(k, worded);
				
		// 	}
		// }
		// System.out.println(reverseAlph);
		
//		List<String> students = new ArrayList<String>();
//		students.add("Alex");
//		students.add("Bob");
//		students.add("Carl");
		
//		String test = animals.remove(2);
//		System.out.println(test);
		
//		for (int k = 0; k<students.size();k++ ) {
//			String test = students.set(k, "Alex");
//			System.out.print(test+" ");
//		}
		
//		System.out.println();
//		
//		for(String str:students) {
//			System.out.print(str+" ");
//		}


System.out.println("------------------");


	}
	

}