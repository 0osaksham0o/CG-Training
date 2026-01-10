package stringBasics;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1: Compare two strings using charAt() and equals()
        System.out.println("Q1: String Comparison");
        String s1 = input.next();
        String s2 = input.next();
        boolean charAtResult = compareStringsUsingCharAt(s1, s2);
        boolean equalsResult = s1.equals(s2);
        System.out.println("charAt comparison: " + charAtResult);
        System.out.println("equals() comparison: " + equalsResult);

        // Q2: Substring using charAt() and substring()
        System.out.println("\nQ2: Substring Creation");
        String text = input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        String sub1 = substringUsingCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("charAt substring: " + sub1);
        System.out.println("substring(): " + sub2);
        System.out.println("Comparison: " + compareStringsUsingCharAt(sub1, sub2));

        // Q3: Convert String to char array and compare
        System.out.println("\nQ3: Character Array Comparison");
        String text2 = input.next();
        char[] arr1 = getCharsWithoutToCharArray(text2);
        char[] arr2 = text2.toCharArray();
        System.out.println("Comparison result: " + compareCharArrays(arr1, arr2));




    }

    // Q1: Compare two strings using charAt()
    static boolean compareStringsUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    // Q2: Create substring using charAt()
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Q3: Return characters without using toCharArray()
    static char[] getCharsWithoutToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Q3: Compare two char arrays
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }


}
