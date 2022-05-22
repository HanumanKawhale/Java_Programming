//Program to display using while loop

import java.lang.*;
import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your number:");
        int iNo=sc.nextInt(); 

        if(iNo<0){
            iNo=-iNo;  //Upadator
        }
        int iCnt=1;
        while(iCnt<=iNo){
            System.out.println(iCnt);
            iCnt++;

        }

    }
}
