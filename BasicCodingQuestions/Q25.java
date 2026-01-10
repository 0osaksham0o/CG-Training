package BasicCodingQuestions;

import java.util.Arrays;

public class Q25 {
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++)
            temp[i] = arr[i];

        for (int i = k; i < n; i++)
            arr[i - k] = arr[i];

        for (int i = 0; i < k; i++)
            arr[n - k + i] = temp[i];
    }

    public static void main(String[] args) {

        int k = 2;
        int[] arr = {1,2,3,4,5};
        leftRotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

}
