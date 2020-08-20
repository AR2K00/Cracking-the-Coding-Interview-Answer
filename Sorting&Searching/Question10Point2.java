import java.util.Arrays;

public class Question10Point2 {
    public static void main(String args[]) {
        int total = 5;
        String[] strings = new String[total];
        strings[0] = "tagr";
        strings[1] = "gart";
        strings[2] = "trag";
        strings[3]= "rat";
        strings[4] = "tar";
        for (int i = 0; i < strings.length; i++) {
            String st = strings[i];
            strings[i] = sorter(st);
            System.out.println(strings[i]);
        }
        String[] newarr = new String[total];
        String newStr = strings[0];
        int count = 0;
        while (count != total) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i] == newStr) {
                    newarr[i] = strings[i];
                    count++;
                }
            }
            for (int i = 0; i < strings.length; i++) {
                if (strings[i] != newStr) {
                    newStr = strings[i];
                }
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
        public static String sorter (String s){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String snew = Arrays.toString(chars);
            for (int i = 0; i<chars.length;i++){
               // snew = chars[i];
            }
            System.out.println(snew);
            return snew;
        }

    }
