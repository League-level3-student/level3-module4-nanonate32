package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	//count the number of closing brackets
	//count the number of opening brackets 
	//check if counts are the same
    public static boolean doBracketsMatch(String b) {
   	int closeCount = 0;
    	int openCount = 0;
//    
           Stack<Character> brackets = new Stack<Character>();
           
            
            for(int i = 0; i < b.length(); i++) {
            	brackets.add(b.charAt(i));
            	if(b.charAt(i) == '{') {
            		openCount++;
            	}
                if(b.charAt(i) == '}') {
                	closeCount++;
                }
                if(closeCount > openCount) {
                	return false;
                }
            }
            if(openCount == closeCount) {
            	return true;
            }
    	
        return false;
    }
}