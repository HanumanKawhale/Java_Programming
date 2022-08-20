public class Pattern10 {
    
    public static void main(String[] args) {
        
        int n = 5;
        pattern2(n);
    }

    public static void pattern1(int n) {
        
        for (int row= 0; row <= n*2; row++) {
            
            int totalcol=row>n?2*n-row:row;

            for (int col = 0; col<=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    public static void pattern2(int n) {
        
        for (int row= 0; row <= n*2; row++) {
            
            int totalcol=row>n?2*n-row:row;

            int noofspace=n-totalcol;
            for(int space=0;space<=noofspace;space++){
                System.out.print(" ");
            }

            for (int col = 0; col<=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
