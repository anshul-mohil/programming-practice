package com.anshul.interview.binance;

public class SwapFirstLastCharacters {
	public static String count(String str) {
		// Create an equivalent char array
		// of given string
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			// k stores index of first character
			// and i is going to store index of last
			// character.
			int k = i;
			while (i < ch.length && ch[i] != ' ')
				i++;

			// Swapping
			char temp = ch[k];
			ch[k] = ch[i - 1];
			ch[i - 1] = temp;

			// We assume that there is only one space
			// between two words.
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "geeks for geeks";
		String str2 = "Hello World";
		System.out.println(replace(str2));
	}
//	def reverse_words(self, inp_str):
//        inp_list = inp_str.split(' ')
//        i = 0 
//        j = len(inp_list) - 1 
//        while i < j:
//            temp = inp_list[i]
//            inp_list[i] = inp_list[j]
//            inp_list[j] = temp
//            i += 1
//            j -= 1
//        return ' '.join(inp_list)
	public static String replace(String str) {
		String[] arr = str.split(" ");
		int i = 0;
		int j = arr.length -1;
		while(i < j) {
			String temp = arr[i];
			arr[i] =  arr[j];
			arr[j] = temp;
			i += 1;
			j -= 1;
		}
		String finalString = "";
		int j2 = 0;
		for (; j2 < arr.length-1; j2++) {
			finalString += arr[j2];
			finalString += " ";
		}
		finalString +=arr[j2];
		return finalString;
				
	}

}
