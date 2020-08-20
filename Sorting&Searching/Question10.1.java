public class Question10Point1 {
    public static void main(String args[]){
        int[] B = new int[6];
        int[] A = new int[6+B.length];
        int j = 2;
        for (int i = 0; i<A.length-B.length;i++){
            A[i] = j;
            j=j+3;
        }
        B[0] = 1;
        B[1] = 2;
        B[2] = 3;
        B[3] = 4;
        B[4] = 4;
        B[5] = 5;
        merge(B.length-1, A.length-B.length-1,B, A,A.length-1);

        for (int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    public static void merge(int Bi, int Ai, int[]B, int[]A, int Atrack){
        if (Atrack==-1){
            return;
        }else if (Ai==-1){
            while (Bi>=0){
                A[Bi]=B[Bi];
                Bi--;
            }
            return;
        }else if (Bi==-1){
            return;
        }
        if (B[Bi] <A[Ai]){
            A[Atrack]= A[Ai];
            A[Ai] = -1;
            merge(Bi, Ai-1, B,A,Atrack-1);
        }else{
            A[Atrack] = B[Bi];
            merge(Bi-1, Ai, B, A, Atrack-1);
        }
    }
}
