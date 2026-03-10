package m1_more;

import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {5,7,0,8,6,6};

        ArrayList<Integer> makeshift = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                makeshift.add(arr[i]);
            }
        }


        for(int i=0;i<makeshift.size();i++){
            arr[i] = makeshift.get(i);
        }

       for(int i= makeshift.size();i<arr.length;i++) {
           arr[i] = 0;
       }

       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+ " ");
       }
    }
}
