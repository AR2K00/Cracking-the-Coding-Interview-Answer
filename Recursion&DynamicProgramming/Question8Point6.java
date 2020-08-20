import java.util.Stack;

public class Question8Point6 {
    public static void main(String args[]){
        int n = 4;
        Tower[] all = new Tower[n];
        for (int i=0;i<3;i++){
            all[i] = new Tower(i);
        }
        for (int i =n-1; i>=0;i--){
            all[0].disks.push(i);
        }
        all[0].moveStack(all[2],all[1], n);
        for (int i = 0;i<all[2].disks.size();i++){
            System.out.print(all[2].disks.pop());
        }
    }
    public static class Tower{
        Stack<Integer> disks;
        int index;
        Tower(int i){
            disks = new Stack<Integer>();
            index=i;
        }
        public int giveIndex(){
            return index;
        }
        public void moveDisk(Tower Moveto){
            int top = disks.pop();
            Moveto.addDisk(top);
        }
        public void addDisk(int d){
            if (disks.size()!=0 && disks.peek()<=d){
                System.out.println("Not gonna work");
            }else{
                disks.push(d);
            }
        }
        public void moveStack(Tower moveTo, Tower mid, int n){
           if (n>0){
               moveStack(moveTo,mid, n-1);
               moveDisk(moveTo);
               mid.moveStack(moveTo,mid, n-1);
           }

        }

    }

}
