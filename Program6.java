
//Program to display //how many timy user want 
import java.lang.*;
import java.util.*;
 
class Program5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);     
        
        System.out.println("Enter your number");
        int iNo=sc.nextInt();           //Input from user

        if(iNo<0){
            iNo=-iNo;     //Updator           
        }
        
        for(int iCnt=0;iCnt<iNo;iCnt++){
            System.out.println("Hello");
        }
      
    }

}
