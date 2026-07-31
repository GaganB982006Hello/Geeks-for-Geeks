/*
Given an integer n, write a program to print the square of size n using "*" character. 

Examples :

Input: n = 4
Output:
* * * *
*     *
*     *
* * * *
Explanation: It's a square! Each side contains n = 4 .
Input: n = 3
Output:
* * * 
*   *
* * *
Explanation: It's a square! Each side contains n = 3 .
Constraints:
1 ≤ n ≤ 10
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }System.out.println();
        }sc.close();
    }
}
