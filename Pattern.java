// program to display solid rectangle
import java.util.*;



class SolidRectangle {
    
    private int iLength;
    private int iBase;

    Scanner sobj=new Scanner (System.in);
    
    public void accept() {
        System.out.println("Enter your length:");
        iLength=sobj.nextInt();

        System.out.println("Enter your base:");
        iBase=sobj.nextInt();
    }

    public void display() {
        for(int i=1;i<=iLength;i++) {
    
            for(int j=1;j<=iBase;j++) {
        
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }

}

class Pattern {

    public static void main(String arg[]) {
        System.out.println(" Print Solid Rectangle:");

        SolidRectangle solidRectangle = new SolidRectangle();
        solidRectangle.accept();
        solidRectangle.display();
    }
       
   
}
