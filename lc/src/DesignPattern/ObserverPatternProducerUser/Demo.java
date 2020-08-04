package DesignPattern.ObserverPatternProducerUser;

public class Demo {
    public static void main(String[] args) {
        LaptopBuyer Alice = new LaptopBuyer(6000,"Alice");
        LaptopBuyer Jack = new LaptopBuyer(6500,"Jack");
        Laptop laptop = new Laptop();
        laptop.follow(Alice);
        laptop.follow(Jack);
        laptop.setPrice(7000);
        laptop.setPrice(6500);
        laptop.setPrice(6000);
        laptop.unfollow(Jack);
        laptop.setPrice(5999);
        laptop.setPrice(6099);
    }
}
