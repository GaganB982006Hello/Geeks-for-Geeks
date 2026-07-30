/*
Given three positive integers a, b and c. Perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = ~ e
Note: ^ is for xor.
Then print d e f g space seperately. Move the cursor to the next line after printing.

Examples:

Input: a = 1, b = 2, c = 3
Output: 0 1 0 -2
Explanation: We print d e f g after performing the given operations.
Input: a = 4 , b = 5 , c = 6
Output: 0 3 4 -4
Explanation: We print d e f g after performing the given operations.
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Code here: Added the missing semicolons
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = ~e;
        
        System.out.println(d + " " + e + " " + f + " " + g);
        sc.close();
    }
}
