
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

	public String whereIsTheNumberNew(int numberLookingFor, ArrayList<Integer> arrayListIn){
		ArrayList<Integer> indexOfFound = new ArrayList<Integer>();
		String toBeReturned = "";
		for(int index = 0;index<arrayListIn.size();index++) {
			if(arrayListIn.get(index)==numberLookingFor) {
				indexOfFound.add(index);
			}
		}
		if(indexOfFound.size()==1){
			toBeReturned = "The number is in index: "+indexOfFound.get(0);
			return toBeReturned;
		}
		if (indexOfFound.size()>1){
			toBeReturned = "The number is in index: "+indexOfFound.get(0);
			for(int index = 1;index<indexOfFound.size();index++){
				toBeReturned += " and "+indexOfFound.get(index);
			}
			return toBeReturned;
		}
		toBeReturned = "The number is not in the arrayList";
		return toBeReturned;

	}
	String rets1 = "The number is in index: 2";
	String rets2 = "The number is in index: 2 and 4 and 5 and 8 and 9";
	String rets3 = "The number is not in the arrayList";
	
	public int whereIsTheString(String stringImLookingFor, ArrayList<String> arrayListIn) {
		
		for(int index = 0;index<arrayListIn.size();index++) {
			
			if(arrayListIn.get(index).equals(stringImLookingFor)) {
				return index;
			}
		}
		return -1;
	}
	

}
