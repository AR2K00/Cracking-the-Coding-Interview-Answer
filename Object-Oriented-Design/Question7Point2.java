import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Question7Point2 {
    public static void main(String[] args) {
        new manager(true);
    }
    public class employeelist{
        ArrayList<employee> employees;

        public ArrayList<employee> getEmployees() {
            return employees;
        }
        public void add(employee e){
            employees.add(e);
        }

        employeelist(ArrayList<employee> e){
            employees = e;
        }
    }
    public static class employee {
        public int priority;
        boolean free = true;


        public employee(boolean f) {
            free = f;
        }
    }
    public static class respondent extends employee{
        int priority = 1;

            public respondent(boolean f){
                super(true);
                free = f;
                priority = 1;
            }
    }
    public static class manager extends employee{
        int priority = 2;
        
        public manager(boolean f){
            super(true);
            free = f;
            priority = 2;
        }
    }
    public static class director extends employee {
        int priority = 3;

        public director(boolean f){
            super(true);
            free = f;
            priority = 3;
        }
    }
    public employee dispatchCall(ArrayList<employee> emp){
        for (int i = 0; i<emp.size();i++){
            if (emp.get(i).priority == 1 && emp.get(i).free == true){
                emp.get(i).free = false;
                return emp.get(i);
            }
        }
        for (int i = 0; i<emp.size();i++){
            if (emp.get(i).priority==2&& emp.get(i).free == true){
                emp.get(i).free = false;
                return emp.get(i);
            }
        }
        for (int i = 0; i<emp.size();i++){
            if (emp.get(i).priority==3&& emp.get(i).free == true){
                emp.get(i).free = false;
                return emp.get(i);
            }
    }
    return null;}}

