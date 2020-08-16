//Check if a string is a permutation of a palindrome
import java.util.*;
public class Question1Point4 {
    public static void main(String[] args) {
         String str = "do geese see gop";
         String nospace = "";
         for(int i = 0; i<str.length(); i++){
             if (str.charAt(i) != ' '){
                 nospace = nospace+str.charAt(i); }}
         System.out.println(nospace);
         char[] sorted = nospace.toCharArray();
         Arrays.sort(sorted);
         int samecount = 0;
         int oddcounter = 0;
         for (int i = 0; i<sorted.length; i++){
             for(int j = i+1; j<sorted.length;j++){
                if (sorted[i] == sorted[j]){
                    samecount++;
                }else{
                    j=sorted.length;
                }
                i = i+samecount;
                if ((samecount+1)%2 !=0){
                    oddcounter++;
                }
                System.out.println(samecount);
             }
         }

         if (sorted.length %2 == 0){
             if (oddcounter>0){
                 System.out.println("False");
             }if (oddcounter==0){
                 System.out.println("True");
             }
         }else{
             if (oddcounter==1){
                 System.out.println("True");
             }else{
                 System.out.println("False");
             }
         }
    }
}
