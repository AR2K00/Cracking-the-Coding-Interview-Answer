import java.util.*;
public class Question1Point7 {
    public static void main(String[] args){
        int n=3;
        int[][] rotate = new int[n][n];
        rotate[0][0]=1;
        rotate[0][1]=5;
        rotate[0][2]=4;
        rotate[1][0]=1;
        rotate[1][1]=5;
        rotate[1][2]=6;
        rotate[2][0]=7;
        rotate[2][1]=8;
        rotate[2][2]=9;

        int len = rotate.length;
        for (int i = 0; i<len/2;i++){
            int first = i;
            int last = len - 1 - i;
            for (int j = first; j<last; j++){
                int offset = i-first;
                int top = rotate[first][j];
                rotate[first][j] = rotate[last-offset][first];
                rotate[last-offset][first] = rotate[last][last-offset];
                rotate[last][last-offset] = rotate[j][last];
                rotate[j][last] = top;

            }
        }
        System.out.println(rotate[0][0]);
        System.out.println(rotate[0][1]);
        System.out.println(rotate[0][2]);
        System.out.println(rotate[1][0]);
        System.out.println(rotate[1][1]);
        System.out.println(rotate[1][2]);
        System.out.println(rotate[2][0]);
        System.out.println(rotate[2][1]);
        System.out.println(rotate[2][2]);
    }
}
