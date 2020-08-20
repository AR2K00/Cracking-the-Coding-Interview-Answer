//Binary search tree class with an insert, find, delete, and getRandomNode
import java.util.ArrayList;
import java.util.Random;

public class Question4Point11 {
    public static void main(String args[]){
        Question4Point11.tree original = new Question4Point11.tree(new Question4Point11.Node(6, null));
        original.root.left=new Question4Point11.Node(4, original.root);
        original.root.left.left=new Question4Point11.Node(3, original.root.left);
        original.root.left.left.left=new Question4Point11.Node(2, original.root.left.left);
        original.root.left.left.left.left= new Question4Point11.Node(1,original.root.left.left.left);
        original.root.left.right=new Question4Point11.Node(5, original.root.left);
        original.root.right=new Question4Point11.Node(9,original.root);
        original.root.right.right= new Question4Point11.Node(10, original.root.right);
        original.root.right.left= new Question4Point11.Node(8, original.root.right);
        original.root.right.left.left = new Question4Point11.Node(7, original.root.right.left);
        //tree.insert(original.root.right.right, 11);
        tree.delete(original.root.left);
        System.out.println(original.root.left.value);
    }
    static class tree {
        Question4Point11.Node root;
        tree(Question4Point11.Node r) {
            root = r;
        }

        public static void insert(Node after, int value){
            Node node = after.parent;
            Node tobe = new Node(value, after.parent);
            if (after.parent.right==after){
                after.parent.right = tobe;
                tobe.right = after;
            }else{
                after.parent.left = tobe;
            }
            after.parent = tobe;
        }
        static Node find(int value, Node search) {
            if (search != null && search.value != value) {
                find(value, search.left);
                find(value, search.right);
            } else {
                return search;
            }
            System.out.println("Nothing was found");
            return null;
        }
        static void delete(Node todel){
            Node root = todel.left;
            Node rightroot = todel.right;
            if (root !=null){
                root.parent= todel.parent;
                if (rightroot!=null){
                    root.right = rightroot;
                }
            }else if(rightroot!=null){
                rightroot.parent = todel.parent;
            }
            todel.parent= null;
            todel.right= null;
            todel.left = null;
        }
        static void findrandom(tree original){
            ArrayList<Node> nodes = new ArrayList<>();
            addin(nodes, original.root);
            Random rand = new Random();
            int x = rand.nextInt(nodes.size());
            System.out.println(nodes.get(x).value);
        }
        public static void addin(ArrayList<Node>all, Node next){
            if (next==null){return;}
                all.add(next);
                addin(all,next.left);
                addin(all,next.right);
        }
    }

    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point11.Node[] children;
        Question4Point11.Node left;
        Question4Point11.Node right;
        int value;
        Question4Point11.Node parent;

        Node(int v, Question4Point11.Node p) {
            value = v;
            parent = p;
        }
    }
}
