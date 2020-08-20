import java.util.*;
public class Question2Point5 {
    public static void main(String[] args){
        LinkedList<Integer>list1 = new LinkedList<>(Arrays.asList(1,3,4));
        LinkedList<Integer>list2 = new LinkedList<>(Arrays.asList(3,5,2));
        int number1 = unreverse(list1);
        int number2 = unreverse(list2);
        int fin = number1+number2;
        LinkedList<Integer> listfinal = compress(fin);
        System.out.print(listfinal);

    }
    public static int unreverse(LinkedList<Integer> list){
        String str = "";
        for (int i = list.size()-1; i>=0; i--){
            int var = list.get(i);
            str = str+String.valueOf(var);
        }
        int number = Integer.valueOf(str);

        return number;
    }
    public static LinkedList<Integer> compress(int answer){
        String ans = Integer.toString(answer);
        LinkedList<Integer>totallist = new LinkedList<>();
        for (int j = ans.length()-1;j>=0;j--){
            Character num = ans.charAt(j);
            String num2 = num.toString();
            int numfinal = Integer.valueOf(num2);
            totallist.add(numfinal);
        }
        return totallist;
    }
}
