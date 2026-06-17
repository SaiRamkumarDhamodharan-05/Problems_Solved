//C-SUSHI

import java.util.*;
class Csushi{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n,m;
    n=in.nextInt();
    m=in.nextInt();
    int[] shari_weights=new int[n];
    int[] neta_weights=new int[m];
    for(int i=0;i<n;i++)
    {
      shari_weights[i]=in.nextInt();
    }
    for(int i=0;i<m;i++)
    {
      neta_weights[i]=in.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if((shari_weights[i]*2)>=neta_weights[j] && !list.contains(neta_weights[j])){
          list.add(neta_weights[j]);
          break;
        }
      }
    }
    System.out.println(list.size());
    in.close();
  }
}


/*class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] shari_weights = new int[n];
        int[] neta_weights = new int[m];
        for (int i = 0; i < n; i++) {
            shari_weights[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            neta_weights[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(shari_weights);
        Arrays.sort(neta_weights);
        int shari_ptr = 0;
        int neta_ptr = 0;
        int matched_count = 0;
        while (shari_ptr < n && neta_ptr < m) {
            if ((long) shari_weights[shari_ptr] * 2 >= neta_weights[neta_ptr]) {
                matched_count++;
                shari_ptr++;
                neta_ptr++;
            } else {
                shari_ptr++;
            }
        }
        
        System.out.println(matched_count);
    }
} */