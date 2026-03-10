package m1_more;

public class Q12 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,4,6,3,7,8};

        int sum = 0;
        int n_sum = n* (n+1)/2;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println(Math.abs(n_sum-sum));
    }
}
