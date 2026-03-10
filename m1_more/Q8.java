package m1_more;

import java.util.LinkedHashSet;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {11,11,11,13,13,20};

        LinkedHashSet<Integer>set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
