package com.columbushs.unit7;

import java.util.*;

public class Unit7_6Sorting {
	
	public void sortStuff(ArrayList<Integer> arrLis) {
		
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
		
		
	}

}
