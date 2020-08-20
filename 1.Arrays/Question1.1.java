// Check if a string has all unique characters, using no other data structure
import java.util.*;
public class Question1Point1 {
    public static void main(String[] args) {
        String test = "red";
        boolean check = true;
        for (int i = 0; i< test.length()-1; i++){
            for( int j =i+1; j<test.length(); j++){
                if(test.charAt(i) == test.charAt(j)){
                    check = false;
                    break;
                }
            }
        }
        //check answer
        System.out.println(check);
        }
    }

