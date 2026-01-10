package BasicCodingQuestions;
import java.util.Arrays;
public class Q24 {
    static int[][] transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] trans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(Arrays.deepToString(transpose(arr)));
    }
}
