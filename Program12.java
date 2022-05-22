import java.util.Scanner;

//program to display your value is divisible 3,5
import java.util.*;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int iNo=sc.nextInt();

        if(iNo%3==0 && iNo%5==0){
            System.out.println("your number is divisible by 3 and 5");
        }
        else{
            System.out.println("your number is not divisible by 3 and 5");
        }
    }
    
}
