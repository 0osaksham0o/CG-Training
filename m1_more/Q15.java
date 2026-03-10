package m1_more;

public class Q15 {
    public static void main(String[] args) {
        String s = "this is new localization internalization";

       String[] words = s.split(" ");
        String result = "";
        for(String word: words){
            if(word.length()>10){
               result = result + shortener(word) + " ";
            }

            else{
                result = result + word + " ";
            }
        }

        System.out.println(result);
    }

    static String shortener(String s){
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        int len = s.length()-2;
        return ""+first+len+last;
    }
}
