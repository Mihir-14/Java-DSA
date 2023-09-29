package com.Mihir;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        LinkedLst list = new LinkedLst();
//        list.insertFirst(3);
//        list.insertFirst(45);
//        list.insertFirst(69);
//        list.insertFirst(1);
//        list.insertLast(800);
//        list.display();
//        list.insertBetween(79 , 5);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteBetween(1));
//        list.display();


//        DoublyLinkedLst listD = new DoublyLinkedLst();
//        listD.insertFirst(3);
//        listD.insertFirst(45);
//        listD.insertFirst(69);
//        listD.insertFirst(1);
//        listD.display();
//        listD.insertLast(69);
//        listD.display();
//        listD.insertBetween(3 , 400);
//        listD.display();

        CircularLinkedLst listC = new CircularLinkedLst();
        listC.insert(2);
        listC.insert(3);
        listC.insert(5);
        listC.insert(7);
        listC.display();
        listC.delete(5);
        listC.display();
    }
}
