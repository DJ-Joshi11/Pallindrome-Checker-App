// @author Devansh Joshi
// @version 4.0
// Use case 4 : Character array based check


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] arr = input.toCharArray();
        boolean isPalindrome = true;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
