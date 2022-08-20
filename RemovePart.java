

//remove remove first part from string
public class RemovePart{

    public static void removePart(String  str,int indx) {

        char[]ch = str.toCharArray();
        System.out.println(ch.length);

        int count = 0;
        
        for(int i=indx;i<=ch.length-1;i++) {


            System.out.println(ch[i]);
            // if (ch[indx] ) {
                 
             
            // }else{
                
            //     count =count+1;
            // }
        }
        System.out.println();
        //System.out.println("number of character is: "+count);
    }
    
    public static void main(String[] args) {
    
        String str = "fheifjkrpewhi";
        removePart(str,3);
    }

}
