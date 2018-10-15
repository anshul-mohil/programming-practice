package com.anshul.interview.asked;



import java.util.Arrays;

public class AdjacentMaxDistance {
	
	public static int distance(int A[]){
		int absVal = 0;
		int maxAbs = 0;
		
		int[] A1  = A;
		Arrays.sort(A1);
		
		for(int i = 0; i < A.length; i++){
			for(int j = i+1 ; j < A.length; j++){
				if(areAdjacent(A, A1, i, j)){
					absVal = Math.abs(A[i]-A[j]);
					
					if(absVal > maxAbs){
						maxAbs = absVal;
					}
				}
			}
		}
		
		return maxAbs;
		
	}
	
	private static boolean areAdjacent(int[] A, int[] A1, int i, int j){
		int val1, val2;
		int minVal, maxVal;
		
		val1 = A[i];
		val2 = A[j];
		
		if(val1 ==val2){
			return false;
		}
		
		i = Arrays.asList(A).indexOf(val1);
		j = Arrays.asList(A1).indexOf(val2);
		
		minVal = Math.min(i, j);
		maxVal = Math.max(i, j);
		
		for(int k = minVal+1; k < maxVal; k++){
			if((A1[k]!=val1) && A1[k]!=val2){
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args) {
		int A[] =  {1, 4, 7, 3, 3, 5};
		System.out.println(distance(A));
	}

}
