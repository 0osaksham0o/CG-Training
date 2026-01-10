package BasicCodingQuestions;

import java.util.Scanner;

public class Q5 {

    static int secondLargest(int[] arr){
        int max= 0;
        int secondMax = 0;
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                temp = max;
                max = arr[i];
                secondMax = temp;
            }
            else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        System.out.println(secondLargest(arr));

    }
}
