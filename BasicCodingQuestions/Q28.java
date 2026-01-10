package BasicCodingQuestions;

public class Q28 {
    public static void main(String[] args) {
        String str = "HellO@!@#$2468";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}
