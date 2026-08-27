/*
Given a positive integer, n. Find the factorial of n.

Examples :

Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120
Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24
Constraints:
0 ≤ n ≤ 12
  */

class Solution {
    int factorial(int n) {
        // code here
        int p = 1;
        int temp = n;
        for (int i = 0; i < n; i++){
            p *= temp;
            temp--;
        }
        return p;
    }
}
