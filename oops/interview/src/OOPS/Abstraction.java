package OOPS;

public class Abstraction {
    public static void main(String[] args) {

    }
}
class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW welcomes you");
    }
}
class AUDI extends Car{

    @Override
    void start() {
        System.out.println("audi welcomes you");
    }
}
abstract class Car{
    int price;
    abstract void start();

}