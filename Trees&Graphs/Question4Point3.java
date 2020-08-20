import java.util.ArrayList;
import java.util.LinkedList;

public class Question4Point3 {
    public static void main(String args[]){
        ArrayList<LinkedList<Node>> answer = new ArrayList<>();
        tree original = new tree(new Node(5));
        original.root.left=new Node(3);
        original.root.left.left=new Node(4);
        original.root.left.right=new Node(5);
        original.root.right=new Node(3);
        original.root.right.right= new Node(4);
        original.root.right.left= new Node(7);
        answer = Create(original.root, answer);
        System.out.println(answer.get(0).get(0).value);
        System.out.println(answer.get(1).get(0).value);
        System.out.println(answer.get(1).get(1).value);
        System.out.println(answer.get(2).get(0).value);
        System.out.println(answer.get(2).get(1).value);
        System.out.println(answer.get(2).get(2).value);
        System.out.println(answer.get(2).get(3).value);


    }
    static class tree{
        Node root;

        tree(Node r){
            root = r;
        }

        public tree() {

        }

        @Override
        public String toString() {
            return "tree{}";
        }
    }

    static class Node {
        public String name;
        Node[] children;
        Node left;
        Node right;
        int value;

        Node(int v) {
            value = v;
        }
    }

    public static void  MakeTree(Node root, ArrayList<LinkedList<Node>>pushto, int depth, int count){
        if (root==null) return;
        LinkedList<Node> depthlist = null;
        if (depth != pushto.size()){
            depthlist=pushto.get(depth);
        }else{
            depthlist = new LinkedList<Node>();
            pushto.add(depthlist);
        }
        depthlist.add(root);
        System.out.println("before left");
        MakeTree(root.left, pushto, depth+1, count);
        System.out.println("before right");
        MakeTree(root.right, pushto, depth+1, count);
    }
    public static ArrayList<LinkedList<Node>> Create(Node root, ArrayList<LinkedList<Node>> pushing){
        int count = 0;
        MakeTree(root, pushing, 0, count);
        return pushing;
    }
}
