package DesignPattern.ObserverPatternProducerUser;

public class LaptopBuyer implements User{
    private int expectedPrice;
    private String userName;

    public LaptopBuyer(int expectedPrice, String userName) {
        this.expectedPrice = expectedPrice;
        this.userName = userName;
    }

    @Override
    public boolean isExpectedPrice(int price) {
        return price<=expectedPrice;
    }

    @Override
    public void shortMSG(String msg) {
        System.out.println("Your follow product have a low price: " + msg + " TO:" + userName);
    }
}
