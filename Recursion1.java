//print number using recursion
public class Recursion1 {
   
       public static void printNumber(int n) {
        if(n == 0) {
            
            return;
        }
  
        for (int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        printNumber(n-1);        //function call itself
    }
    public static void main(String[] args) {
        int n = 5;
        printNumber(n); //n=5
    }
  
    
}