
//input 1234  you can put negative number also
//output sum=10

import java.util.*;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        int iDigit=0;
        int iSum=0;
        
        if (iNo<0){
            iNo=-iNo;
        }
        while(iNo!=0){
           iDigit=iNo%10;
           iSum=iSum+iDigit;
           iNo=iNo/10;
        }
        System.out.println("your sum is: "+iSum);
       
    }
}
