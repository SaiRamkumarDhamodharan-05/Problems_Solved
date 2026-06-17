//Write a C program to convert a decimal number to binary and print the count of 1's in it. 
//If 1's are not present in binary number, then print invalid input.

import java.util.*;
class BitC
{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String binary = Integer.toBinaryString(n);
      int c=Integer.bitCount(n);
      if(c==0){
         System.out.println("Invalid input");
      }
    }
}