//XOR world
import java.util.*;
class Xor{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    long l=in.nextLong();
    long x=0;
    long r=in.nextLong();
    for(long i=l;i<=r;i++){
      x^=i;
    }
    System.out.println(x);
  }
}