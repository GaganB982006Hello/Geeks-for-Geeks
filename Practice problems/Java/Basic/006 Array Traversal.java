/*
You are given an array arr[] that contains integers. You need to print the elements of the array in a single line with a space between them.
Note: Don't add a new line at the end.

Examples:

Input: arr[] = [54, 43, 2, 1, 5]
Output: 54 43 2 1 5
Explanation: Just traverse and print the numbers.
Input: arr[] = [324, 5, 2, 2]
Output: 324 5 2 2
Explanation: Just traverse and print the numbers.

  */

class Solution {
    public static void arrayTraversal(int[] arr) {
        // Code here
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
