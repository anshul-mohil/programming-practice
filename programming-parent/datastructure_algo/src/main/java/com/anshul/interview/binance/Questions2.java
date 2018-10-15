package com.anshul.interview.binance;

public class Questions2 {
//	def dashes(self, input_str):
//        dash_dict = { 
//            0: 6,
//            1: 2,
//            2: 5,
//            3: 5,
//            4: 4,
//            5: 5,
//            6: 6,
//            7: 4,
//            8: 7,
//            9: 6,
//        }   
//        result = 0 
//        for char in input_str:
//            result += dash_dict[int(char)]
//        return result
	
	
	
		public static int dashes(String str) {
			int[] value = new int[] {6,2,5,5,4,5,6,4,7,6} ;
			
			str.trim();
			int result = 0;
			char[] arr = str.toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				
				result += value[arr[i]-48];
			}
			return result;
		}
		public static void main(String[] args) {
			String str = "0";
			System.out.println(dashes(str));
			
		}
	
}
