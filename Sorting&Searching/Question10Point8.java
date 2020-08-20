import java.util.ArrayList;
import java.util.Arrays;

public class Question10Point8 {
    public void main(String args[]){
        int N=85;
        int[] arr = new int[100];
        int extras = arr.length-N;
        ArrayList<Integer> made = new ArrayList<>();
        Arrays.sort(arr);
            for (int i = 0; i < arr.length-1; i++) {
                if (extras==0){
                    break;}
                if (arr[i]==arr[i+1]){
                    extras--;
                    made.add(i+1);}
            }
    }

}
