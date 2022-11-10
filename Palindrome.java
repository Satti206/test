import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        System.out.println(isPalindrome(s) ? "YES" : "NO");
    }
     private static boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0)
            return true;

        if(s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
     }
}