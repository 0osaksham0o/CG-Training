package m1_more;

public class Q14 {
    public static void main(String[] args) {
        int n = 320;
        int rev = 0;
        while(n>0){
            int lastigit = n%10;
            rev = rev*10+lastigit;
            n/=10;
        }

        System.out.println(rev);
    }
}
