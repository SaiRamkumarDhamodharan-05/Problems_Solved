/*Given two strings s and t. Return the minimum number of operations required to convert s to t.
The possible operations are permitted:
	1. Insert a character at any position of the string.
	2. Remove any character from the string.
	3. Replace any character from the string with any other character.*/

import java.util.Scanner;

class MinEdits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int l1 = s.length();
        int l2 = t.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int i = 0; i <= l1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= l2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1],
                                   Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                }
            }
        }
        System.out.println(dp[l1][l2]);
        in.close();
    }
}
