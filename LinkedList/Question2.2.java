//Find the kth to last element of a singly linked list
import java.util.Arrays;
import java.util.LinkedList;
public class Question2Point2 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
        int k = 2;
        int answer = find(k,list);
        System.out.println(answer);
    }
    public static int find(int k,LinkedList<Integer>list){
        int index = list.size() - k;
        int ans = list.get(index);
        return ans;
    }
}
