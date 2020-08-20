import javax.swing.*;
import java.util.ArrayList;

public class Question4Point8 {
    public static void main(String args[]){
        Question4Point8.tree original = new Question4Point8.tree(new Question4Point8.Node(6, null));
        original.root.left=new Question4Point8.Node(4, original.root);
        original.root.left.left=new Question4Point8.Node(3, original.root.left);
        original.root.left.left.left=new Question4Point8.Node(2, original.root.left.left);
        original.root.left.left.left.left= new Question4Point8.Node(1,original.root.left.left.left);
        original.root.left.right=new Question4Point8.Node(5, original.root.left);
        original.root.right=new Question4Point8.Node(9,original.root);
        original.root.right.right= new Question4Point8.Node(10, original.root.right);
        original.root.right.left= new Question4Point8.Node(8, original.root.right);
        original.root.right.left.left = new Question4Point8.Node(7, original.root.right.left);
        Node intersection = Intersection(original, original.root.left.left, original.root.left.right);
        System.out.println(intersection.value);
    }
    static class tree {
        Question4Point8.Node root;

        tree(Question4Point8.Node r) {
            root = r;
        }
    }
    static class Node {
        static Integer lastChecked =  null;
        public String name;
        Question4Point8.Node[] children;
        Question4Point8.Node left;
        Question4Point8.Node right;
        int value;
        Question4Point8.Node parent;

        Node(int v, Question4Point8.Node p) {
            value = v;
            parent = p;
        }
    }
    public static Node Intersection(tree original, Node first, Node second){
        ArrayList<Node>trace1 = new ArrayList<>();
        Node connect = findIntersection(original, first, second, trace1);
        return connect;
    }
    public static Node findIntersection(tree treeee, Node root1, Node root2, ArrayList<Node>parents){
        Node end = traverseParent(treeee, root1, parents);
        int check = 0;
        Node intersect = traverseParents(treeee, root2, parents, check);
        return intersect;
    }
    public static Node traverseParent(tree travelthrough, Node nodee, ArrayList<Node>parenting){
        if (nodee==null){
            return null;
        }else{
        parenting.add(nodee);}
        Node parent = traverseParent(travelthrough, nodee.parent, parenting);
        if (parent == null){
            return nodee;
        }
        return parent;
    }
    public static Node traverseParents(tree original, Node secondroot, ArrayList<Node>paren, int check){
        if (secondroot==null){
            return null;
        }else{
            for (int i = 0; i<paren.size();i++){
                if (secondroot==paren.get(i)){
                    check=-1;
                    return null;
                }else{
                    return secondroot.parent;
                }
            }
        }
        Node parent = traverseParent(original, secondroot, paren);
        if (parent == null&& check ==-1){
            return secondroot;
        }else if (parent == null&& check == 0){
            return null;
        }
        return null;
    }

}
