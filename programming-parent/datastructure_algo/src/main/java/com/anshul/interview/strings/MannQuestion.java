package com.anshul.interview.strings;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.chainsaw.Main;

class MannQuestions {

	class Atoi {
		// My Solution for revision.
		public int atoi(final String A) {
			// sing = true for the positive number
			int index = 0;
			long num = 0;
			int n = A.length();
			boolean isPositive = true;

			// trimming white spaces before numberString
			while (index < n && A.charAt(index) == ' ')
				index++;

			if (index == n)
				return 0;

			if (A.charAt(index) == '-') {
				isPositive = false;
				index++;
			} else if (A.charAt(index) == '+') {
				index++;
			}

			while (index < n && A.charAt(index) >= '0' && A.charAt(index) <= '9') {

				num = Math.abs(num);
				num = num * 10 + A.charAt(index) - '0';

				if (!isPositive)
					num = -num;

				if (num > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;

				else if (num < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;

				index++;
			}
			return (int) num;
		}
	}

	// My solution for revision.
	class ValidNumber {

		public int isNumber(final String a) {
			String s = a;
			if (s == null || s.trim().length() == 0)
				return 0;

			int seenNum = 0;
			int seenE = 0;
			int seenDecimal = 0;

			s = s.trim();
			for (int i = 0; i < s.length(); ++i) {
				char c = s.charAt(i);

				switch (c) {
				case '.':
					if (seenDecimal == 1 || seenE == 1)
						return 0;
					seenDecimal = 1;
					seenNum = 0;
					break;
				case 'e':
					if (seenE == 1 || seenNum != 1)
						return 0;
					seenE = 1;
					seenNum = 0;
					break;
				case '+':
				case '-':
					if (i != 0 && s.charAt(i - 1) != 'e')
						return 0;
					seenNum = 0;
					break;
				default:
					if (c - '0' < 0 || c - '0' > 9)
						return 0;
					seenNum = 1;
				}

			}

			return seenNum;
		}
	}

	public class ZigZag {
		
		public String convert(String s, int nRows) {

			char[] c = s.toCharArray();
			int len = c.length;
			
			StringBuffer[] sb = new StringBuffer[nRows];
			for (int i = 0; i < sb.length; i++)
				sb[i] = new StringBuffer();

			int inputIndex = 0;
			while (inputIndex < len) {

				// vertically down
				for (int rowIndex = 0; rowIndex < nRows && inputIndex < len; rowIndex++) 
					sb[rowIndex].append(c[inputIndex++]);

				
				// obliquely up
				for (int rowIndex = nRows - 2; rowIndex >= 1 && inputIndex < len; rowIndex--) 
					sb[rowIndex].append(c[inputIndex++]);
			
			}

			
			for (int idx = 1; idx < sb.length; idx++)
				sb[0].append(sb[idx]);
			return sb[0].toString();
		}
		
		// Need to check where it is failing
		public  String convertModified(String s, int nRows) {

			//char[] c = s.toCharArray();
			int len = s.length();
			
			List<StringBuffer> sb = new ArrayList<>(nRows);
			for (int i = 0; i < sb.size(); i++)
				sb.set(i,  new StringBuffer());

			int inputIndex = 0;
			while (inputIndex < len) {

				// vertically down
				for (int rowIndex = 0; rowIndex < nRows && inputIndex < len; rowIndex++) 
					sb.get(rowIndex).append( s.charAt(inputIndex++));

				
				// obliquely up
				for (int rowIndex = nRows - 2; rowIndex >= 1 && inputIndex < len; rowIndex--) 
					sb.get(rowIndex).append(s.charAt(inputIndex++));
			
			}

			for (int idx = 1; idx < sb.size(); idx++)
				sb.get(0).append(sb.get(idx));
			
			return sb.get(0).toString();
		}
	}

}