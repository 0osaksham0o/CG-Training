package BasicCodingQuestions;

public class Q29 {
    static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "this is new world";
        System.out.println(capitalizeWords(str));
    }

}
