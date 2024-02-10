import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(5);
        System.out.println(stacks.pop());
    }
}
class QueueUsingStackEff{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackEff(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void push(int item){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek(){
        return first.peek();
    }
}