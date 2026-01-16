package classesAndObjects;
class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + isPalindrome());
    }
}



public class Q8 {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Madam");
        checker.displayResult();
    }
}
