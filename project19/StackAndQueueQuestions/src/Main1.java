import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(5);
        System.out.println(stacks.pop());
    }
}
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void push(int item){
        first.push(item);
    }
    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peek = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }
}