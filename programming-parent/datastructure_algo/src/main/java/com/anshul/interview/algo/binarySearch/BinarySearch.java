package com.anshul.interview.algo.binarySearch;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static int findFirst(final List<Integer> list, int findElement, int low, int high) {

		if(high >=low){
			int mid = (low + high) / 2;
			// if you find the element either at the index 0
			// mid == 0 is the corner case when while searching you are at 0th
			// index and searching for the
			// start element index, at that time you should not peek on -1
			// location on given list
			 if( ( mid == 0 || findElement > list.get(mid-1) )&& list.get(mid) == findElement)
				return mid;
			 else if (findElement > list.get(mid))
					return findFirst(list, (mid + 1), high, findElement);
				else
					return findFirst(list, low, (mid - 1), findElement);
		}
		// no element found
		return -1;
	}

	public static int findLast(final List<Integer> list, int findElement, int low, int high) {

		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;
			if ((mid == list.size()-1 || findElement < list.get(mid + 1)) && list.get(mid) == findElement)
				return mid;
			else if (findElement < list.get(mid))
				return findLast(list, low, (mid - 1), findElement);
			else
				return findLast(list, (mid + 1), high, findElement);
				
		}
		// no element found
		return -1;
	}

	public static int findCount(final List<Integer> list, int findElement) {

		if (list == null)
			return 0;
		int leftIndex = findFirst(list, findElement, 0, list.size() - 1);
		System.out.println(leftIndex);
		int rightIndex = findLast(list, findElement, leftIndex, list.size() - 1);
		System.out.println(rightIndex);
		return (rightIndex - leftIndex) + 1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 2, 3, 3, 3, 3 };
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);

		// Element to be counted in arr[]
		int x = 1;

		int c = findCount(list, x);
		System.out.println(x + " occurs " + c + " times");
	}
}
