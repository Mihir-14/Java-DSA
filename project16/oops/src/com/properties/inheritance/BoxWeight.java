package com.properties.inheritance;

public class BoxWeight extends  Box{
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent constructor
//        used to initialise the values present in parent class
        this.weight = weight;
    }
}
