
//remove number from string
public class RemoveNumber {

    public static void removeNumber(String  str) {

        char[]ch = str.toCharArray();
        System.out.println(ch.length);

        int count = 0;
        
        for(int i=0;i<=ch.length-1;i++) {

            if ((ch[i]>(char)48) && (ch[i]<=(char)57) ) {
                 
             
            }else{
                System.out.print(ch[i]);
                count =count+1;
            }
        }
        System.out.println();
        System.out.println("number of character is: "+count);
    }
    
    public static void main(String[] args) {
    
        String str = "gdb137n7733nmd";
        removeNumber(str);
    }

}
