package com.properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
//    Cube
    Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }
    Box(double l , double h , double w){
        this.height = h;
        this.width = w;
        this.length = l;
    }
    Box(Box old){
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }
    public void Info() {
        System.out.println("Running the box");
    }
}
