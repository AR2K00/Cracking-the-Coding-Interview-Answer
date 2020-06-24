import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Stack;

public class Question3Point4 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(2);
        queue.peek();
        queue.remove();
        queue.peek();
        queue.write();
    }
    public static class MyQueue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void add(int Inte){
            stack1.push(Inte);
        }
        public void remove(){
            stack1.remove(stack1.size()-1);
        }
        public void peek(){
            reverse();
            int var = stack2.peek();
            System.out.println(var);
        }
        public boolean isEmpty(){
            boolean check = stack2.isEmpty();
            return check;
        }
        public void reverse(){
            stack2.removeAllElements();
            for (int i = 0;i<stack1.size();i++){
                stack2.push(stack1.get(i));
            }
        }
        public void write(){
           String here = stack2.toString();
           System.out.println(here);
        }
    }

}
