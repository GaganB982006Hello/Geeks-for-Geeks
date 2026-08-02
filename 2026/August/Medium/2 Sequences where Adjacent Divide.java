/*
Given two positive integer n and m. Find the number of arrays of size n that can be formed such that:

Each element is in the range [1, m].
All adjacent are such that one of them divide the another i.e element Ai divides Ai + 1 or Ai+1 divides Ai.
Examples:

Input: n = 3, m = 3
Output : 17
Explanation: The possible arrays are [1, 1, 1], [1, 1, 2], [1, 1, 3], [1, 2, 1], [1, 2, 2], [1, 3, 1], [1, 3, 3], [2, 1, 1], [2, 1, 2], [2, 1, 3], [2, 2, 1], [2, 2, 2], [3, 1, 1], [3, 1, 2], [3, 1, 3], [3, 3, 1] and [3, 3, 3].
Input: n = 1, m = 10 
Output: 10
Explanation: The possible arrays are [1], [2], [3], [4], [5], [6], [7], [8], [9] and [10].

Constraints:

1 ≤ n ≤ 11
1 ≤ m ≤ 11
  */

class Solution {
    public int count(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int j = 1; j <= m; j++) {
            dp[1][j] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= m; k++) {
                    if (j % k == 0 || k % j == 0) {
                        dp[i][j] += dp[i - 1][k];
                    }
                }
            }
        }
        int totalCount = 0;
        for (int j = 1; j <= m; j++) {
            totalCount += dp[n][j];
        }
        return totalCount;
    }
}
