/*
Given a character ch representing an English alphabet, determine whether it is a vowel or not. Return true if ch is a vowel otherwise return false.

Examples:

Input: ch = 'a'
Output: true
Explanation: 'a' is a vowel. So output for this test case is true.
Input: ch = 'Z'
Output: false
Explanation: 'Z' is not a vowel. So output for this test case is false.
Constraints:
ch is a lowercase or uppercase English letter.
  */

import java.util.Scanner;

class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		// code here
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	    	ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			    System.out.println(true);
		} else {
			System.out.println(false);
		}sc.close();
	} 
}
