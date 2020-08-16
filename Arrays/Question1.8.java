//
import java.util.*;
public class Question1Point8 {
    public static void main(String[] args){
        int m=3;int n=4;
        int[][] matrix = new int[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0;j<n; j++){
              matrix[i][j] = 1;
            }}
        matrix[1][2] = 0;
        boolean[][]zero = new boolean[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0;j<n; j++){
                if (matrix[i][j]==0){
                    zero[i][j]=true;
                }
            }
        }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                if (zero[i][j]==true){
                    for (int g = 0; g<n;g++){
                        matrix[i][g] = 0;
                    }
                    for (int h = 0; h<m;h++){
                        matrix[h][j] = 0;
                    }
                }
            }
        }
        int a = matrix[2][2];
        int b = matrix[1][0];
        System.out.println(a);
        System.out.println(b);
    }
}
