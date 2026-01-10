package BasicCodingQuestions;

public class Q26 {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " : " + (int) ch);
        }
    }
}
