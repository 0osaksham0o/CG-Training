package m1_more;

import java.util.ArrayList;

public class Q16 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,5,6};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) list.add(arr[i]);
        }

        System.out.println(list.get((list.size()-1  )/2));
    }
}
