//sum of natural numbers
public class Recursion2 {

    public static void printSum(int i, int n, int sum) {
        if(i == n) {        //base case
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum); //recursive call
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        printSum(i, n, sum);
        
    }
    
}
