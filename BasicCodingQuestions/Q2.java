package BasicCodingQuestions;
import java.util.Scanner;
public class Q2 {
    static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words){
            result.append(new StringBuilder(word).reverse().append(" "));
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(reverseWords(str));
    }
}
