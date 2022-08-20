import java.util.Scanner;

public class StringPalindrome {

    public static boolean checkPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }

        if (str.equals(reverse)) {

            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean b = checkPalindrome(str);

        System.out.println(b);

    }

}
