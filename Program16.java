
//Accept number from user and display its factors give negative number also
//Time Complexity=O(N)
import java.util.*;
public class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        if(iNo<0){
            iNo=-iNo;
        }

        for(int iCnt=1;iCnt<=iNo/2;iCnt++){
            if(iNo%iCnt==0){
                System.out.println(iCnt);
            }
        }
    }
}


