//check if two strings are a permutation of each other
import java.lang.reflect.Array;
import java.util.*;
public class Question1Point2 {
    public static void main(String[] args) {
        String str = "rat";
        String str2 = "tab";
        //Converts both strings to arrays and sorts them, then checks if they are the same string after converting back to a string
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
