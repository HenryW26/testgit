package DesignPattern.ObserverPatternProducerUser;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Product{
    private List<User> followList = new ArrayList<>();
    private int curPrice;
    @Override
    public void setPrice(int price) {
        this.curPrice = price;
        System.out.println("set laptop price:"+price);
        notifyLowPrice();
    }

    @Override
    public int getPrice() {
        return this.curPrice;
    }

    @Override
    public void follow(User user) {
        this.followList.add(user);
    }

    @Override
    public void unfollow(User user) {
        this.followList.remove(user);
    }

    @Override
    public void notifyLowPrice() {
        String msg=""+curPrice;
        for(User user:followList){
            if(user.isExpectedPrice(curPrice)){
                user.shortMSG(msg);
            }
        }
    }

}
