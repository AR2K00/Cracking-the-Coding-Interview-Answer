import javax.xml.stream.events.StartDocument;

public class Question4Point2 {
    public static void main(String args[]){
        int[] array = new int[10];
        for(int i = 0; i<10;i++){
            array[i] = i;
        }
        Node root = Start(array);
        tree newtree = new tree(root);

    }
    public static Node MakeTree(int[] array, int top, int bottom){
        if (bottom<top){
            return null;
        }
        int rootmid = (top+bottom)/2;
        Node root = new Node(array[rootmid]);
        root.left = MakeTree(array, top, rootmid-1);
        root.right = MakeTree(array, rootmid+1, bottom);
        return root;
    }
    public static Node Start(int[] array){
        return MakeTree(array, 0, array.length-1);
    }
    static class tree{
        Node root;

        tree(Node r){
            root = r;
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
}
