package OOPS;

import Encapsule.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Mihir";
        System.out.println(p1.age + " " + p1.name);
        p1.walk();
        p1.walk(5);


        Person p2 = new Person(31 , "Dudhatra");
        System.out.println(p2.age + " " + p2.name);

        Developer d1 = new Developer(21 , "Web development");


//        Encapsulation abcd = new Encapsulation();
//        abcd.dowork();
    }
    static class Developer extends Person{
        public Developer(int age , String name){
            super(age , name);
        }
    }
    static class Person {
        String name;
        int age;

        public Person(){
            System.out.println("creating an object");
        }
        public Person(int newAge , String newName){
            this();
            name = newName;
            age = newAge;
        }

        void walk(){
            System.out.println(name + " is Walking ");
        }
        void walk(int steps){
            System.out.println(name + " is walking " + steps + " steps");
        }
    }
}