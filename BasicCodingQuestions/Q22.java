package BasicCodingQuestions;

import java.util.Scanner;

public class Q22 {
    static int sumOfEvenPositionDigits(int num) {
        int position = 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (position % 2 == 0) {
                sum += digit;
            }

            position++;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumOfEvenPositionDigits(n));


    }
}
