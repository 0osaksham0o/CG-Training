package m1_more;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "lloeh0";

        if(s1.length() != s2.length()){
            System.out.println("not anagram");
            return;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0) + 1);
        }

        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);

            if(!map.containsKey(ch) || map.get(ch) == 0){
                System.out.println("not anagram");
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println("anagram");
    }
}