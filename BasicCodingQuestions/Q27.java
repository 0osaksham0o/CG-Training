package BasicCodingQuestions;

public class Q27 {
    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n =6;
        System.out.println(isPerfect(n));
    }
}
