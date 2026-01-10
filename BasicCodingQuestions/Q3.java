package BasicCodingQuestions;
import java.util.Scanner;

public class Q3 {
    static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n /=10;
        }


        return (rev==temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
}
