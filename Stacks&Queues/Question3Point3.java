//Create a set of stacks that has a certain capacity till a new stack starts
import java.util.ArrayList;
import java.util.Stack;

public class Question3Point3 {
    public static void main(String[] args) {
        StackofStacks newStack = new StackofStacks();
        newStack.init(2);
        newStack.pushmini(5);
        newStack.pushmini(4);
        newStack.pushmini(3);
        newStack.pushmini(4);
        newStack.pushmini(3);
        newStack.pushmini(5);
        newStack.pop();
        newStack.popat(2);
        newStack.pushmini(7);
        newStack.print();

    }
    private static class StackofStacks{
        ArrayList<Stack<Integer>> bigStack = new ArrayList<>();
        int threshold = 0;

        public void init (int x){
            this.threshold=x;
        }
        public void pushmini(int newInt){
            if (bigStack.size()==0){
                push();
            }
            if (bigStack.get(bigStack.size()-1).size()<threshold){
                bigStack.get(bigStack.size()-1).push(newInt);
            }else{
                push();
                bigStack.get(bigStack.size() - 1).push(newInt);
            }
        }
        public void push(){
            bigStack.add(new Stack<>());
        }
        public void pop(){
            bigStack.remove(bigStack.size()-1);
        }
        public void popat( int index){
            bigStack.remove(bigStack.size()-(index-1));
        }
        public void print(){
           System.out.println(bigStack.toString());
        }
    }
}
