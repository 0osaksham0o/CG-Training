package BasicCodingQuestions;
import java.util.*;

import java.util.Scanner;

public class Q15 {
    static void removeDuplicates(int[] arr){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
                continue;
            }
            set.add(arr[i]);
        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        removeDuplicates(arr);
    }
}
