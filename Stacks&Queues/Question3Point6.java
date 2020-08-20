import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Question3Point6 {
    public static void main(String arg[]){
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new animal("Henry", "dog"));
        animalShelter.enqueue(new animal("Harry", "cat"));
        animalShelter.toString();
        animalShelter.enqueue(new animal("Arnold", "cat"));
        animalShelter.enqueue(new animal("Hash", "cat"));
        animalShelter.enqueue(new animal("Dijkstra", "dog"));
        animalShelter.enqueue(new animal("Dun", "dog"));
        animalShelter.enqueue(new animal("Ral", "cat"));
        animalShelter.enqueue(new animal("Gen", "dog"));
        animalShelter.enqueue(new animal("Hon", "cat"));
        animalShelter.dequeue();
        animalShelter.dequeueCat();
        animalShelter.dequeueDog();
        animalShelter.dequeueCat();
        animalShelter.dequeueDog();
        animalShelter.dequeue();


    }
    public static class animal{
         String name;
         String species;

         public animal(String n, String s){
            name = n;
             species = s;
         }
    }
    public static class AnimalShelter {
        LinkedList<animal> dogs = new LinkedList<>();
        LinkedList<animal> cats = new LinkedList<>();
        LinkedList<animal> pets = new LinkedList<>();


    public  void enqueue(animal pet){
        if (pet.species == "dog"){
            dogs.push(pet);

        }else if (pet.species == "cat"){
            cats.push(pet);
            System.out.println("CAT");
        }
        pets.push(pet);

    }
    public void dequeue(){
        animal first = pets.get(pets.size()-1);
        System.out.println(first.name);
        pets.remove(pets.size()-1);
        if (first.species=="dog"){
            dogs.remove(dogs.size()-1);
        }
        if (first.species=="cat"){
            cats.remove(cats.size()-1);
        }

    }
    public void dequeueDog() {
        animal first = dogs.get(dogs.size()-1);
        System.out.println(first.name);
        dogs.remove(dogs.size()-1);
        pets.remove(first);
    }
    public  void dequeueCat(){
        animal first = cats.get(cats.size()-1);
        System.out.println(first.name);
        cats.remove(cats.size()-1);
        pets.remove(first);
    }

        @Override
        public String toString() {
            return "AnimalShelter{" +
                    "dogs=" + dogs +
                    ", cats=" + cats +
                    ", pets=" + pets +
                    '}';
        }
    }
}

