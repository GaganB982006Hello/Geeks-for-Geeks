/*
Given an integer n. Write a program to print the Right angle triangle wall. The length of perpendicular and base is s. 
Note: Print exactly single " " after "*". Print a new line after printing the triangle.

Example:

Input: n = 4
Output:
* 
* * 
* * * 
* * * * 
Explanation: Length of perpendicular and base of triangle is 4 .
Input: n = 3
Output:
* 
* * 
* * * 
Explanation: Length of perpendicular and base of triangle is 3 .
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i = 0; i < n; i++){
            for(int j = 0;j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
