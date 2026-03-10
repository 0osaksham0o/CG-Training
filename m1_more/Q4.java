package m1_more;
import java.sql.SQLOutput;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        String s = "abcddbbbb";

        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int max = 0;
        char ans = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>max){
                max = map.get(s.charAt(i));
                ans = s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
