package BasicCodingQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1 {
    static int countVowels(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1) count++;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVowels(str));
    }
}
