//Frog1
import java.util.*;

class Frog1 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    if (!in.hasNextInt()) return;
    int n = in.nextInt();
    
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    
    int[] dp = new int[n];
    dp[0] = 0;
    if (n > 1) {
      dp[1] = Math.abs(arr[1] - arr[0]);
    }
    
    for (int i = 2; i < n; i++) {
      int jumpOne = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
      int jumpTwo = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
      dp[i] = Math.min(jumpOne, jumpTwo);
    }
    
    System.out.println(dp[n - 1]);
    in.close();
  }
}