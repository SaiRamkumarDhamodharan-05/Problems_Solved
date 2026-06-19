
//subtraction or division
import java.util.Scanner;
public class SubtractionOrDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextLong()) return;
        long n = in.nextLong();
        long ans = 0;
        long m = n - 1;
        for (long i = 1; i * i <= m; i++) {
            if (m % i == 0) {
                if (i >= 2) {
                    ans++;
                }
                if (m / i != i && m / i >= 2) {
                    ans++;
                }
            }
        }
        long limit = Math.min(n, 1000000L);
        for (long k = 2; k <= limit; k++) {
            if (n % k == 0) {
                long temp = n;
                while (temp % k == 0) {
                    temp /= k;
                }
                if (temp % k == 1) {
                    ans++;
                }
            }
        }
        if (n > 1000000L) {
            ans++;
        }
        
        System.out.println(ans);
        in.close();
    }
}