package com.Mihir;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(69);
//        stack.push(78);
//        stack.push(5);
//        stack.push(10);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(45);
//        queue.add(7);
//        queue.add(89);
//        queue.add(442);
//        queue.add(444);
//        System.out.println(queue.peek());
//        System.out.println();
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
          Deque<Integer> deque = new ArrayDeque<>();
          deque.add(69);
          deque.addLast(77);
          deque.removeFirst();
        System.out.println(deque);
    }
}