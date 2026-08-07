/*
Given a number n find the prime factorization of the number.

Note: Print the prime factors in non-decreasing order.

Examples:

Input: n = 100
Output: 2 2 5 5
Explanation: 100 = 2 * 2 * 5 * 5
Input: n = 27
Output: 3 3 3
Explanation: 27 = 3 * 3 * 3 
Constraint:
2 <= n <= 200
  */

class Solution {
    public static void printPrimeFactorization(int n) {
        // Divide n by 2 until it is no longer divisible
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
