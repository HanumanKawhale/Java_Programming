
//Accept number from user and display its sum of factors give negative number also
//Time Complexity=O(N/2)
import java.util.*;
public class Program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt(); 

        int iSum=0; 

        if(iNo<0){
            iNo=-iNo;
        }

        for(int iCnt=1;iCnt<=iNo/2;iCnt++){
            if(iNo%iCnt==0){
                iSum=iSum+iCnt;
            }
        }
        System.out.println("Your sumFactor is: "+iSum);
    }
}