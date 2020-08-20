import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question8Point4 {
    public static void main(String args[]){
        ArrayList<Integer> originalset = new ArrayList<Integer>();
        originalset.add(5);
        originalset.add(4);
        //originalset.add(3);
        //originalset.add(7);
        //originalset.add(8);
        //originalset.add(6);
        //originalset.add(5);
        ArrayList<ArrayList<Integer>> setofsets = subsetting(originalset,0);
        System.out.println(setofsets);
    }
    public static ArrayList<ArrayList<Integer>> subsetting(ArrayList<Integer> set, int index){
        ArrayList<ArrayList<Integer>> subsets;
        if (set.size()==index){
            subsets = new ArrayList<ArrayList<Integer>>();
            subsets.add(new ArrayList<Integer>());
        }else{
            subsets = subsetting(set, index+1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> extra = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer>subset : subsets){
                ArrayList<Integer> newsub = new ArrayList<Integer>();
                newsub.addAll(subset);
                newsub.add(item);
                extra.add(newsub);
            }
            subsets.addAll(extra);
        }
        return subsets;
    }
}
