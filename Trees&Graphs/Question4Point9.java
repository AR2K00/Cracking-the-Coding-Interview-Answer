import com.sun.source.tree.BreakTree;

public class Question4Point9 {
    public static void main(String args[]){
        Question4Point9.tree original = new Question4Point9.tree(new Question4Point9.Node(6, null));
        original.root.left=new Question4Point9.Node(4, original.root);
        original.root.left.left=new Question4Point9.Node(3, original.root.left);
        original.root.left.left.left=new Question4Point9.Node(2, original.root.left.left);
        original.root.left.left.left.left= new Question4Point9.Node(1,original.root.left.left.left);
        original.root.left.right=new Question4Point9.Node(5, original.root.left);
        original.root.right=new Question4Point9.Node(9,original.root);
        original.root.right.right= new Question4Point9.Node(10, original.root.right);
        original.root.right.left= new Question4Point9.Node(8, original.root.right);
        original.root.right.left.left = new Question4Point9.Node(7, original.root.right.left);
        Question4Point9.tree derived = new Question4Point9.tree(new Question4Point9.Node(3, null));
        derived.root.left=new Question4Point9.Node(2, derived.root);
        derived.root.left.left=new Question4Point9.Node(1, derived.root.left);
        //derived.root.left.left.left = new Question4Point9.Node(1, derived.root.left.left);
        //derived.root.right = new Question4Point9.Node(5, derived.root);
        boolean check = checkfortree(original.root, derived.root);
        System.out.println(check);
    }

    static class tree {
        Question4Point9.Node root;
        tree(Question4Point9.Node r) {
            root = r;
        }
    }

    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point9.Node[] children;
        Question4Point9.Node left;
        Question4Point9.Node right;
        int value;
        Question4Point9.Node parent;

        Node(int v, Question4Point9.Node p) {
            value = v;
            parent = p;
        }
    }
    public static boolean checkfortree(Node node1, Node node2){
        if (node2 == null){
            return true;
        }
        return contains(node1, node2);
    }
    public static boolean contains(Node n1, Node n2){
        if (n1 == null){
            return false;
        }else if(n1.value==n2.value && matching(n1,n2)){
            return true;
        }
        return contains(n1.left, n2) || contains(n1.right, n2);
    }
    public static boolean matching(Node n1, Node n2){
        if (n1 == null && n2 == null){
            return true;
        }else if (n1==null || n2==null){
            return false;
        }else{
            return matching(n1.left, n2.left) && matching(n1.right, n2.right);
        }
    }
}
