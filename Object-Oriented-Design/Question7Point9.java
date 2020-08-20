import java.lang.reflect.GenericArrayType;

public class Question7Point9 {
    public static void main(String args[]){

    }
    public class IntCircArray{
        int[] array;
        int front;

        public IntCircArray(int length){
            array = new int[length];

        }
        public int convert(int index){
            if (index<0){
                index+= array.length;
            }
            return (front+index)%array.length;
        }
        public void rotate(int move){
            front = convert(move);
        }
    }
}
