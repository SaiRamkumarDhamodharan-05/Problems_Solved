//two arithmetic regression

import java.util.*;
public class TwoArithReg
{
    public static int findGcd(int a,int b)
    {
        if(b==0) return a;
        return findGcd(b,a%b);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,n,a,b,c,d;
        t=in.nextInt();
        int[] gcd=new int[t];
        for(int i=0;i<t;i++) {
            n=in.nextInt();
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            d=in.nextInt();
            for (int j = 1; j <= n; j++) {
                gcd[i] += findGcd(((a * j) + c), ((b * j) + d));
            }
            gcd[i]=gcd[i]%998244353;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(gcd[i]);
        }
        in.close();
    }
}
