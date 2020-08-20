import java.lang.reflect.Array;

public class Question8Point10 {
    public static void main(String args[]){

    }

    public class screen{
        int size;
        block[][] screeen= new block[size][size];

        public void changeColor(int row1,int column1, String colorr){

            screeen[row1][column1].color = colorr;
        }
        public void changeSurround(block b, String newCol){
            int r = b.row - 1;
            int c = b.column -1;
            changeSurrounding(b, r, c, newCol);
        }
        public void changeSurrounding(block b, int firstrow, int firstcol, String newColor){
            if (firstrow==b.row+2 ||firstcol==b.column+2){
                return;
            }
            changeColor(firstrow, firstcol, newColor);
            changeSurrounding(b, firstrow+1, firstcol, newColor);
            changeSurrounding(b, firstrow, firstcol+1, newColor);
        }
    }
    public class block{
        String color;
        int row;
        int column;
    }

}
