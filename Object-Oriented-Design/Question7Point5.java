import java.awt.print.Book;
import java.util.ArrayList;

public class Question7Point5 {
    public static void main(String args[]){

    }
    public class BookReader{
        ArrayList<book> books;
        ArrayList<user>users;

        BookReader(ArrayList<book> b, ArrayList<user> u){
            books = b;
            users = u;
        }

        public void registerNew(String id, String password){
            users.add(new user(id, password));
        }
        public user login(String id, String password){
            for (user u:users){
                if (u.id == id&& u.password == password){
                    System.out.println("Welcome back"+id);
                    return u;
                }
            }
            System.out.println("Id and password may be incorrect. If you're a new user, register now!");
            return null;
        }
        public book searchbook(String nameof){
            for (book b: books){
                if (b.name == nameof){
                    System.out.println("Here is " + nameof);
                }
            }
            System.out.println("There are no books with that name");
            return null;
        }

        public void addbook(book newbook){
            books.add(newbook);
        }
        public void deletebook(book oldbook){
            books.remove(oldbook);
        }
        public void readbook(book currentbook){
            System.out.println(currentbook.text);
        }

    }
    public class book{
        String name;
        String text;

        book(String n, String t){
            name =n;
            text=t;
        }
    }
    public class user{
        String id;
        String password;

        user(String i, String p){
            id = i;
            password = p;
        }
    }
}
