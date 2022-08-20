
//string upper case end or not
public class EndUpperCase {
    


    public static boolean EndUpperCase(String  str) {

        char[]ch = str.toCharArray();
        
        int n = ch.length - 1;

        if(ch[n]>=(char)65 && ch[n]<=(char)90){

            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    public static void main(String[] args) {
    
        String str = "fheifjkrpewhK";
        boolean b=EndUpperCase (str);

        System.out.println(b);
    }

}
