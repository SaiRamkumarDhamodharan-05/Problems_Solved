//Given a matrix mat[][] of size N x M, where every row and column is sorted in 
//increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.

import java.util.*;
class FindElement {
    public static void main(String[] args) {
        int n=3,m=3;
        Scanner in=new Scanner(System.in);
        int[][] mat=new int[n][m];
        int ele=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=in.nextInt();
            }
        }
        int r=-1,c=m-1,a=0;
        for(int i=0;i<n;i++){
         if(mat[i][c]>=ele){
             r=i;
             break;
         }
        }
        if(r!=-1){
        for(int i=0;i<m;i++){
            if(mat[r][i]==ele){
                System.out.println(1);
                a=1;
            }
        }
        }
        if(a==0){
        System.out.println(0);
        }
    }
}
