//program to display Summation your number
//input 4
//output 1+2+3+4
import java.util.*;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        int iSum=0;
        for(int iCnt=0;iCnt<=iNo;iCnt++){
            iSum=iSum+iCnt;
        }
        System.out.println("your addition: "+iSum);
    }
    
}
