package com.Mihir;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue ccqueue = new CircularQueue(5);
        ccqueue.insert(5565);
        ccqueue.insert(545);
        ccqueue.insert(787);
        ccqueue.insert(7995);
        ccqueue.insert(1545);
        ccqueue.display();
        System.out.println(ccqueue.remove());
        ccqueue.insert(133);
        ccqueue.display();
    }
}
