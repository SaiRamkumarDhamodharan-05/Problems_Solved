//daydream - atcode
import java.util.*;

public class DayDream {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] aList = {"dream", "dreamer", "erase", "eraser"};
        while (s.length() > 0) {
            boolean matched = false;
            for (String word : aList) {
                if (s.endsWith(word)) {
                    s = s.substring(0, s.length() - word.length());
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                break;
            }
        }
        if (s.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}