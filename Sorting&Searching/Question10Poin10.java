import java.util.ArrayList;

public class Question10Poin10 {
    public void main(String args[]){

    }
    public class number{
        int num;
        int rank;

        number(int n){
            num = n;
        }
    }
    public void tracker(int n, ArrayList<number> nums){
        number numb = new number(n);
        if (nums.size()==0){
            numb.rank = 0;
            nums.add(numb.rank,numb);
            return;
        }else{
            for (int i = 0;i<nums.size()-1;i++) {
                if (n < nums.get(i).num) {
                    if (i==nums.size()-1&&n>nums.size()-1){
                        nums.add(nums.size(),numb);
                        return;
                    }
                    numb.rank++;


                }else{
                    nums.add(numb);
                    return;
                }
            }
        }
    }
    public int getrank(int i){
        //binary search the arraylist
       // for(int i = 0;)
        return 0;
    }
}
