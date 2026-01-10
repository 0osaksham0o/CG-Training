package BasicCodingQuestions;

public class Q19 {
    static int findFactorial(int n){
        if(n==0 || n==1) return 1;
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}
