package com.StaticConcept;

public class Main {
    public static void main(String[] args) {
        Human Mihir = new Human(20 , "Mihir Dudhatra" , 7000000 , false);
        System.out.println(Human.pop);
        Human D= new Human(22 , "Dudhatra" , 70000 , false);
        System.out.println(Human.pop);
        System.out.println(Human.pop);
//        Static variables are not dependent on Objects
    }
}
