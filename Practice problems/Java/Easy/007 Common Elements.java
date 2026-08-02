/*
Given two integer arrays a[] and b[], return an array containing all elements common to both arrays in sorted order.

If an element appears multiple times in both arrays, it should appear in the output as many times as it is common to both arrays.

Example:

Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
Output: [2, 2, 3]
Explanation: The common elements in sorted order are 2, 2, 3.
Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: [3, 7, 9]
Explanation: The common elements in sorted order are 3, 7, 9.
Constraints:

1 ≤ a.size(), b.size() ≤ 105
1 ≤ a[i], b[i] ≤ 105
  */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {
        // Sort both arrays so we can use a two-pointer approach
        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        // Traverse both arrays simultaneously
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                // If elements are equal, it's a common element
                result.add(a[i]);
                i++;
                j++;
            }
        }
        
        return result;
    }
}
