//Successor:Write an alg
public class Question4Point6 {
    public static void main(String args[]){
        Question4Point6.tree original = new Question4Point6.tree(new Question4Point6.Node(6, null));
        original.root.left=new Question4Point6.Node(4, original.root);
        original.root.left.left=new Question4Point6.Node(3, original.root.left);
        original.root.left.left.left=new Question4Point6.Node(2, original.root.left.left);
        original.root.left.left.left.left= new Question4Point6.Node(1,original.root.left.left.left);
        original.root.left.right=new Question4Point6.Node(5, original.root.left);
        original.root.right=new Question4Point6.Node(9,original.root);
        original.root.right.right= new Question4Point6.Node(10, original.root.right);
        original.root.right.left= new Question4Point6.Node(8, original.root.right);
        original.root.right.left.left = new Question4Point6.Node(7, original.root.right.left);
        Node check = findNext(original.root.left);
        System.out.println(check.value);
    }

    static class tree {
        Question4Point6.Node root;

        tree(Question4Point6.Node r) {
            root = r;
        }
    }
    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point6.Node[] children;
        Question4Point6.Node left;
        Question4Point6.Node right;
        int value;
        Question4Point6.Node parent;

        Node(int v, Node p) {
            value = v;
            parent = p;
        }
    }
    public static Node findNext(Node first){
        Node firstright = first.right;
        if (firstright==null){
            Node original = first.parent;
            if(original==null){
                System.out.println("There is no node next");
                return first;
            }else{
                return first.parent;
            }
        }
        Node found = finding(firstright);
        return found;
    }
    public static Node finding(Node root){
        if (root==null){
            return null;
        }
        Node lefter  = finding(root.left);
        if (lefter==null) {
            lefter = root;
        }
        return lefter;
    }
}