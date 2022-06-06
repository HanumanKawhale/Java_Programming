// program to display empty rectangle
import java.util.*;
class Pattern1 {

    public static void main(String arg[]) {
    
        Scanner sobj=new Scanner (System.in);

        System.out.println("Enter your length :");
        int iLength=sobj.nextInt();
    
        System.out.println("Enter your base :");
        int iBase=sobj.nextInt();

        for(int i=1;i<=iLength;i++)
        {
            for(int j=1;j<=iBase;j++)
            {
                if(i==1 || i==iLength || j==1 ||j==iBase)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

  
}
