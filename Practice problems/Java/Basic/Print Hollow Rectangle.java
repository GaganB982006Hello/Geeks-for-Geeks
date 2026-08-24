/*
Given two integers n and m, print a hollow rectangle pattern consisting of n rows and m columns.

Examples:

Input: n = 3, m = 5
Output:
*****
*   *
*****
Input: n = 4, m = 3
Output:
***
* *
* *  
*** 
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
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n || j == 1|| j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
