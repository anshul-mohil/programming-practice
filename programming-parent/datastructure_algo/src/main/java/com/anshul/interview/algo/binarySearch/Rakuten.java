package com.anshul.interview.algo.binarySearch;

import com.anshul.interview.array.CodeCopyPaste;

import java.util.Arrays;

public class Rakuten {

//public int solution(int[] array){
//
//if(array.length == 1)
//  return -2;
//
//Arrays.sort(array);
//
//long minimumDistance = Long.MAX_VALUE;
//
//for(int i = 1; i < array.length; i++){
//  long distance = (long) array[i] - array[i-1];
//  if(distance < minimumDistance)
//    minimumDistance = distance;
//}
//
//return minimumDistance > 10000000 ? -1 : (int) minimumDistance;
//}

  public static int Solution(int[] a) {
    if (a.length == 0 || a.length == 1) {
      return 0;
    }

    //need to sort the values in order to compute adjacent distances
    Arrays.sort(a);

    //previous different value
    int prev = a[0];

    //count of current value
    int currentCount = 1;

    //count of previous seen value
    int previousCount = 0;

    int result = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] == prev) {
        currentCount++;

        //pair current value with all previous equal values
        //plus all values equal to the current one, eg: 1 1 1 2 2(current)
        result += previousCount + currentCount - 1;
      } else {
        //a new value, pair it with all previous equal values
        result += currentCount;
        previousCount = currentCount;
        currentCount = 1;
      }
      prev = a[i];
    }
    return result;
  }

  public static void main(String[] args) {
  int A[] = {1,4,7,3,3,5};
    System.out.println(Solution(A));
  }




}
