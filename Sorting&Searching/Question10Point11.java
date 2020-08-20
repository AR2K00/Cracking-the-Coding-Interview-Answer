import java.util.ArrayList;
import java.util.Arrays;

public class Question10Point11 {
    public static void main(String[] args) {
        int[]array = new int[5];
        for(int i = 0; i<5; i++){
            array[i] = i;
        }
    }
    void ValleySort(int[]a){
        Arrays.sort(a);
        for (int i  =1;i<a.length; i +=2){
            Switch(a, i,i-1);
        }
    }
    void Switch(int[]arr, int right,int  left){
        int placehold =arr[left];
        arr[left] = arr[right];
        arr[right]= placehold;
    }

}
