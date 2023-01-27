
import java.rmi.Remote;
import java.util.*;

public class Unit7_6Sorting {
	
	public void selectionSort(ArrayList<Integer> arrLis) {
		
		for(int outerLoopIndex = 0;outerLoopIndex<arrLis.size();outerLoopIndex++) {
			int minIndex=outerLoopIndex;
			
			for (int innerLoopIndex = outerLoopIndex+1;innerLoopIndex<arrLis.size();innerLoopIndex++) {
				
				if(arrLis.get(innerLoopIndex).compareTo(arrLis.get(outerLoopIndex))<0) {
						minIndex=innerLoopIndex;
						if(minIndex != outerLoopIndex) {
							int holder = arrLis.get(minIndex);
							arrLis.set(minIndex, arrLis.get(outerLoopIndex));
							arrLis.set(outerLoopIndex, holder);
						}
				}
			}
			
		}
		// Integer a = 5;
		// Integer b = 6;
		//System.out.println(b.compareTo(a)); // = 1
		//System.out.println(a.compareTo(a)); // = 0
		//System.out.println(a.compareTo(b)); // = -1

		for (Integer ints:arrLis) {
			System.out.println(ints);
		}
		
	}
	
	public void insertionSort(ArrayList<Integer> arrLis) {
		
		for(int outerLoop = 1;outerLoop<arrLis.size();outerLoop++) {
			Integer tester = arrLis.get(outerLoop);
			
			int innerLoop = outerLoop-1;
			while(innerLoop>=0 && tester.compareTo(arrLis.get(innerLoop))<0) {
				arrLis.set(innerLoop+1, arrLis.get(innerLoop));
				innerLoop--;	
			}
			arrLis.set(innerLoop+1, tester);
		}
		
		for (Integer words:arrLis) {
			System.out.println(words);
		}
		
	}
	
	
	
	
	public void randomTeamsP6(ArrayList<String> arrLis) {
		
		int index = 0;
		// ArrayList<String> arrayList2 = new ArrayList<String>();
		// arrayList2 = arrLis;

		while(index<arrLis.size()){

			if(Math.random()<Math.random()){
				if(index<arrLis.size()-2){
					String a = arrLis.get(index+1);
					arrLis.set(index+1, arrLis.get(index));
					arrLis.set(index, a);
				} else if(index==arrLis.size()-1) {
					String a = arrLis.get(0);
					arrLis.set(index+1, arrLis.get(index));
					arrLis.set(index, a);
				}
			}
			
			// arrLis.set(index, arrLis.remove((int)(Math.random()*arrLis.size())));
			
			
			
			index++;
		}

		for (String words:arrLis) {
			System.out.println(words);
		}







	}


	public void randomTeamsP5 (ArrayList<String> arrLis){
		
		ArrayList<String> newArrayList = new ArrayList<String>();
		final int end = arrLis.size();

		for(int index = 0;index<end;index++){
			int selection = (int)(Math.random() * arrLis.size());
			newArrayList.add(arrLis.get(selection));
			arrLis.remove(selection);
			
		}
		for(int index = 0;index<newArrayList.size();index+=3) {
			newArrayList.add(index,"//////////////////////");
	}
		for (String words:newArrayList) {
			System.out.println(words);
		}
		

	}


		
// 		Collections.shuffle(arrLis);
		
// 		for(int index = 0;index<arrLis.size();index+=4) {
// 			arrLis.add(index,"//////////////////////");
// 		}
// 		for (String names:arrLis) {
// 			System.out.println(names);
// 		}
// 	}
	
// 	public void shuffleOmar(ArrayList<String> input) {
// 		ArrayList<String> newList = new ArrayList<String>();
		
// 		for(int i = 0;i<input.size();i++) {
			
// 			int rand = (int)(Math.random()*input.size());
// 			String obj = input.get(rand);
			
// 			while(obj==null) {
// 				rand=(int)(Math.random()*input.size());
// 				obj=input.get(rand);
// 			}
// 			newList.add(obj);
// 			input.set(rand, null);
			
// 		}
// 		input=newList;
		
// 		for(int index = 0;index<input.size();index+=3) {
// 			newList.add(index,"//////////////////////");
// 		}
// 		for (String names:input) {
// 			System.out.println(names);
// 		}
// 	}
	
// 	public void shuffleFerrer(ArrayList<String> input) {
// 		int i;
// 		int y;
// 		ArrayList<String> List = new ArrayList<String>();
// 		ArrayList<String> List2 = new ArrayList<String>();
		
// 		for(i=0;i<input.size();i++) {
			
// 			List2.add(input.get(i));
// 		}
		
// 		for(y=0;y<List2.size();y++) {
			
// 			int rand = (int)(Math.random()*input.size());
// 			String temp = input.get(rand);
// 			List.add(temp);
// 			input.remove(rand);
// 		}
		
// 		for(int index = 0;index<List.size();index+=3) {
// 			List.add(index,"//////////////////////");
// 		}
// 		for (String names:List) {
// 			System.out.println(names);
// 		}
// 	}
	
// 	public void shufflejan(ArrayList<String> input) {
		
// 		int size = input.size()-1;
// 		String holder;
// 		ArrayList<String> newArray = new ArrayList<String>(size);
		
// 		for(int i=0;i<input.size();i++) {
			
// 			newArray.add(null);
// 		}
		
// 		for(int outerloop =0;outerloop<size;outerloop++) {
// 			holder = input.get(outerloop);
// 			for (int innerloop = 0;innerloop<size;innerloop++) {
// 				int random = (int)(Math.random()*size);
// 				if(newArray.get(random)==null) {
// 					newArray.set(random, holder);
// 					innerloop=innerloop+size;
// 				}
				
// 			}
			
			
// 		}
		
		
// 		for(int index = 0;index<newArray.size();index+=3) {
// 			newArray.add(index,"//////////////////////");
// 		}
// 		for (String names:newArray) {
// 			System.out.println(names);
// 		}
// }
	
// 	public void shuffleGeorge(ArrayList<String> input) {

		
// 		for(int i=0;i<input.size();i++) {
			
// 			String x = input.get(i);
// 			int y = (int)(Math.random()*input.size());
// 			String z = input.get(y);
// 			input.set(y, x);
// 			input.set(i, z);
			
// 		}

		
// 		for(int index = 0;index<input.size();index+=1) {
// 			input.add(index,"//////////////////////");
// 		}
// 		for (String names:input) {
// 			System.out.println(names);
// 		}
	
// 	}
}
