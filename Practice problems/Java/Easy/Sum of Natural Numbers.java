/*
Given an integer n, compute the sum of all natural numbers from 1 to n (inclusive). If n is 0, the sum should be 0.

Examples:

Input: n = 6
Output: 21
Explanation: The sum of natural numbers up to 6 is: 1 + 2 + 3 + 4 + 5 + 6 = 21.
Input: n = 4
Output: 10
Explanation: The sum of natural numbers up to 4 is: 1 + 2 + 3 + 4 = 10.
Input: n = 0
Output: 0
Explanation: Since n is 0, the sum is 0.
Constraints:
0 ≤ n ≤ 104
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int sum = 0;
        int i = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
