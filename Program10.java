//program to display your number even or odd
import java.util.*;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int iNo=sc.nextInt();

        if(iNo%2==0){
            System.out.println("your number is even");
        }
        else{
            System.out.println("your number is odd");
        }
    }
    
}
