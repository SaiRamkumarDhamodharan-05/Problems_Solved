//A number n is a power of 2 if and only if it is positive and (n & (n-1)) == 0. Powers of 2 have exactly one set bit; subtracting 1 flips all lower bits, so AND gives 0.

public class IsPower {
    public static boolean isPowerOf2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));
        System.out.println(isPowerOf2(18));
    }
}