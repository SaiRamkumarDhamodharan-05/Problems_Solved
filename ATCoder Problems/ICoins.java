//coins
import java.util.Scanner;

class ICoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int n = in.nextInt();
        
        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextDouble();
        }
        
        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j >= 0; j--) {
                double headProb = dp[j] * (1.0 - p[i]);
                double tailProb = (j > 0) ? dp[j - 1] * p[i] : 0.0;
                dp[j] = headProb + tailProb;
            }
        }
        
        double result = 0;
        for (int j = (n + 1) / 2; j <= n; j++) {
            result += dp[j];
        }
        
        System.out.printf("%.10f\n", result);
    }
}