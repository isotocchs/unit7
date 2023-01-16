
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
		
		ArrayList<Integer> a1 =  new ArrayList<Integer>();
		a1.add(24);
		a1.add(267);
		a1.add(15);
		a1.add(456);
		a1.add(789);
		a1.add(45);
		// a1.add("Berry");
		a1.add(new Integer(3));
		a1.add(3);

		int x = a1.remove(4);
		System.out.println(x);
		System.out.println(a1.set(2,67));
		System.out.println(a1.add(12));
		System.out.println(a1);
		stringArrayList.remove("Apple");
		System.out.println(stringArrayList);





		// System.out.println(a1.get(3));
		// System.out.println(a1.get(3).intValue());

		// int x = a1.get(2) + a1.get(3);





		// System.out.println(a1);
		
		// int i=0;
		// while (i<stringArrayList.size()) {
			
		// 	System.out.println(stringArrayList.get(i).substring(stringArrayList.get(i).length()-1));
		// 	// stringArrayList.set(i, stringArrayList.get(i).substring(3));

		// 	// System.out.println(stringArrayList.get(i).length());
		// 	//can use string methods
		// 	i++;
		// }

		// System.out.println(stringArrayList);








		// int sum = 0;
		// for(int i=0;i<a1.size();i++){
		// 	if(a1.get(i) > 200){
		// 		a1.remove(i);
		// 	}
		// 	System.out.println(a1.get(i));

		// 	sum += a1.get(i);

		// }
		// System.out.println(sum);



		// for (Integer fruits:a1) {
			
		// 	// System.out.println(fruits);
		// 	a1.set(2, fruits);
		// 	System.out.println(fruits);

		// 	System.out.println(a1);

				
		// }






		
	}

}
