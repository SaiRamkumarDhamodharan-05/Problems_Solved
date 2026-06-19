//Integer cards
import java.util.*;

class sai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[][] bc = new int[m][2];
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            bc[i][0] = in.nextInt(); // B_i (count)
            bc[i][1] = in.nextInt(); // C_i (value)
        }
        
        Arrays.sort(a);
        
        Arrays.sort(bc, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        });
        
        int cardIdx = 0;
        for (int i = 0; i < m; i++) {
            int count = bc[i][0];
            int val = bc[i][1];
            
            if (cardIdx >= n) {
                break;
            }
            
            for (int j = 0; j < count; j++) {
                if (cardIdx >= n || a[cardIdx] >= val) {
                    break;
                }
                a[cardIdx] = val;
                cardIdx++;
            }
        }
        
        long totalSum = 0;
        for (int card : a) {
            totalSum += card;
        }
        
        System.out.println(totalSum);
    }
}