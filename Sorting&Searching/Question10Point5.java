public class Question10Point5 {
    public void main(String args[]){
        String[]str = new String[11];
        str[0] = "ate";
        str[1] = "";
        str[2] = "bad";
        str[3] = "";
        str[4] = "cat";
        str[5] = "";
        str[6] = "dog";
        str[7] = "eat";
        str[8] = "";
        str[9] = "got";
        str[10] = "";
        String st = "got";
        int index = searchFor(str, st, 0,str.length-1 );
        if (index!=-1){
            System.out.println(index);
        }else{
            System.out.println("Cant find.");
        }
    }
    int searchFor(String[]strings, String s, int first, int last){
        if (first>last){
            return -1;
        }
        int middle = (last+first)/2;
        if (strings[middle] == ""){
            int left= middle-1;
            int right = middle+1;
            while(true){
                if(left<first && right>last){
                    return -1;
                }else if (right <= last && strings[right]!=""){
                    middle=right;
                    break;
                }else if (left>= first && strings[left]!=""){
                    middle=left;
                    break;
                }
                right++;
                left--;
            }
        }
        if (s==strings[middle]){
            return middle;
        }else if (strings[middle].compareTo(s)<0){
            return searchFor(strings,s,middle+1, last);
        }else{
            return searchFor(strings,s,first, middle -1);
        }
    }
    int searchFor(String[]strings, String s){
        if (strings==null || s == null|| s== ""){
            return -1;
        }
        return searchFor(strings,s,0,strings.length-1);
    }
}
