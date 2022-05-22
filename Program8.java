//Program to display user want
import java.lang.*;
import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        int iCnt=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your number:");
        int iNo=sc.nextInt();          //input from user

        for(iCnt=1;iCnt<=iNo;iCnt++){
            System.out.println(iCnt);
        }
    }
    
}