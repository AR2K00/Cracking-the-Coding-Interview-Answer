public class Question7point10 {
    public static void main(String args[]){

    }
    public class Game{
        int rows;
        int columns;
        Board board;
        boolean bombfound= false;
        boolean win= false;

        public void Game(int r, int c, Board b){
            rows = r;
            columns = c;
            board =b;
        }

        public void CheckWin(boolean flipper){
            if (flipper == true){
                bombfound=true;
            }if (board.cellsleft==0){
                win=true;
            }
        }
    }
    public class Board {
        Cell[][] boared;
        int bombnumber;
        int cellsleft;

        public boolean chooseFlip(Cell cell){
            return cell.check();
            //Also sets cell to number and Prints number or blank
        }
        public void chooseFlag(Cell cell){
             cell.setflag();
        }

    }
    public class Cell{
        int row;
        int column;
        int number;
        boolean bomb;
        boolean shown;
        boolean flag;

        public Cell(int r, int c, boolean b){
            row = r;
            column = c;
            bomb = b;
            flag = false;
        }
        public boolean check(){
            shown = true;
            return bomb;
        }
        public void setflag(){
            flag = true;
        }
    }
    public class User{
        Game game;

        User(Game g){
            game = g;
        }
        public void nextTurn(){
            //takes in user input
            int userrow = 0; //using 0 as standin
            int usercolumn = 0;//using 0 as standin
            boolean userflip = true;//using true as standing
            makeDecision(userrow,usercolumn,userflip);
            if (game.bombfound==false&&game.win==false){
                nextTurn();
            }else{
                if (game.bombfound==true){
                    System.out.println("You lose");
                }else{
                    System.out.println("You win");
                }
            }
        }

        public void makeDecision(int row, int column, boolean flip){
            if (flip==true){
                game.CheckWin(game.board.chooseFlip(game.board.boared[row][column]));
            }else{
                game.board.chooseFlag(game.board.boared[row][column]);
            }
        }
    }

}
