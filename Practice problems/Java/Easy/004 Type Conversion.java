/*
Given a double value d, typecast it to an integer value and print it.

Example:

Input: d = 10.23
Output: 10
Explanation: The integer value of 10.23 is 10
Input: d = 19.1
Output: 19
  */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        // code here
        System.out.print((int) d);
    }
}
