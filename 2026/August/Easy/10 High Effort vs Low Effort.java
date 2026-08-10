/*
Given two integer arrays h[] and l[], where h[i] and l[i] denote the number of tasks that can be completed on the i-th day by performing a high-effort task and a low-effort task, respectively.

For each day, you may choose exactly one of the following:

Perform no task.
Perform a low-effort task.
Perform a high-effort task, which can only be performed on the first day or if no task was performed on the previous day.
Return the maximum total number of tasks that can be completed over all days.

Examples:

Input: h[] = [2, 8, 1], l[] = [1, 2, 1]
Output: 9
Explanation: Pick the high-effort task on day 1 and the low-effort task on day 2. Total = 8 + 1 = 9.
Input: h[] = [3, 6, 8, 7, 6], l[] = [1, 5, 4, 5, 3]
Output: 20
Explanation: Pick the high-effort task on day 0 and low-effort tasks on all remaining days. Total = 3 + 5 + 4 + 5 + 3 = 20.
Constraints:

1 ≤ h.size() ≤ 105
0 ≤ h[i] ≤ 103
1 ≤ l.size() ≤ 105
0 ≤ l[i] ≤ 103
l.size() = h.size()
  */

class Solution {
    public int maxTask(int[] h, int[] l) {
        int n = h.length;
        if (n == 0) return 0;
        
        int prevNoTask = 0;
        int prevLow = l[0];
        int prevHigh = h[0];
        
        for (int i = 1; i < n; i++) {
            int currNoTask = Math.max(prevNoTask, Math.max(prevLow, prevHigh));
            int currLow = l[i] + Math.max(prevNoTask, Math.max(prevLow, prevHigh));
            int currHigh = h[i] + prevNoTask;
            
            prevNoTask = currNoTask;
            prevLow = currLow;
            prevHigh = currHigh;
        }
        
        return Math.max(prevNoTask, Math.max(prevLow, prevHigh));
    }
}
