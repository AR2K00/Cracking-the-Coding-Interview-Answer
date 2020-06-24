import java.util.Stack;

public class Question3Point5 {
    public static void main(String args[]){
        Stack<Integer>stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(0);
        stack.push(6);
        stack.push(11);
        stack.push(4);
        stack.push(0);
        System.out.print(stack);
        stack = sort(stack);
        System.out.print(stack);
    }
    public static Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack<>();
        int val = stack.size();
        System.out.println(val);
        int index=-1;
        while (stack2.size() != val) {
            int highest= stack.get(0);
            int i = 0;
            for ( ;i < stack.size(); i++) {
                if (stack.get(i) > highest){
                    highest = stack.get(i);
                    index = i;
                }
            }
            System.out.println("highest- "+highest);
            stack2.push(highest);
            //System.out.print(inde);
            System.out.println("size- "+stack.size());
            if (stack.size()>1){
                stack.remove(index);
            }
        }
        return stack2;
    }
}
