package m1_more;

public class Q11 {
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "ab";

        s1 = s1+s1;

        if(s1.contains(s2)) System.out.println("true");
        else System.out.println("false");
    }
}
