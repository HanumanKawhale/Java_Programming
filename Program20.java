//input 7856  you can put negative number also
//output
//6
//5
//8
//7
import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        int iDigit=0;
        
        if (iNo<0){
            iNo=-iNo;
        }
        while(iNo!=0){
           iDigit=iNo%10;
           System.out.println(iDigit);
           iNo=iNo/10;
        }
       
    }
}