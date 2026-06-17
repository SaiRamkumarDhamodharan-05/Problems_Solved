//Row with Max 1s in Rowwise Sorted

import java.util.*;
public class RowWithMax1s
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<r;i++)
        {
            if(mat[i][c-1]==1)
            {
                for(int j=0;j<c;j++)
                {
                    if(mat[i][j]==1) count++;
                    if(count>maxCount) index=i;
                }
            }
        }
        System.out.println(index);
        in.close();
    }
}