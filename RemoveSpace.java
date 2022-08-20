
//remove Space from string
public class RemoveSpace{

    public static void removeSpace(String  str) {

        char[]ch = str.toCharArray();
        System.out.println(ch.length);

        int count = 0;
        
        for(int i=0;i<=ch.length-1;i++) {

            if (ch[i]==(char)32 ) {
                 
             
            }else{
                System.out.print(ch[i]);
                count =count+1;
            }
        }
        System.out.println();
        System.out.println("number of character is: "+count);
    }
    
    public static void main(String[] args) {
    
        String str = "gdb13 7    n7   7  33 n    md";
        removeSpace(str);
    }

}
