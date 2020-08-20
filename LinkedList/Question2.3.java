import java.util.*;
public class Question2Point3 {
    public static void main(String[] args){
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('a','b','c','d','e','f'));
        char node = 'c';
        int index = list.indexOf(node);
        if (index>0 && index<(list.size()-1)){
            list.remove(index);
        }
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
        }
    }
}
