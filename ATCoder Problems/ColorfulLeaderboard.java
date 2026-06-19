//colorful leaderboard
import java.util.*;
class ColorfulLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        Set<String>list=new HashSet<>();
        int c=0;
        Arrays.setAll(arr, i -> in.nextInt());
        for(int i=0;i<n;i++){
          if (arr[i] >= 1 && arr[i] <= 399) {
              list.add("gray");
          } else if (arr[i] >= 400 && arr[i] <= 799) {
              list.add("brown");
          } else if (arr[i] >= 800 && arr[i] <= 1199) {
              list.add("green");
          } else if (arr[i] >= 1200 && arr[i] <= 1599) {
              list.add("cyan");
          } else if (arr[i] >= 1600 && arr[i] <= 1999) {
              list.add("blue");
          } else if (arr[i] >= 2000 && arr[i] <= 2399) {
              list.add("yellow");
          } else if (arr[i] >= 2400 && arr[i] <= 2799) {
              list.add("orange");
          } else if (arr[i] >= 2800 && arr[i] <= 3199) {
              list.add("red");       
          }
          else{
            if(arr[i]==0){
              continue;
            }
            c++;
          }
        }
        int minColors = Math.max(1, list.size());
        if (list.size() == 0 && c == 0) {
            minColors = 0;
        } else if (list.size() > 0) {
            minColors = list.size();
        }
        System.out.print(minColors+" ");
        System.out.println(list.size()+c);
        in.close();
    }
}