public class Question10Point4 {
    public static void main(String args[]){
        int[]array = new int[50];

    }
    public static int findNum(int number, int[] arrayy){
        int size = findSize(number,arrayy);
        if (elementAt(size, arrayy)==number){
            return size; }
        //do binary search now with the size
        int answer = BinarySearch(number, arrayy, size-1, 0);
        return answer;
    }
    public static int BinarySearch(int num, int[]a, int high, int low){
        int ans = 8;
        return ans;
    }
    public static int findSize(int num, int[]a){
        for (int i =0; i<100000;i=i+50){
            if (elementAt(i, a)==-1){
                for (int j=i-50; j<i; j=j+10){
                    if (elementAt(j,a)==-1){
                        for (int k=j-10;k<j;k++){
                            if (elementAt(k,a)==-1){
                                return k;
                            }else if(elementAt(k,a)==num){
                                return k;
                            }
                        }
                    }else if(elementAt(j,a)==num){
                        return j;
                    }
                }
            }else if(elementAt(i, a)==num){
                return i;
            }
        }
        return -1;
    }
    public static int elementAt(int i, int[]ar){
        if (i>(ar.length-1)){
            return -1;
        }
        return ar[i];
    }
}
