import java.util.*;
public class Question1Point6 {
    public static void main(String[] args){
        String str = "sssssollveeeeee";
        str.toLowerCase();
        String str2 = "";
        str2 = str.charAt(0)+ str2;
        int count =1;
        for (int i = 1; i<str.length(); i++){
            if (str.charAt(i-1)==str.charAt(i)){
                count++;
            }else{
                str2 = str2 + count;
                count=1;
                str2= str2 + str.charAt(i);
            }
        }
        str2 = str2 + count;
        if (str2.length()<str.length()){
            System.out.println(str2);
        }else{
            System.out.println(str);
        }
    }

}
