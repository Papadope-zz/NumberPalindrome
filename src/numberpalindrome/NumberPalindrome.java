package numberpalindrome;

public class NumberPalindrome {

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int number1 = number;
        
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }
        
        if (number1 == reverse) {
            System.out.println("true");
            return true;
        } 
        else {
            System.out.println("false");
            return false;
        }
    }
}
