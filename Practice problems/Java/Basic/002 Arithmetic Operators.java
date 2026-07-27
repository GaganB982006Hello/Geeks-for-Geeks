/*
Given two integer variables x and y. You need to perform the following operations:

p = x + y, Addition
q = x - y, Subtraction
r = x * y, Multiplication
s = x / y, Division
t = x % y, Modulo
Examples:

Input: x = 1, y = 2
Output: 3 -1 2 0 1 
Explanation: The given operations are performed
Input: x = 3, y = 4 
Output: 7 -1 12 0 3 
Explanation: The given operations are performed

  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // code here
        int p = x + y;
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;

        // The below code prints the output
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}
