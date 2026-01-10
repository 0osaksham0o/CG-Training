package BasicCodingQuestions;

import java.util.Scanner;

public class Q6 {
    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(sumOfDigits(n));
    }
}
