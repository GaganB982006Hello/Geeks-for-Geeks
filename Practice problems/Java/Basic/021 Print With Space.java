/*
Given two inputs that are store in variables a and b, you need to print a and b in a single line with a space separating them.
Add new line after printing with space.

Example :

Input: a = "Hello", b = "World"
Output: Hello World
Explanation: a and b are printed in a single line and a space separates them.
  */

public class Solution {
    public void utility(Scanner scn) {
        // code here
        String a = scn.next();
        String b = scn.next();
        System.out.println(a + " " + b);
    }
}
