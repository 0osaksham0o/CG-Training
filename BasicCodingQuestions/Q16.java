package BasicCodingQuestions;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int[] arr = new int[26]; // fixed size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char chr = (char) (i + 'a');
            System.out.print(chr + " : " + arr[i] + " ");
        }
    }
}
