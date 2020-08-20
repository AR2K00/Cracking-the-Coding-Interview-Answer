public class Question7Point8 {
    public static void main(String args[]){

    }
    public class Game{
        player[] players;
        board boardd;
        int rows = 10;
        int columns = 10;

    private Game(){
      //  boardd = new board;
    }
    }
    public class board{
        int blacknumber = 0;
        int whitenumber = 0;
        piece[][]taken;


        //public
    }
    public class piece{
        String color;
    }
    public class player{
        String name;
        String color;
        boolean win = false;

        public void placepiece(board current, piece toadd, int roww, int coulumn, Game gam){
            current.taken[roww][coulumn] = toadd;
            boolean val = checkfor(current,roww,coulumn,toadd);
            if (toadd.color=="black"){
            current.blacknumber++;}
            if (toadd.color=="white"){
                current.whitenumber++;
            }
            if (val==true){
                //continue game
            }
            if (val==false){
                if(current.blacknumber>current.whitenumber){
                    for (player play: gam.players){
                        if (play.color=="black"){
                            System.out.println(play + " wins!");
                        }
                    }
                }if(current.blacknumber<current.whitenumber){
                    for (player play: gam.players){
                        if (play.color=="white"){
                            System.out.println(play + " wins!"); }}}
                }else{
                System.out.println("Tie");
            }
        }
        public boolean checkfor(board current, int row, int column, piece currntly){
            //checks for a conversion
            //returns true for conversion, false for no conversion
            return false;
        }
    }
}
