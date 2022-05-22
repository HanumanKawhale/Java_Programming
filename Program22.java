
//input 1234  you can put negative number also
//output even number 2 4

import java.util.*;
public class Program22 {
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
           if(iDigit%2==0){
               System.out.println(iDigit);
           }
           iNo=iNo/10;
        }
    
       
    }
}
