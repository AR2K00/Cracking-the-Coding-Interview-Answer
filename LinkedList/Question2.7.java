import java.util.Arrays;
import java.util.LinkedList;

public class Question2Point7 {
    public static void main(String[] args) {
        LinkedList<Character> list1 = new LinkedList<>(Arrays.asList('a','d','e', 'c', 'b','d'));
        for (int i = 0;i<list1.size();i++){
            char been = list1.get(i);
            int last = list1.lastIndexOf(been);
            if (last!=i){
                System.out.println(list1.get(i));
            }
        }
    }   
}
