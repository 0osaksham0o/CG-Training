package BasicCodingQuestions;

import java.util.Scanner;

public class Q7 {
    static boolean isPangram(String s){
        int[] arr = new int[26];
        String rev = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            if(rev.charAt(i)>='a' && rev.charAt(i)<='z'){
                arr[rev.charAt(i)-'a']++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(isPangram(str));

    }
}
