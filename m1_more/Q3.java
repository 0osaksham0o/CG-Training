package m1_more;

public class Q3 {
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int count = 0;
        String s = "101101110";
        String result = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
            if(s.charAt(i)=='0'){
                result = result + arr[count-1];
                count = 0;
            }
        }

        System.out.println(result);

    }
}
