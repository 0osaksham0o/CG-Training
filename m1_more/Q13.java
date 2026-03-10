package m1_more;

import java.util.Locale;

public class Q13 {
    public static void main(String[] args) {
        String s = "heLLO";
        int count_upper =0,count_lower=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) count_upper++;
            else count_lower++;
        }

        System.out.println((count_lower<count_upper)?s.toUpperCase():s.toLowerCase());
    }
}
