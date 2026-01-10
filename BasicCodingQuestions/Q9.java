package BasicCodingQuestions;

import java.util.Scanner;


public class Q9 {
    static boolean isArmstrong(int n){
        int digits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while(n>0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit,digits);
            n/=10;
        }

        return sum==temp;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArmstrong(n));
    }
}
