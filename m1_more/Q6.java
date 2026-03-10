package m1_more;

public class Q6 {
    public static void main(String[] args) {
//        check all palindromes in given string

        String s = "this is level 71 madam";

        String[] words = s.split(" ");
        int count = 0;
        for(String word:words){
            if(isPalindrome(word)) count++;
        }

        System.out.println(count);

    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}
