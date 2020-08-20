public class Question8Point2 {
    public static void main(String args[]){

    }
    public class board{
        int rows;
        int columns;
        cell[][] cells = new cell[rows][columns];
    }
    public class cell{
        boolean allowed;
    }
    public class game{
        board gameboard;
        robot gambot;

        public void MoveDown(){
           // gambot.moveDown();
        }
    }
    public class robot{
        cell current;
        int currentRow=0;
        int currentColumn=0;

        public void moveDown(board newboard){
           // if (currentRow)
        }
    }
}
