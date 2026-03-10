package m1_more;
import java.util.HashSet;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        String s = "Csharpstarz";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for(char c : set){
            result.append(c);
        }

        String finalString = result.toString();

        System.out.println(finalString);
    }
}