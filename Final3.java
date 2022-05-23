//Final class cannot inherited another class  
import java.lang.*;

final class Base
{
    public Base(){
        System.out.println("Inside Base Constructor");
    } 
}

class Derived extends Base    //Not Allowed  because Base class is final class cannot inherited
{
    public Derived(){
         System.out.println("Inside Derived Construtor ");
    } 
}
class Final3
{
    public static void main(String arg[])
    {
       
    }
}