package com.md.intro;

public class WrapperExample {
    public void main(String[] args) {
//        Not stored in Object
        int a = 10;
        int b =20;
//      Stored in Object
        Integer ab = 10;
        Integer bc =20;
//        final keyword will not allow us to change the value of that integer
//        always initialise it while declaring
//        final int BONUS = 2;
//        BONUS = 3;  this statement will cause error since the bonus is final keyword
        final A mihir = new A("Dudhatra");
//        This is allowed in non-primitive
        mihir.name = "MD";
    }
    class A {
        String name;
        public A(String name){
            this.name = name;
        }
    }
}
