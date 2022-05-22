//Program to display number forward and backward
//example 4
//output 1 2 3 4  4 3 2 1
import java.util.*;
public class Program19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        for(int iCnt=1;iCnt<=iNo;iCnt++){
            System.out.print(" "+iCnt);
        }
        
        for(int iCnt=iNo;iCnt>=1;iCnt--){
            System.out.print(" "+iCnt);
        }
    }   
}
