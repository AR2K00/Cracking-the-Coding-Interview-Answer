import java.util.*;
public class Question2Point4 {
    public static void main(String[] args){
        LinkedList<Integer>list = new LinkedList<>(Arrays.asList(3,5,8,5,10,2,1));
        int partition = 5;
        LinkedList<Integer>partitioned = new LinkedList<>();

        for (int i = 0; i<list.size(); i++){
            if (list.get(i)<partition){
                partitioned.add(list.get(i));
            }
        }
        for (int j = 0; j<list.size();j++){
            if (list.get(j)>=partition){
                partitioned.add(list.get(j));
            }
        }
        for (int g = 0; g<partitioned.size(); g++){
            System.out.print( partitioned.get(g)+ ", ");
        }
    }
}
