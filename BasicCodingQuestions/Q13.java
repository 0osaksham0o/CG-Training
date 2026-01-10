package BasicCodingQuestions;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str.replaceAll(" ","-"));
    }

}
