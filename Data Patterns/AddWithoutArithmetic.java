 //Add two integers using only bitwise operators. XOR gives the sum-without-carry, AND+left-shift gives the carry. Repeat until carry is 0.

public class AddWithoutArithmetic {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(add(13, 25));
    }
}
