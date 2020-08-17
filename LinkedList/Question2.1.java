import java.util.Arrays;
import java.util.LinkedList;

public class Question2Point1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,10,4,3,4,3,2,1));
        for (int i = 0; i<list.size()-1;i++){
            for(int j = i+1; j<list.size(); j++){
                if (list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }
        for (int g = 0; g<list.size();g++){
            System.out.print(list.get(g)+", ");
        }
    }

}
