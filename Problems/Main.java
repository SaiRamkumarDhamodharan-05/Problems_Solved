//Problem Statement – Chaman planned to choose a four digit lucky number for his car. 
//His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by  3 or 5 or 7. 
//Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 
//Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.

import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int dCount=Integer.toString(digit).length();
        if(dCount!=4)
        {
            System.out.println(digit+" is not a valid number");
            return;
        }
        int temp;
        int sum=0;
        while(digit!=0)
        {
            temp=digit%10;
            sum+=temp;
            digit=digit/10;
        }
        if(sum%3 ==0 || sum%5==0 || sum%7==0)
        {
            System.out.println("Lucky Number");
        }
        else System.out.println("Sorry its not my lucky number");
    }
}