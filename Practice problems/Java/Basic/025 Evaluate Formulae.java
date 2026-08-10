/*
Given four inputs that are stored in variables a, b, c, and d. You need to write an expression to evaluate the following formula. Use integer division. The expression should be a single statement.



Examples:

Input: a = 10, b = 4, c = 7, d = 9
Output: 11
Explanation: 10 + 4 = 14, 14 // 7 = 2(Python) or 14 / 7 = 2(Java or CPP or C), 2 + 9 = 11.
Input: a = 5, b = 6, c = 8, d = 9
Output: 10
Explanation: 5 + 6 = 11, 11 // 8 = 1(Python) or 11 / 7 = 1(Java or CPP or C), 1 + 9 = 10.
Constraints:
1 ≤ a, b, c, d ≤ 100
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // code here
        int e = a + b;
        int f = e / c;
        int g = f + d;
        System.out.print(g);
    }
}
