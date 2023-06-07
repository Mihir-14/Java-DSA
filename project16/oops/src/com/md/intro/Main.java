package com.md.intro;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student std1 = new Student(1,"Mihir Dudhatra " , 85.5f);
//        std1.rollno = 1;
//        std1.Name = "Mihir Dudhatra";
//        std1.marks = 35.5f;
        System.out.println(std1.rollno);
        System.out.println(std1.Name);
        System.out.println(std1.marks);
//        Student random = new Student(Mihir);

    }

    static class Student{
        int rollno;
        String Name;
        float marks;

        void greeting() {
            System.out.println("Hello! my name is " + this.Name);
        }
        Student (){
            this.rollno = 1;
            this.Name = "Mihir";
            this.marks = 85;
        }
        Student (Student other){
//            this.Name = other.Name;
//            this.rollno = other.rollno;
//            this.marks = other.marks;

//            this is how you call a constructor from another constructor
//            internally:new Student(111,"Person" , 99.999f)
            this(111,"Person" , 99.999f);
        }
//        Student Mihir = new Student(69 , "Dudhatra" , 88.99f);
//        here,this will be replaced with Mihir
//        Constructor overloading
        Student (int rono , String name , float mark){
            this.rollno = rono;
            this.Name = name;
            this.marks = mark;
        }
    }
}