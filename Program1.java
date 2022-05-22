//Accept n number from user and creating array and display indexwise element
import java.lang.*;
import java.util.*;

class Program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("how many number do you want:");
        int number=sc.nextInt();
                
        int []arr=new int[number];
        for(int i=0;i<number;i++){
            
            arr[i]=sc.nextInt();
        }
        
       for(int j=0;j<number;j++){

        System.out.println("your " + j + " index element: "+arr[j]);
       }
    }    
    
}