/*
Given an integer n. Write a program to print the Right angle triangle. The length of the perpendicular and base is n.  

Examples :

Input: n = 9
Output:
*
* *
*   *
*     *
*       *
*         *
*           *
*             *
* * * * * * * * * 
Explanation: Length of perpendicular and base of triangle is 9.
Input: n = 4
Output:
*
* *
*   *
* * * *
Explanation: Length of perpendicular and base of triangle is 4.
Constraints:
1 ≤ n ≤ 12
  */

class Solution {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*" + " ");
                } else if (j < i) {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
