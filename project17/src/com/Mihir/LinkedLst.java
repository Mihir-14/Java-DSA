package com.Mihir;

public class LinkedLst {
    private Node head;
    private Node tail;
    private int size;
    public LinkedLst(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertBetween(int val , int index){
        if (index > size){
            System.out.println("index out of bound");
            return;
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int deleteBetween(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public void insertion(int val , int index){
        head = insertRec(val , index ,head);
    }
    private Node insertRec(int val , int index , Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val , index-- , node.next);
        return node;
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
//    Merge
    public static LinkedLst merge(LinkedLst first , LinkedLst second){
        Node temp1 = first.head;
        Node temp2 = second.head;
        LinkedLst ans = new LinkedLst();
        while (temp1 != null &&  temp2 != null){
            if(temp1.value < temp2.value){
                ans.insertFirst(temp1.value);
                temp1 = temp1.next;
            }else {
                ans.insertFirst(temp2.value);
                temp2 = temp2.next;
            }
        }
        while (temp1 != null){
            ans.insertLast(temp1.value);
            temp1 = temp1.next;
        }
        while (temp2 != null){
            ans.insertLast(temp2.value);
            temp2 = temp2.next;
        }
        return ans;
    }
//    Questions
    public void dubplicate(){
        Node node = head;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
}