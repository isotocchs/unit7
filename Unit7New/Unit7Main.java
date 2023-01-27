
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
		arrayListInts.add(3);
		arrayListInts.add(45);
		arrayListInts.add(3);
		arrayListInts.add(14);
		arrayListInts.add(567);
		arrayListInts.add(3);
		arrayListInts.add(345);
		arrayListInts.add(3);
		
		
		ArrayList<String> arrayListStr = new ArrayList<String>();
		arrayListStr.add("Apple");
		arrayListStr.add("Orange");
		arrayListStr.add("Banana");
		arrayListStr.add("Grapes");
		arrayListStr.add("Mango");
		arrayListStr.add("Berry");

		ArrayList<Double> arrayDoubles = new ArrayList<Double>();
		arrayDoubles.add(1.3);
		arrayDoubles.add(2.5);
		arrayDoubles.add(6.9);
		arrayDoubles.add(4.2);
		arrayDoubles.add(17.3);
		arrayDoubles.add(5.2);
		arrayDoubles.add(8.8);
		arrayDoubles.add(8.9);
		arrayDoubles.add(80.08);

		// Integer a = 5;
		// Integer b = 6;
		// System.out.println(b.compareTo(a)); // = 1
		// System.out.println(a.compareTo(a)); // = 0
		// System.out.println(a.compareTo(b)); // = -1

		Unit7_4ArrayListAlgorithms algo = new Unit7_4ArrayListAlgorithms();
		// System.out.println(algo.findMinArrayList(arrayDoubles));
		// System.out.println(Double.MAX_VALUE);

		Unit7_5Searching searching = new Unit7_5Searching();
		// System.out.println(searching.whereIsTheNumberNew(345, arrayListInts));
		
		//System.out.println(searching.whereIsTheString("Tom", arrayListStr));
		

		Unit7_6Sorting sorting = new Unit7_6Sorting();
		
		
		ArrayList<Integer> arrayListInts2 =  new ArrayList<Integer>();
		arrayListInts2.add(7);
		arrayListInts2.add(8);
		arrayListInts2.add(12);
		arrayListInts2.add(6);
		arrayListInts2.add(9);
		arrayListInts2.add(4);
		
		
		// sorting.selectionSort(arrayListInts2);
		
		// sorting.insertionSort(arrayListInts2);
		
		
		
		
		ArrayList<String> ClassP6 = new ArrayList<String>();
		ClassP6.add("Sebastian Anadon");
		ClassP6.add("Ryan Dress");
		ClassP6.add("Gabriel Merheb");
		ClassP6.add("Alejandro Paniagua");
		ClassP6.add("Samuel Polo-Varona");
		ClassP6.add("Felipe Sanchez-Noguera");
		ClassP6.add("Mario Villaverde");
		ClassP6.add("Michael Smith");

		sorting.randomTeamsP5(ClassP6);
		

		ArrayList<String> ClassP5 = new ArrayList<String>();
		ClassP5.add("Alfonso Caram");
		ClassP5.add("Kevin Duran");
		ClassP5.add("Daniel Khoury");
		ClassP5.add("Carlos Oses");
		ClassP5.add("Anthony Perez");
		ClassP5.add("Luis Uribe");
		ClassP5.add("Nicholas Acosta");
		ClassP5.add("Rocco Di Matteo");

		// sorting.randomTeamsP5(ClassP5);
		
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