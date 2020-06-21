import java.lang.reflect.Array;
import java.util.*;
public class Question1Point2 {
    public static void main(String[] args) {
        String str = "rat";
        String str2 = "tab";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        str = Arrays.toString(arr);
        str2 = Arrays.toString(arr2);
        if(str.equalsIgnoreCase(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
