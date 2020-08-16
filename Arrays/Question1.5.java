import java.util.*;
public class Question1Point5 {
    public static void main(String[] args){
        String str1 = "play";
        String str2 = "play";
        int changecount = 0;
        if (str1.length()==str2.length()){
            for (int i =0; i<str1.length()-1; i++){
                if (str1.charAt(i)!=str2.charAt(i)){
                    changecount++;
                } }
        } else if (str1.length()>str2.length()){
            if(str1.length()- str2.length()==1){
                int j = 0;
                for (int i = 0; i<str1.length()-1;i++){
                    if (str1.charAt(i)!=str2.charAt(j)){
                        changecount++;
                        j--;
                    }
                    j++;
                }
                if (changecount==0){
                    changecount++;
                }
            }else{
                changecount = 2;
            }
        } else if(str2.length()>str1.length()){
            if (str2.length()-str1.length()==1){
                int j = 0;
                for (int i = 0; i<str2.length()-1;i++){
                    if (str2.charAt(i)!=str1.charAt(j)){
                        changecount++;
                        j--;
                        System.out.println("change-"+i);
                    }
                    j++;
                }
                if (changecount==0){
                    changecount++;
                }
            }else{
                changecount = 2;
            }
        }
        if (changecount>1||changecount<1){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
