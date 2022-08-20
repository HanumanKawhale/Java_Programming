
//Remove capital litter from string

public class RemoveCapital {

    public static void removeCapital(String str) {

        char[] ch = str.toCharArray();

        int count = 0;

        for(int i=0;i<=ch.length-1;i++) {

            if(ch[i] >= (char)97 && ch[i] <= (char)122) {

                 System.out.print(ch[i]);
                 count =count+1;
            }
            
        }
        System.out.println();
        System.out.println("your number of character is: "+count);
    }

    public static void removeSmall(String str) {

        char []ch = str.toCharArray();

        int count=0; 

        for(int i=0;i<=ch.length-1;i++) {

            if(ch[i]>=(char)65 && ch[i]<=(char)90) {

                System.out.print(ch[i]);
                count = count+1;
            }
        }
        System.out.println();
        System.out.println("your number of character is: "+count);
    }
    
    public static void main(String[] args) {
        
        String str = "hdjFFJKdbhdjdHm";

        // char A='A';
        // int n=(int)A;
        // System.out.println(n);
        // char Z='Z';
        // int n1=(int)Z;
        // System.out.println(n1);
        // char a='a';
        // int n2=(int)a;
        // System.out.println(n2);
        // char z='z';
        // int n4=(int)z;
        // System.out.println(n4);
        removeCapital(str);
        System.out.println();
        //System.out.println();
        removeSmall(str);
      
    }
}
