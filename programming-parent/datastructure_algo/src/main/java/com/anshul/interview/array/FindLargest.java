package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindLargest {
	// DO NOT MODIFY THE LIST
	public static String largestNumber(final List<Integer> A) {
		List<String> resultString = new ArrayList<String>();
		for (Integer i : A) {
			resultString.add(String.valueOf(i));
		}
	
		System.out.println(resultString.toString());
		Collections.sort(resultString, new DigitComparator());

		StringBuffer strBuf = new StringBuffer();
		
		for (String s : resultString) {
			if ("0".equals(s) && strBuf.length() != 0) {
				continue;
			}
			strBuf.append(s);
		}

		return strBuf.toString();
		// return strs.toString();
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(0);
		list.add(3);
		list.add(30);
		list.add(34);
		list.add(5);
		list.add(9);
		list.add(0);
		list.add(0);
		// {3,30,34,5,9}
	//	System.out.println(list.toString());
		System.out.println(largestNumber(list));
	}
}

class DigitComparator implements Comparator<String> {
	@Override
	public int compare(String string1, String string2) {
		System.out.println("s1   " + string1 + "   s2   " + string2);
		//System.out.println("");
		String first = string1 + string2;
		String second = string2 + string1;
		System.out.println("for string first " + first + "  and second  " + second + "  compareTo returns "
			+ second.compareTo(first));
		// return second.compareTo(first);
		return -first.compareTo(second);
	}
}
