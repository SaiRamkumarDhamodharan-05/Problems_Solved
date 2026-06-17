//Swap the values of two integers using XOR bitwise operator — no temp variable needed. a^=b; b^=a; a^=b achieves the swap in-place.

public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before: a=" + a + " b=" + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After:  a=" + a + " b=" + b);
    }
}
