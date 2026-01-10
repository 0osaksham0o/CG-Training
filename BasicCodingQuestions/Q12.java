package BasicCodingQuestions;

import java.util.Scanner;

public class Q12 {
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static String getPrime(int a,int b){
        StringBuilder sb = new StringBuilder();
        for(int i=a;i<b;i++){
            if(isPrime(i)) sb.append(i).append(" ");
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(getPrime(x,y));

    }
}
