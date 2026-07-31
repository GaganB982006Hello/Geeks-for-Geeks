/*
Take an interger input a, and then use the if statement to print "Big" (without quotes) if the given number is greater than 100, and use the else statement to print "Small" (without quotes) when the number is smaller than or equal to 100.

Note: After printing the output, you should move the cursor to the new line.

Examples:

Input: a = 10
Output: Small
Explanation: 10 is smaller than 100, so our else statement works and we print Small.
Input: a = 101
Output: Big
Explanation: 101 is greater than 100, so our if statement works and we print Big.

  */

import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // code here
        if(a > 110){
            System.out.println("Big");
        }else{
            System.out.println("Small");
        }sc.close();
    }
}
