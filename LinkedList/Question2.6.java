//Check if a linked list is a palindrome
import java.util.Arrays;
import java.util.LinkedList;

public class Question2Point6 {
    public static void main(String[] args) {
        LinkedList<Character> list1 = new LinkedList<>(Arrays.asList('a','c','b','a'));
        boolean check = true;
        for (int i =0;i<list1.size();i++){
            if (list1.get(i) != list1.get(list1.size()-1-i)){
                check = false;
            }
        }
        if (check == false){
            System.out.println("Not a palindrome");
        }else{
            System.out.println("Palindrome");
        }

    }
}
