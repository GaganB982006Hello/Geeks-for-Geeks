/*
Given two integers, n and m. The task is to check the relation between n and m. Print "less" if n < m,  "equal" if n == m, and "greater" if n > m.

Examples :

Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'less'.
Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.
Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.
Constraints:
-109 <= m , n <= 109
  */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) System.out.print("greater");
        else if (n == m) System.out.print("equal");
        else System.out.print("less");
        
    }
}
