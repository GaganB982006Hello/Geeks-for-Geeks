/*
Given an array arr[] containing the prices of items, your task is to calculate the average of all prices, rounded to two decimal places. Return the average of all the items as a String.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 3.00 
Explanation: Sum of the array is 15, hence average is 15/5=3.00. 
Input: arr[] = [2, 55, 85, 656, 52, 554, 545, 5, 2]
Output: 217.33 
Explanation: Sum of the array is 1956, hence average is 1956/9= 217.33. 
Constraints:
1 ≤ arr.size() ≤ 100
1 ≤ arr[i] ≤ 1000
  */

class Solution {
    public String average(int arr[]) {
        double sum = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        double result = sum / (double) count;
        return String.format("%.2f", result);
    }
}
