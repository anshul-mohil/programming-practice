package com.anshul.interview.strings;

import java.util.ArrayList;

public class PreetyJson {
    public static ArrayList<String> prettyJSON(String jsonString) {
	StringBuilder builder = new StringBuilder();
	 StringBuilder spaces = new StringBuilder();
	 ArrayList<String> al = new ArrayList<>();
	 boolean isBracketSeen = false;
	 
	 for (int i = 0; i < jsonString.length(); i ++) {
		 char c = jsonString.charAt(i);
		 switch (c) {
		 	case '{' :
		 	case '[' :
		 		if(isBracketSeen)
		 			builder.append('\n').append(spaces);
		 		spaces.append('\t');
		 		builder.append(c).append('\n').append(spaces);
		 		isBracketSeen = true;
		 		break;
		 	case ']' :
			case '}' : 
		 		spaces.deleteCharAt(spaces.length()-1);
		 		builder.append('\n').append(spaces).append(c);
		 		break;
		 	case ',':
		 		builder.append(c).append('\n').append(spaces);
		 		break;
		 	default :
		 		builder.append(c);
		 }
	 }
	 int i = 0;
	 String s = builder.toString();
	 s.split("/n");
	System.out.println( s.length());
//	 while(i < builder.length() ){
//		 
//	 }
//	 al.add();
	 return al;
    }
    public String countAndSay(int countTimes) {
		    int currNoCount;
		    char currNumber;
		    StringBuilder currentString = new StringBuilder("1");
		    
		    if (countTimes < 1)
		        return "";
		     if(countTimes == 1)
		     return "1";
		    // because for 1 times its already processed in resultString
		    for (int i = 1; i < countTimes; i++) {
		        
		        int idx = 0;
		        int n = currentString.length();
		     StringBuilder  tempBuffer = new StringBuilder();
		        
		        while (idx < n) {
		            
		            currNumber = currentString.charAt(idx);
		            currNoCount = 1;
		            idx++;
		            
		            while (idx < n && currentString.charAt(idx) == currNumber) {
		                idx++;
		                currNoCount++;
		            }
		            
		            tempBuffer.append(String.valueOf(currNoCount));
		            tempBuffer.append(String.valueOf(currNumber));
		            
		        }
		        
		        currentString = tempBuffer;
		    }
		    return currentString.toString();
	    }
}

