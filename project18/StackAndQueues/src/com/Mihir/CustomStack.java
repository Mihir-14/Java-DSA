package com.Mihir;

public class CustomStack {
    protected int[] data;
    private static final int Default_Size = 10;
    int ptr = -1;

    public CustomStack(){
        this(Default_Size);
    }
    public CustomStack(int size) {
        this.data =new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack out of bound");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return false;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop an Empty Stack!");
        }
//        int remove = data[ptr];
//        ptr--;
//        return remove;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek an Empty Stack!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length -1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
