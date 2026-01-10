package stringBasics;

import java.util.Scanner;

public class Level3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q2: UNIQUE CHARACTERS
        String text1 = input.nextLine();
        char[] uniqueChars = findUniqueCharacters(text1);
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Q3: FIRST NON-REPEATING CHARACTER
        String text2 = input.nextLine();
        char firstNonRepeat = firstNonRepeatingCharacter(text2);
        if (firstNonRepeat == '\0') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println(firstNonRepeat);
        }

        // Q4: FREQUENCY USING ASCII
        String text3 = input.nextLine();
        String[][] freqAscii = frequencyUsingASCII(text3);
        display2D(freqAscii);

        // Q5: FREQUENCY USING UNIQUE CHARACTERS
        String text4 = input.nextLine();
        String[][] freqUnique = frequencyUsingUnique(text4);
        display2D(freqUnique);

        // Q6: FREQUENCY USING NESTED LOOPS
        String text5 = input.nextLine();
        String[] freqNested = frequencyUsingNestedLoops(text5);
        for (String s : freqNested) {
            System.out.println(s);
        }

        // Q7: PALINDROME CHECK
        String text6 = input.nextLine();
        System.out.println(isPalindromeIterative(text6));
        System.out.println(isPalindromeRecursive(text6, 0, getLength(text6) - 1));
        System.out.println(isPalindromeUsingArray(text6));
    }

    // Safe length calculation
    static int getLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    static char[] findUniqueCharacters(String text) {

        int len = getLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = current;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    static char firstNonRepeatingCharacter(String text) {

        int[] freq = new int[256];
        int len = getLength(text);

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    static String[][] frequencyUsingASCII(String text) {

        int[] freq = new int[256];
        int len = getLength(text);

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        String[][] temp = new String[len][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                temp[index][0] = String.valueOf(c);
                temp[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }

        String[][] result = new String[index][2];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    static String[][] frequencyUsingUnique(String text) {

        int[] freq = new int[256];
        int len = getLength(text);

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    static String[] frequencyUsingNestedLoops(String text) {

        char[] chars = text.toCharArray();
        int len = chars.length;
        boolean[] visited = new boolean[len];
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (visited[i]) continue;

            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    visited[j] = true;
                }
            }
        }

        String[] temp = new String[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                temp[index++] = chars[i] + " : " + freq[i];
            }
        }

        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = getLength(text) - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    static void display2D(String[][] data) {
        for (String[] row : data) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
