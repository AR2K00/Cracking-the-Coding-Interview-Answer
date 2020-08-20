public class Question7Point4 {
    public static void main(String args[]){

    }
    public class ParkingLot{
        floor[] floors;

        ParkingLot(floor[] f){
            floors = f;
        }
        public void carTake(car carr, space spot){
            carr.took = spot;
            spot.taken=true;
        }
    }
    public class floor{
        int number;
        space[] spaces;

        floor(int n, space[] s){
            number = n;
            spaces = s;
        }
    }
    public class space{
        boolean taken;
        int index;

        space(boolean t, int i){
            taken = t;
            index = i;
        }
    }
    public class car{
        space took;
        people[] passengers;

        car(space t, people[] p){
            took = t;
            passengers = p;
        }
    }
    public class people{
        String name;

        people(String n){
            name = n;
        }
    }

}
