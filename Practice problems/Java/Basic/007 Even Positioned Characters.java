/*
You are given a String S, you need to print its characters at even indices(index starts at 0).

Examples:

Input: s = "Geeks"
Output: Ges
Explanation: The even indices (0, 2 & 4) characters are printed.
Input: s = "DoctorPhenomenal"
Output: DcoPeoea
Explanation: The even indices characters are printed.
  */

import java.util.*;
class Solution {
    public static void utility(String s) {
        // code here
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                System.out.print(s.charAt(i));
            }
        }
    }
}
