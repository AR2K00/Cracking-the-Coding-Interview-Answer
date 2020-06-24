import javax.swing.*;

public class Question4Point4 {
    public static void main(String args[]){
        Question4Point4.tree original = new Question4Point4.tree(new Question4Point4.Node(5));
        original.root.left=new Question4Point4.Node(3);
        original.root.left.left=new Question4Point4.Node(4);
        original.root.left.right=new Question4Point4.Node(5);
        original.root.right=new Question4Point4.Node(3);
        original.root.right.right= new Question4Point4.Node(4);
        original.root.right.left= new Question4Point4.Node(7);
        boolean check = checkBST(original.root, null);
        System.out.println(check);
    }
    static class tree {
        Question4Point4.Node root;

        tree(Question4Point4.Node r) {
            root = r;
        }

        public tree() {

        }

        @Override
        public String toString() {
            return "tree{}";
        }
    }
        public static boolean checkBST(Node b, Integer last_check){
            if (b==null){
                return true;
            }
            if (!checkBST(b.left, last_check)){
                return false;
            }
            if (last_check != null && b.value<=last_check){
                return false;
            }
            last_check =b.value;
            if (!checkBST(b.right, last_check)){
                return false;
            }
            return true;
        }

    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point4.Node[] children;
        Node left;
        Node right;
        int value;

        Node(int v) {
            value = v;
        }
    }
}
