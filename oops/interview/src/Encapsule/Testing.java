package Encapsule;

public class Testing {
    public static void main(String[] args) {
//        Encapsulation aaa = new Encapsulation();
//        aaa.dowork();
        Laptop l1 = new Laptop();
        l1.setPrice(30000);
        System.out.println(l1.getPrice());
    }

}
class Laptop {
    int ram;
    private int price;
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}