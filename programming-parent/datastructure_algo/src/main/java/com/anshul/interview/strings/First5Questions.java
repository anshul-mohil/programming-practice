package com.anshul.interview.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class First5Questions {
	public static String reverseWords(String a) {
		Stack<String> A = new Stack<String>();
		String[] words = a.split(" ");
		String res = "";
		if (words.length == 0) {
			return "";
		}
		if (words.length == 1) {
			return a;
		}
		int size = words.length;
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		for (int i = 0; i < size; i++) {
			words[i].replaceAll("\\s+", "");
			A.push(words[i]);
		}
		while (!A.isEmpty()) {
			res = res + " " + A.pop();
		}
		return res.substring(1, res.length());
	}
	// IX --> second > first --> I(1) will be now -ve and will deduct
	// from anything next coming.
	// XI --> second(I) is smaller then just add with X(10s)
	public static int romanToInt(String inputStr) {

		String roman = "IVXLCDM";
		int romanInteger[] = { 1, 5, 10, 50, 100, 500, 1000 };
		
		char first, second;
		int sum = 0, i;
		
		for (i = 0; i < inputStr.length() - 1; i++) {
			first = inputStr.charAt(i);
			second = inputStr.charAt(i + 1);

			if (roman.indexOf(second) <= roman.indexOf(first))
				sum = sum + romanInteger[roman.indexOf(first)];
			else
				sum -= romanInteger[roman.indexOf(first)];
		}
		
		sum = sum + romanInteger[roman.indexOf(inputStr.charAt(i))];
		return sum;
	}

	public String intToRoman(int num) {
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		
		return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}

	// My solution for revision.
	// https://leetcode.com/problems/restore-ip-addresses/discuss/30949
	public static List<String> restoreIpAddresses(String s) {
		List<String> res = new ArrayList<String>();
		int len = s.length();
		for (int i = 1; i <= 3 && i <= len - 3; i++) {
			for (int j = i + 1; j <= i + 3 && j <= len - 2; j++) {
				for (int k = j + 1; k <= j + 3 && k <= len - 1; k++) {
					String s1 = s.substring(0, i), s2 = s.substring(i, j), s3 = s.substring(j, k),
							s4 = s.substring(k, len);
					if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
						res.add(s1 + "." + s2 + "." + s3 + "." + s4);
					}
				}
			}
		}
		return res;
	}

	public static boolean isValid(String s) {
		// if ( s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' &&
		// s.length() > 1) || Integer.parseInt(s) > 255)
		if (s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
			return false;

		return true;
	}

	/**
	 * Implement strStr() ie. nothing but implementing indexOf() method.
	 * Not for revision.
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(final String haystack, final String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}

	/**
	 * My Solution for revision.
	 * 
	 * @param string
	 * @param subString
	 * @return
	 */
	// This is a comment section version of the same leetcode solution

	// abccd mai cd will be search only till 5-2 length tak ie. 3 index tak as 3
	// is inclusive for the search
	// agar 3 index tak bhi nahi mila to rest of the string can not accomodate
	// the needle
	// s.length() - t.length() times the outer loop will run
	public static int strStr_2(String string, String subString) {

		if (string.isEmpty() || subString.isEmpty())
			return -1;
		for (int i = 0; i <= string.length() - subString.length(); i++) {
			for (int j = 0; j < subString.length(); j++) {
				if (string.charAt(i + j) != subString.charAt(j))
					break;
				// if above is passed that means all the needle chars are
				// available in string
				if (j == subString.length() - 1)
					return i;
			}
		}
		return -1;
	}

	// My Solution for revision.
	public static int compareVersion(String version1, String version2) {
		String[] levels1 = version1.split("\\.");
		String[] levels2 = version2.split("\\.");

		int length = Math.max(levels1.length, levels2.length);
		for (int i = 0; i < length; i++) {
			Long v1 = i < levels1.length ? Long.parseLong(levels1[i]) : 0;
			Long v2 = i < levels2.length ? Long.parseLong(levels2[i]) : 0;
			int compare = v1.compareTo(v2);
			if (compare != 0) {
				return compare;
			}
		}

		return 0;
	}

	public int lengthOfLastWord(final String a) {
		String[] x = a.split(" ");
		if (x.length == 0)
			return 0;
		else
			return x[x.length - 1].length();
	}

	/**
	 * My Solution for revision
	 *  48 is the ASCII VALUE for 0 and add 1 onwards
	 * @param binary1
	 * @param binary2
	 * @return
	 */
	public static String addBinary(String binary1, String binary2) {
		StringBuilder sb = new StringBuilder();
	
		int i = binary1.length() - 1, j = binary2.length() - 1, carry = 0;
		
		while (i >= 0 || j >= 0) {
			
			int sum = carry;
			
			if (j >= 0)
				sum += Integer.valueOf(binary2.charAt(j--))-48 ;
			if (i >= 0)
				sum += Integer.valueOf(binary1.charAt(i--))-48 ;
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}
	
	public static String multiply(String num1, String num2) {
	    int m = num1.length(), n = num2.length();
	    int[] pos = new int[m + n];
	   
	    for(int i = m - 1; i >= 0; i--) {
	        for(int j = n - 1; j >= 0; j--) {
	            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
	            int p1 = i + j, p2 = i + j + 1;
	            int sum = mul + pos[p2];

	            pos[p1] += sum / 10;
	            pos[p2] = (sum) % 10;
	        }
	    }  
	    
	    StringBuilder sb = new StringBuilder();
	    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
	    return sb.length() == 0 ? "0" : sb.toString();
	}
	
	
	public static void main(String[] args) {

//		String s1 = "1111";
//		String s2 = "11111";
		
	//	System.out.println(addBinary(s1, s2));
		
		String s1 = "123";
		String s2 = "45";
		String result  = multiply(s1, s2);
		System.out.println(result);
		System.out.println(45/10);
		// String s2 = "11114";
		// List<String> ipAddress = restoreIpAddresses(s2);
		// for (String string : ipAddress) {
		// System.out.println(string);
		// }
		int val = compareVersion("1.0", "1");
		// int val = compareVersion("4444444444444444444444444",
		// "444444444444444444444444");
		System.out.println(val);
		// String s = "fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz
		// qfho dqmy sn myq igjgip iwfcqq";
		// System.out.println(reverseWords(s));
		//
		// String s1 = "XIX";
		// System.out.println(romanToInt(s1));
	}

}
