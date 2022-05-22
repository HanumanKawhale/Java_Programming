//program display to your class 
/*
0 to 35         Fail
35 to 50        Pass class
50 to 60        Second class
60 to 70        First class
70 to 100       First class with distinction
*/
import java.util.*;
public class program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        float fMarks=sc.nextFloat();



        if((fMarks >0.0) && (fMarks < 35.0))
    {
        System.out.println("You are fail");
    }
    else if((fMarks >= 35.0) && (fMarks < 50.0))
    {
        System.out.println("Pass class");
    }
    else if((fMarks >= 50.0) && (fMarks < 60.0))
    {
       System.out.println("Second class\n");
    }
    else if((fMarks >= 60.0 ) && (fMarks < 70.0))
    {
        System.out.println("First class\n");
    }
    else if((fMarks >= 70.0) && (fMarks <= 100.0))
    {
        System.out.println("First class with distinction\n");
    }
    else
    {
       System.out.println("Invalid marks\n");
    }
}
    
}
