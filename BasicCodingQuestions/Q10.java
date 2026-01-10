package BasicCodingQuestions;

import java.util.Scanner;

public class Q10 {
    static int GCD(int x,int y){
        int loop = Math.max(x,y);
        for(int i =loop;i>0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int GCD = GCD(x,y);
        int LCM = (x*y)/GCD;
        System.out.println("LCM and GCD of "+ x + " and " + y + " is: " + LCM +" "+ GCD);
    }

}
