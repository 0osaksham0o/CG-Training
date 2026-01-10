package BasicCodingQuestions;

public class Q20 {
    static void countEvenOdd(int n){
        int countEven=0, countOdd = 0;
        while(n>0){
            int lastDigit = n%10;
            if(lastDigit%2==0) countEven++;
            else countOdd++;
            n/=10;
        }
        System.out.println("evenCount: "+ countEven + " " + "countOdd: " + countOdd);
    }
    public static void main(String[] args) {
        int n = 7894;
        countEvenOdd(n);

    }
}
