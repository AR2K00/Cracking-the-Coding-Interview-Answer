public class Question4Point12 {
    public static void main(String args[]){
        int sum = 30;
        Question4Point12.tree original = new Question4Point12.tree(new Question4Point12.Node(6, null));
        original.root.left=new Question4Point12.Node(4, original.root);
        original.root.left.left=new Question4Point12.Node(3, original.root.left);
        original.root.left.left.left=new Question4Point12.Node(2, original.root.left.left);
        original.root.left.left.left.left= new Question4Point12.Node(1,original.root.left.left.left);
        original.root.left.right=new Question4Point12.Node(5, original.root.left);
        original.root.right=new Question4Point12.Node(9,original.root);
        original.root.right.right= new Question4Point12.Node(10, original.root.right);
        original.root.right.left= new Question4Point12.Node(8, original.root.right);
        original.root.right.left.left = new Question4Point12.Node(7, original.root.right.left);
        int allOfpaths = pathCount(sum, original.root);
        System.out.println(allOfpaths);
    }
    static class tree {
        Question4Point12.Node root;

        tree(Question4Point12.Node r) {
            root = r;
        }
    }
        static class Node {
            static Integer lastChecked =  null;
            public String name;
            Question4Point12.Node[] children;
            Question4Point12.Node left;
            Question4Point12.Node right;
            int value;
            Question4Point12.Node parent;

            Node(int v, Question4Point12.Node p) {
                value = v;
                parent = p;
            }
        }
        static int pathCount(int equals, Node root){
            if (root == null){
                return 0;
            }
            int startpaths = pathsFromStart(root, equals, 0);

            int rootleftpaths = pathCount(equals, root.left);
            int rootrightpaths = pathCount(equals, root.right);

            int allPaths = startpaths+rootleftpaths+rootrightpaths;
            return allPaths;
        }
        static int pathsFromStart(Node start, int getto, int total){
            if (start==null){
                return 0;
            }
            total = total + start.value;

            int paths = 0;
            if (total==getto){
                paths++;
            }

            paths = paths + pathsFromStart(start.left, getto, total);
            paths += pathsFromStart(start.right, getto, total);
            return paths;

        }
}
