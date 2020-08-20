import java.util.ArrayList;
import java.util.LinkedList;

//Check Balanced
public class Question4Point5 {
    public static void main(String args[]){
        Question4Point5.tree original = new Question4Point5.tree(new Question4Point5.Node(5));
        original.root.left=new Question4Point5.Node(3);
        original.root.left.left=new Question4Point5.Node(4);
        original.root.left.left.left=new Question4Point5.Node(5);
        original.root.left.left.left.left= new Question4Point5.Node(6);
        original.root.left.right=new Question4Point5.Node(5);
        original.root.right=new Question4Point5.Node(3);
        original.root.right.right= new Question4Point5.Node(4);
        original.root.right.left= new Question4Point5.Node(7);
        boolean check = isbal(original);
        System.out.println(check);
    }

    static class tree {
        Question4Point5.Node root;

        tree(Question4Point5.Node r) {
            root = r;
        }
    }
    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point5.Node[] children;
        Question4Point5.Node left;
        Question4Point5.Node right;
        int value;

        Node(int v) {
            value = v;
        }
    }
    public static void  MakeTree(Question4Point5.Node root, ArrayList<LinkedList<Question4Point5.Node>>pushto, int depth, int count){
        if (root==null) return;
        LinkedList<Question4Point5.Node> depthlist = null;
        if (depth != pushto.size()){
            depthlist=pushto.get(depth);
        }else{
            depthlist = new LinkedList<Question4Point5.Node>();
            pushto.add(depthlist);
        }
        depthlist.add(root);
        System.out.println("before left");
        MakeTree(root.left, pushto, depth+1, count);
        System.out.println("before right");
        MakeTree(root.right, pushto, depth+1, count);
    }
    public static boolean isbal(Question4Point5.tree original){
        if (height(original.root) ==-100000){
            return false;
        }else{
        return true;
    }}
    public static int height(Question4Point5.Node root) {
        if (root == null) return -1;
        int left = height(root.left);
        if (left == -100000) {
            return -100000;
        }
        int right = height(root.right);
        if (right == -100000) {
            return -100000;
        }
        int checkbal = left - right;
        int checkbalopp = right - left;
        boolean checker = false;
        if (checkbal == 1 || checkbal == 0 || checkbalopp == 1 || checkbal == -1 || checkbalopp == -1) {
            checker = true;
        }
        if (checker == false) {
            return -100000;
        } else {
            if (left > right) {
                return left + 1;
            } else if (right > left) {
                return right + 1;
            } else if (left == right) {
                return left + 1;
            }
        }
        return 0;
    }
}
