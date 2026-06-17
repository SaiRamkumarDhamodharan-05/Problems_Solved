//Given a sentence like "have a nice day", reverse the order of words to produce "day nice a have". Split by spaces, reverse the array, rejoin.

public class Reverse {
    public static String reverse(String s) {
        String[] w = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--)
            sb.append(w[i]).append(i > 0 ? " " : "");
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("have a nice day"));
    }
}
