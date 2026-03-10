package m1_more;

public class Q9 {
    public static void main(String[] args) {
        String cipher = "nrfzh";
        String result = "";

        for(int i = 0; i < cipher.length(); i++){
            char ch = cipher.charAt(i);

            int newChar = ch + 3;

            if(newChar > 'z'){
                newChar = newChar - 26;
            }

            result += (char)newChar;
        }

        System.out.println(result);
    }
}
