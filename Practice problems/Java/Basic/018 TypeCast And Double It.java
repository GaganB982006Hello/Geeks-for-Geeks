/*

Given an input num as a string. You need to typecast into an integer and double it. 

Examples:

Input: num = "5"
Output: 10
Explanation: Typecast "5" to int and then double it 5 * 2 = 10
Input: num = "12"
Output: 24
Explanation: Typecast "12" to int and then double it 12 * 2 = 24
Constraints:
0 <= num <= 105
  */

import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int a = Integer.parseInt(num);
        System.out.println(a * 2);
    }
}
