//Replace all spaces in a string with '%20'
import java.util.*;

public class Question1Point3 {
    public static void main(String[] args) {
        String str = "g rt hhhh mmmm   iii";
        char[] arr = str.toCharArray();
        int space = 32;
        int count = 0;
        String str1 = "";


        for (int i = 0; i < str.length(); i++) {
            char v1 = str.charAt(i);
            int var = str.charAt(i);

            if (var == space) {
                arr[i] = '%';
                count++;
                str1=str1+"%20";
            }
            else
            {
                str1= str1+v1;
            }
        }
        System.out.println(str1);
        char[] arr2 = new char[2*count + str.length()];
        int j = 0;
        for (int i = 0; i<arr.length; i++){
            arr2[j] = arr[i];
            if (arr2[j]=='%'){
                arr2[j+1] = '2';
                arr2[j+2] = '0';
                j=j+2;
            }
            j++;
        }
        String finished = Arrays.toString(arr2);
        System.out.println(finished);
    }
}


