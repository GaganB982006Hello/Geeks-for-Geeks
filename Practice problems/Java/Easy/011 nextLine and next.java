/*
Here, we will learn how to take input from a string that comprises of multiple words. Also, we will learn to clear the input buffer. Your task is to take input of strings and integers and produce the output. We must be clear with next() and nextLine()

Note: Refer to the following link to get a better understanding: StackOverflow

Example 1:

Input:
5
Geeks For Geeks
Output:
5
Geeks For Geeks
Example 2:

Input:
102
I am learning Java
Output:
102
I am learning Java
*/

import java.util.Scanner;

class Geeks {
    static void getInput() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int a = sc.nextInt();
            sc.nextLine(); 
            String s = sc.nextLine(); 
            
            System.out.println(a);
            System.out.println(s);
        }
    }
}
