package com.Mihir;

import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue cqueue = new CustomQueue(5);
        cqueue.insert(450);
        cqueue.insert(50);
        cqueue.insert(80);
        cqueue.insert(7979);
        cqueue.insert(525);
        cqueue.display();
        System.out.println(cqueue.remove());
        cqueue.display();
    }
}
