import java.lang.*;

class Constructor
{
    public int i;
    public int j;

    public Constructor()  // constructor
    {
        this.i=0;
        this.j=0;
    }

    public Constructor(int x,int y)  //parameterized constructor
    {
        this.i=x;
        this.j=y;
    }


    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }
}
class OOps
{
    public static void main(String arr[])
    {
        System.out.println("Inside main");
        Constructor obj=new Constructor();        
        obj.fun();  //fun(obj);
        obj.gun();  //gun(obj);
        System.out.println(obj.i);

        Constructor objx=new Constructor(11,21);
        objx.fun();  //fun(obj);
        objx.gun();  //gun(obj);
        System.out.println(objx.i);
    }
}