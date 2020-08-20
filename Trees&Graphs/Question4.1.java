import java.util.ArrayList;


public class Question4Point1 {
    public static void main(System args[]){
        Graph graph = new Graph();
    }
    static class Graph{
        public ArrayList<Node> nodes;
        boolean visiting= false;

        void findPath(Node root, Node end){
            if (root==end){
                System.out.println("There is a path");
                visiting= true;
                return;
            }
            visit(root);
            for (int i=0; i<root.adjacent.length;i++) {
                Node neighbor=root.adjacent[i];
                if (neighbor.visited==false){
                    visit(neighbor);
                    if (visiting=false){
                    findPath(neighbor,end);}
                }
            }
            if (visiting = false){
            System.out.println("There is no path;");
        }}
        void visit(Node node){node.visited=true;}
    }
    }
    class Node{
        public String name;
        public Node[] adjacent;
        boolean visited;

       public Node(String n,Node[]a){
            visited= false;
            name = n;
            adjacent = a;
        }

}

