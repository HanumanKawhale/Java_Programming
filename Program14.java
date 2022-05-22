//Accept number from user and display its factors

import java.util.*;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        for(int iCnt=1;iCnt<iNo;iCnt++){
            if(iNo%iCnt==0){
                System.out.println(iCnt);
            }
        }
    }
}
//Time Complexity=O(N)