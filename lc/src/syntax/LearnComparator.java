package syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {
    /**
     * Entity*/
    static class User{

        String name;
        int age;
        int money;

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public User(String name, int age, int money) {
            this.name = name;
            this.age = age;
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /**
     * define the specified comparator, compared by User's name
     * implements compare() method*/
    static class NameComparator implements Comparator<User>{
        public int compare(User u1,User u2){
            return u1.getName().compareTo(u2.getName());
        }
    }

    /**
     * define another specified comparator, compared by User's age*/
    static class AgeComparator implements Comparator<User>{
        public int compare(User u1,User u2){
            return u1.getAge()-u2.getAge();
        }
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Henry",21,100));
        list.add(new User("Jerry",22,300));
        list.add(new User("Tom",18,200));
        list.add(new User("Bill",19,50));
        for(User u : list){
            System.out.println(u.getName());
        }

        Collections.sort(list,new NameComparator());//sort by name

        for(User u : list){
            System.out.println(u.getName());
        }
        for(User u : list){
            System.out.println(u.getAge());
        }

        Collections.sort(list,new AgeComparator());//sort by age

        for(User u : list){
            System.out.println(u.getAge());
        }

        for(User u : list){
            System.out.println(u.getMoney());
        }

        /**
         * We can also use lambda expression to implements comparator
         * */
        Collections.sort(list,(u1,u2) -> (u1.getMoney()-u2.getMoney()));

        for(User u : list){
            System.out.println(u.getMoney());
        }
    }
}
