package com.anshul.interview.array;

import java.util.ArrayList;

public class MaxContinuosArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long maxSum = 0, currSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<>();
        ArrayList<Integer> currArray = new ArrayList<>();
        
        for(Integer currElem : A){
            if(currElem < 0){
                currArray = new ArrayList<>();
                currSum = 0;
                continue;
            }
            currSum += currElem;
            currArray.add(currElem);
            
            if(maxSum < currSum || ((maxSum == currSum) && (currArray.size() > maxArray.size()))){
                maxSum = currSum;
                maxArray = currArray;
            }
        }
        return maxArray;
}
}
