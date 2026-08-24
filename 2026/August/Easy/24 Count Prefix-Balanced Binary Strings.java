/*
Given an integer n, count the number of binary strings of length 2 * n that contain exactly n ones and n zeros such that every prefix of the string contains at least as many ones as zeros. Since the answer can be very large, return it modulo 109 + 7.

Examples:

Input: n = 2
Output: 2
Explanation: "1100", "1010" are two such strings of size 4 which have exactly two 1's in each.
Input: n = 3
Output: 5
Explanation: "111000", "101100", "101010", "110010", "110100" are such 5 strings which have exactly three 1's in each.
Constraints:

1 ≤ n ≤ 1000
  */
class Solution {
    public int prefixStrings(int n) {
        long MOD = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            long sum = 0;
            for (int j = 0; j < i; j++) {
                sum = (sum + (dp[j] * dp[i - 1 - j]) % MOD) % MOD;
            }
            dp[i] = sum;
        }
        
        return (int) dp[n];
    }
}
