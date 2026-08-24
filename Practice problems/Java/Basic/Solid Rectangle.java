/*
Given two integers n and m, print a solid rectangle pattern of n rows and m columns using the "*" character.

Note: There is a space between two adjacent stars (*) in the pattern.

Examples:

Input: n = 3, m = 5
Output:
* * * * *
* * * * *
* * * * *
Input: n = 4, m = 2
Output:
* *
* * 
* *  
* * 
Constraints:
1 ≤ n ≤ 100
1 ≤ m ≤ 100
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
