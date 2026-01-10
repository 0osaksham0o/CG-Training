package stringBasics;
import java.util.Scanner;
public class Level2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1: Length of string without using length()
        System.out.println("Q1: String Length");
        String text1 = input.next();
        int customLen = getLengthWithoutLength(text1);
        int builtInLen = text1.length();
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);

        input.nextLine(); // consume leftover newline

        // Q2: Split text into words and compare with split()
        System.out.println("\nQ2: Split Text and Compare");
        String text2 = input.nextLine();
        String[] customWords = splitWordsUsingCharAt(text2);
        String[] builtInWords = text2.split(" ");
        System.out.println("Comparison Result: " + compareStringArrays(customWords, builtInWords));

        // Q3: Words with lengths in 2D array
        System.out.println("\nQ3: Words and Lengths (2D Array)");
        String text3 = input.nextLine();
        String[] words = splitWordsUsingCharAt(text3);
        String[][] wordLengthTable = getWordLength2D(words);
        displayWordLengthTable(wordLengthTable);

        // Q4: Shortest and Longest word
        System.out.println("\nQ4: Shortest and Longest Word");
        int[] result = findShortestAndLongest(wordLengthTable);
        System.out.println("Shortest Word Length: " + result[0]);
        System.out.println("Longest Word Length: " + result[1]);

        // Q5: Count vowels and consonants
        System.out.println("\nQ5: Vowels and Consonants Count");
        String text4 = input.nextLine();
        int[] counts = countVowelsAndConsonants(text4);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        input.close();
    }

    // Q1: Find string length without using length()
    static int getLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    // Q2: Split words using charAt() without split()
    static String[] splitWordsUsingCharAt(String text) {

        int spaceCount = 0;
        for (int i = 0; i < getLengthWithoutLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount + 2];
        int index = 0;

        spaceIndexes[index++] = -1;
        for (int i = 0; i < getLengthWithoutLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = getLengthWithoutLength(text);

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Q2: Compare two String arrays
    static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    // Q3: Create 2D array of word and length
    static String[][] getWordLength2D(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLengthWithoutLength(words[i]));
        }

        return table;
    }

    // Q3: Display word-length table
    static void displayWordLengthTable(String[][] table) {

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + len);
        }
    }

    // Q4: Find shortest and longest word
    static int[] findShortestAndLongest(String[][] table) {

        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }

        return new int[]{shortest, longest};
    }

    // Q5: Check vowel or consonant
    static int checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return 1; // vowel
            } else {
                return 2; // consonant
            }
        }
        return 0; // not a letter
    }

    // Q5: Count vowels and consonants
    static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < getLengthWithoutLength(text); i++) {
            int result = checkCharacter(text.charAt(i));
            if (result == 1) vowels++;
            else if (result == 2) consonants++;
        }

        return new int[]{vowels, consonants};
    }
}
