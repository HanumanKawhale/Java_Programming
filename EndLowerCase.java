
//  string end lower case or not
public class EndLowerCase {
    


    public static boolean EndLowerCase(String  str) {

        char[]ch = str.toCharArray();
        
        int n = ch.length - 1;

        if(ch[n]>=(char)97 && ch[n]<=(char)122){

            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    public static void main(String[] args) {
    
        String str = "fheifjkrpewhK";
        boolean b=EndLowerCase (str);

        System.out.println(b);
    }

}
