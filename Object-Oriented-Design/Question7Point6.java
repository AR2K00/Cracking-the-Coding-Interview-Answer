//placespiece would take in two edges from two different pieces, check with fitsWith
//and then will place if they fit.This will register the two pieces in their correctspots
//in the jigsaw puzzle with check.This will continue till the user find the correct answer to the puzzle.

public class Question7Point6 {
    public static void main(String args[]){

    }

    public class jigsaw{
        piece[][]pieces;
        boolean[][]check;

        public void placepiece(edge e1, edge e2){

    }

        public boolean fitsWith(edge e1, edge e2){
            return true;
        }
    }
    public class piece{
        edge[]edges = new edge[4];
        int row;
        int column;

        public boolean contains(piece p, edge e1) {
            for (int i = 0;i<p.edges.length;i++){

            }
            return false;
        }

        piece(int r, int c){
            row = r;
            column = c;
        }
    }
    public class edge{
        int side;
    }
}
