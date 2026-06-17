import java.util.*;

class Frog2 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    if (!in.hasNextInt()) return;
    int n = in.nextInt();
    int k = in.nextInt();
    
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    
    int[] dp = new int[n];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        if (i + j < n) {
          int currentJumpCost = dp[i] + Math.abs(arr[i + j] - arr[i]);
          dp[i + j] = Math.min(dp[i + j], currentJumpCost);
        }
      }
    }
    
    System.out.println(dp[n - 1]);
    in.close();
  }
}