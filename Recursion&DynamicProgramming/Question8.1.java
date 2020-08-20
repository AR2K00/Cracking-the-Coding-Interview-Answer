import java.util.Arrays;

public class Question8Point1 {
    public static void main(String args[]){
        int steps=10;
        int ways = countWays(steps);
        System.out.println(ways);

    }
    public static int countWays(int n) {
       int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }
    public static int countWays(int i, int[]memo) {
        if (i<0){
            return 0;
        }else if (i == 0) {
            return 1;
        }else if (memo[i] > -1) {
            return memo[i];
        }else{
            memo[i] = countWays(i - 1, memo) + countWays(i - 2, memo) + countWays(i - 3, memo);
            return memo[i];
    }}
}
