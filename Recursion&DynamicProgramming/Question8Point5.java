public class Question8Point5 {
    public static void main(String args[]){
        
    }
    public int minProduct(int a, int b){
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        return minProduct(smaller, bigger);
    }
    public int min(int smaller, int bigger){
        if (smaller==0){
            return 0;
        }else if (smaller==0){
            return bigger;
        }
        int s=smaller>>1;
        int side1 = minProduct(s, bigger);
        int side2 = side1;
        if (smaller%2==1){
            side2 = min(smaller-s, bigger);
        }
        return side1+side2;
    }
}
