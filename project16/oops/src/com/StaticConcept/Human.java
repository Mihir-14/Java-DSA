package com.StaticConcept;

public class Human {
        int age;
        String name;
        int Salary;
        boolean married;
        static long pop;
//        static variables are common to all, and they do not change with all the new Human created
//        for eg we have here is population since the population remain constant for all the humans in the world

        public Human(int age , String name , int Salary  , boolean married){
            this.age = age;
            this.Salary = Salary;
            this.name = name;
            this.married = married;
            Human.pop += 1;
        }
}
