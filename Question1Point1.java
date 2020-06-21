import java.util.*;
// How to check if a string has all unique characters, using no other data structure
public class Question1Point1 {
    public static void main(String[] args) {
        String str = "red";
        boolean check = true;
        for (int i = 0; i< str.length()-1; i++){
            for( int j =i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    check = false;
                    break;
                }
            }
        }
        System.out.println(check);
        int val = str.charAt(2);
        System.out.println(val);
        }
    }

