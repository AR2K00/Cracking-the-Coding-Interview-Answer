public class Question10Point9 {
    public static void main(String args[]){
        int N=10;
        int M=10;
        int[][] doublemat = new int[N][M];
        int finder= 50;
        pair answer = find(doublemat, finder);
        System.out.println(answer.firstvalue);
        System.out.println(answer.secondvalue);
    }
    public static pair find(int[][] mat, int num){
     int row=0;
     int column = mat[0].length-1;
     while(row<mat.length && column>=0){
         if (mat[row][column]==num){
             return new pair(row,column);
         }else if(mat[row][column]>num){
             column--;
         }else{
             row++;
         }
     }
     return null;
    }
    public static class pair{
        int firstvalue;
        int secondvalue;

        pair(int fv, int sv){
            firstvalue=fv;
            secondvalue=sv;
        }
    }


}
