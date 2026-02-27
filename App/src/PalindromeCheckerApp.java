// @author Devansh Joshi
// @version 2.0
// Use case 2 : Hardcoded Pallindrome Validation


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Input text: madam")

        if (word.equals(reversed)) {
            System.out.println("Is it a pallindrome? True");
        } else {
            System.out.println("Is it a pallindrome? False");
        }
    }
}
