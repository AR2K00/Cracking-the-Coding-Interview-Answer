public class Question8Point7 {
    public static void main(String args[]){
        String s= "catrf";
        int answer = howmanyperms(s);
        System.out.println(answer);
    }
    public static int howmanyperms(String s){
        int orig = s.length();
        int origin=0;
        return number(orig, origin);
    }
    public static int number(int n, int orig){
        if (n<1){
        return 1;
        }else{
            orig= n*number(n-1,orig);
            }
        return orig;
    }}
