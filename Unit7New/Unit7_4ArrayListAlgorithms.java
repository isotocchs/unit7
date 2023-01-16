
import java.util.ArrayList;

public class Unit7_4ArrayListAlgorithms {
	
	public double findMaxArray(double [] arrayIn) {
		
		double maxValue = arrayIn[0];
		
		for (int i=1;i<arrayIn.length;i++) {
			
			if(arrayIn[i]>maxValue) {
				maxValue = arrayIn[i];
			}	
		}		
		return maxValue;
	}
	
	private double findMaxArrayList(ArrayList<Double> arrayListName) {
		
		double max = arrayListName.get(0);
		
		for(int index = 1; index<arrayListName.size();index++) {
			
			if(arrayListName.get(index)>max) {
				max=arrayListName.get(index);				
			}
		}
		
		return max;
		
	}
	
	
	public double findMinArray(double [] arrayIn) {
		
		double minValue = Double.MAX_VALUE;
		
		for (double currentValue:arrayIn) {
			
			if(currentValue<minValue) {
				
				minValue = currentValue;
			}
		}
		return minValue;
	}
	
	public double findMinArrayList(ArrayList<Double> arrayListIn) {
		
		double minValue = Double.MAX_VALUE;
		
		for (double currentValue:arrayListIn) {
			
			if(currentValue<minValue) {
				
				minValue = currentValue;
			}
		}
		return minValue;
	}
	
	

}
