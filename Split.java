//String split between space
public class Split {


    public static void split(String  str) {

        char[]ch = str.toCharArray();
        
        for(int i=0;i<=ch.length-1;i++){

            if(ch[i]==(char)32) {
                System.out.println();
            }
        else{
            System.out.print(ch[i]);
        }
       
        } System.out.println();
        
        
    }
    
    public static void main(String[] args) {
    
        String str = "fheif jkr pew hi";
        split (str);

        
    }

}
